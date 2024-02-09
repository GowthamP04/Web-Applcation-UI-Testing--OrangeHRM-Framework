package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User_Role_Page_Object {
	
	@FindBy(xpath = "//span[text()='Admin']")
	public static WebElement admin;
	
	@FindBy(xpath = "//span[text()='User Management ']")
	public static WebElement userManagement;
	
	@FindBy(xpath = "//a[text()='Users']")
	public static WebElement users;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement searchbutton;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
	public static WebElement userRole;
	
	//@FindBy(xpath = "//*[@class='oxd-select-text-input'][text()='Admin']")
	//div[@role='listbox']//*[text()='Admin']
	@FindBy(xpath = "//div[@role='listbox']//*[text()='Admin']")
	public static WebElement adminoption;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
	public static WebElement status;
	
	//@FindBy(xpath = "//*[@class='oxd-select-text-input'][text()='Enabled']")
	@FindBy(xpath = "//div[@role='listbox']//*[text()='Enabled']")
	public static WebElement enabledoption;
	
	@FindBy(xpath = "(//div[text()='Admin'])[2]")
	public static WebElement userRoleValue;
	
	@FindBy(xpath = "(//div[text()='Enabled'])[2]")
	public static WebElement userStatusValue;

}
