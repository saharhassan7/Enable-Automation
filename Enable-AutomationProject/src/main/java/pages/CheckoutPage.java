package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageBase {
	public CheckoutPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath = "//*[@id=\"first-name\"]")
	WebElement firstName;
	
	@FindBy(xpath = "//*[@id=\"last-name\"]")
	WebElement lastName;
	
	@FindBy(xpath = "//*[@id=\"postal-code\"]")
	WebElement zipCode;
	
	@FindBy(xpath = "//*[@id=\"continue\"]")
	WebElement continueBtn;
	
	@FindBy(xpath = "//*[@id=\"finish\"]")
	WebElement finishBtn;
	
	@FindBy(xpath = "//*[@id=\"cancel\"]")
	WebElement cancelBtn;
	
	@FindBy(xpath = "//h2[contains(text(),'Thank you for your order!')]")
	WebElement successMsg;
	
	@FindBy(xpath = "//h3[contains(text(),'Error: Last Name is required')]")
	WebElement errorMsg;
	
	public void continueToCheckout(String fname, String lname, String code) {
	
		SendText(firstName, fname);
		SendText(lastName, lname);
		SendText(zipCode, code);
		ClickButton(continueBtn);
		ClickButton(finishBtn);
	}
	
	public void orderConfirmationMsg() {
		Dispaly(driver, successMsg);

	}
	
	public void errorMessage(String fname, String lname, String code) {
		SendText(firstName, fname);
		SendText(lastName, lname);
		SendText(zipCode, code);
		ClickButton(continueBtn);
		Dispaly(driver, errorMsg);
	}
}
