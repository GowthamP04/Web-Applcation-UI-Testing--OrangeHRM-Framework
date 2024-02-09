package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Assign_claim_Page_object {

	
	@FindBy(xpath  = "(//*[text()=' Add '])[2]")
	public static WebElement Attachments;
	
	@FindBy(xpath  = "//button[text()=' Submit ']")
	public static WebElement submit;
	
	@FindBy(xpath  = "//div[@class='oxd-file-button']")
	public static WebElement browse;
	
	@FindBy(xpath  = "//button[@type='submit']")
	public static WebElement save;
}
