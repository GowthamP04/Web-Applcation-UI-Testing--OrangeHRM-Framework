package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoard_Page_Object {

	@FindBy(xpath = "//p[text()='No Employees are on Leave Today']")
	public static WebElement EmployeesareonLeave;
	
	
}
