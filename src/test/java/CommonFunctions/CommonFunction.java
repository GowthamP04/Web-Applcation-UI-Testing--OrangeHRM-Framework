package CommonFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class CommonFunction {

	public static WebDriver driver = null;
	public static Properties properties = null;
	
	static Logger logger = Logger.getLogger(CommonFunction.class);
	
	public Properties loadPropertyFile() throws IOException {
		
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\config.properties");
		 properties = new Properties();
		properties.load(fileInputStream);
		
		return properties;
	}
	
	@BeforeSuite
	public void launchBrowser() throws IOException {
		
		PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\test\\java\\Log4j.properties");
		
		logger.info("Orange HRM Test Begins");
		logger.info("Loading the property file");
		
		loadPropertyFile();
		
		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			logger.info("Launching Chrome");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			
			logger.info("Launching Edge");
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		logger.info("Navigating to Application");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterSuite
	public void tearDown() {
		
		logger.info("Execution done closing the browser");
		driver.quit();
	}
}
