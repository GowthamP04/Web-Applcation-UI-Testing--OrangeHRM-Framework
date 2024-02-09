package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class My_Claim_Page_Object {

	@FindBy(xpath  = "//span[text()='Claim']")
	public static WebElement claim;
	
	@FindBy(xpath  = "//*[text()=' Assign Claim ']")
	public static WebElement Assignclaim;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
//	@FindBy(xpath = "//div[@role='listbox']")
	public static WebElement employeename;
	
	
	@FindBy(xpath = "//div[@role='listbox']")
	public static WebElement employeenameDropDown;
	
	
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
	public static WebElement event;
	
	//.oxd-select-text--error
//	@FindBy(css  = ".oxd-select-text--error")
//	public static WebElement event;
	
	
	@FindBy(xpath = "//*[text()='Travel Allowance']")
	public static WebElement TravelAllowance;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
	public static WebElement Currency;
	
	@FindBy(xpath = "//*[text()='Afghanistan Afghani']")
	public static WebElement selectcurrency;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement create;
}
