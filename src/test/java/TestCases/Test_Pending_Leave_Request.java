package TestCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import CommonFunctions.CommonFunction;
import PageObjectModel.DashBoard_Page_Object;
import PageObjectModel.Login_Page_Object;

public class Test_Pending_Leave_Request extends CommonFunction{

	String actualMessage = null;
	
	static Logger logger = Logger.getLogger(Test_Pending_Leave_Request.class);
	
	public void login() {
		
		logger.info("Logging in to the application");
		
		PageFactory.initElements(driver, Login_Page_Object.class);
		
		Login_Page_Object.username.sendKeys(properties.getProperty("username"));
		Login_Page_Object.password.sendKeys(properties.getProperty("password"));
		Login_Page_Object.loginbtn.click();
		
	}
	
	public void getEmployeesonLeave() {
		
		PageFactory.initElements(driver, DashBoard_Page_Object.class);
		
		 actualMessage = DashBoard_Page_Object.EmployeesareonLeave.getText();
		
	}
	@Test
	public void Employees_on_Leave() {
		
		login();
		logger.info("Getting the employees on leave details");
		getEmployeesonLeave();
		logger.info("verification");
		
		Assert.assertEquals(actualMessage, "No Employees are on Leave Today");
		logger.info("End of employees on leave today test case");
	}
}
