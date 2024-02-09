package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page_Object {

	@FindBy(name  = "username")
	public static WebElement username;
	
	@FindBy(name = "password")
	public static WebElement password;
	
	@FindBy(xpath = "//button[text()=' Login ']")
	public static WebElement loginbtn;
}
