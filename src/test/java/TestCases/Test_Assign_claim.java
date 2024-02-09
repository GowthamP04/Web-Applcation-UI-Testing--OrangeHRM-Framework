package TestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import CommonFunctions.CommonFunction;
import PageObjectModel.Assign_claim_Page_object;
import PageObjectModel.User_Role_Page_Object;

public class Test_Assign_claim {//extends CommonFunction {
	
	WebDriver driver;
	
	public Test_Assign_claim(WebDriver driver) {
		
		this.driver = driver;
	}


	static Logger logger = Logger.getLogger(Test_Assign_claim.class);

	public  void Attachments() throws AWTException {
		
		Assign_claim_Page_object.Attachments.click();
		//driver.findElement(By.xpath("(//*[text()=' Add '])[2]")).click();
		
	}
	
	public  void addAttachment() throws AWTException {
		
		Assign_claim_Page_object.browse.click();
		
		StringSelection selection = new StringSelection("C:\\Users\\GO20382992\\Downloads\\sample.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("file is uploaded");
		
		Assign_claim_Page_object.save.click();
		
	}
	
	@Test
	public  void assignclaim() throws AWTException {
		
		logger.info("Navigating to assign claim page");
		Attachments();
		
		logger.info("Upload the docunment");
		addAttachment();
		
		Assign_claim_Page_object.submit.click();
	}

}
