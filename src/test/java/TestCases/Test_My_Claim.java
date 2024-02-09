package TestCases;

import java.awt.AWTException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import CommonFunctions.CommonFunction;
import PageObjectModel.DashBoard_Page_Object;
import PageObjectModel.My_Claim_Page_Object;
import PageObjectModel.User_Role_Page_Object;

public class Test_My_Claim extends CommonFunction {
	
	static Logger logger = Logger.getLogger(Test_My_Claim.class);
	
	public void claim() throws InterruptedException {
		
		
		My_Claim_Page_Object.claim.click();
		My_Claim_Page_Object.Assignclaim.click();
		My_Claim_Page_Object.employeename.sendKeys("Dominic  Chase");
		Thread.sleep(2000);
		My_Claim_Page_Object.employeenameDropDown.click();
		
	}
		public void selectEvent() {
			
			My_Claim_Page_Object.event.click();
//			Select event = new Select(My_Claim_Page_Object.TravelAllowance);
//			event.selectByVisibleText("Travel Allowance");
			My_Claim_Page_Object.TravelAllowance.click();
			
			
		}
		
		 public void selectcurrency() {
			 
			 My_Claim_Page_Object.Currency.click();
				//Select selectcurrency = new Select(My_Claim_Page_Object.selectcurrency);
				//selectcurrency.selectByVisibleText("Afghanistan Afghani");
			 My_Claim_Page_Object.selectcurrency.click();
			}
	

	@Test
	public void checkClaim() throws InterruptedException, AWTException {
		
		PageFactory.initElements(driver, My_Claim_Page_Object.class);
		
		logger.info("Navigating to claim page");
		claim();
		logger.info("selecting the selectEvent");
		selectEvent();
		logger.info("selecting the selectcurrency");
		selectcurrency();
		
		My_Claim_Page_Object.create.click();
		
		Test_Assign_claim assign_claim = new Test_Assign_claim(driver);
//		Thread.sleep(2000);
//		Test_Assign_claim.assignclaim();
	}
	}


