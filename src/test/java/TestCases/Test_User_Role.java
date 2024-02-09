package TestCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import CommonFunctions.CommonFunction;
import PageObjectModel.DashBoard_Page_Object;
import PageObjectModel.User_Role_Page_Object;

public class Test_User_Role extends CommonFunction{
	
	static Logger logger = Logger.getLogger(Test_User_Role.class);

	public void userManagement() {
		
		User_Role_Page_Object.admin.click();
		User_Role_Page_Object.userManagement.click();
		User_Role_Page_Object.users.click();
		
	}
	
	public void selectUserRole() {
		
		User_Role_Page_Object.userRole.click();
		User_Role_Page_Object.adminoption.click();
		//Select selectrole = new Select(User_Role_Page_Object.userRole);
		//selectrole.selectByVisibleText("Admin");
	}
	 public void selectStatus() {
		
		 User_Role_Page_Object.status.click();
		 User_Role_Page_Object.enabledoption.click();
		//Select selectstatus = new Select(User_Role_Page_Object.status);
		//selectstatus.selectByVisibleText("Enabled");
		
	}
	@Test
	public void checkUserRole() {
		

		PageFactory.initElements(driver, User_Role_Page_Object.class);
		
		logger.info("Navigating to userManagement page");
		userManagement();
		logger.info("selecting the UserRole");
		selectUserRole();
		logger.info("selecting the Status");
		selectStatus();
		User_Role_Page_Object.searchbutton.click();
		
		String actualRole = User_Role_Page_Object.userRoleValue.getText();
		String actualStatus = User_Role_Page_Object.userStatusValue.getText();
		
		logger.info("Verifying the results");
		Assert.assertEquals(actualRole, "Admin");
		Assert.assertEquals(actualStatus, "Enabled");
		logger.info("End of Test user page object test case");
	}
}
