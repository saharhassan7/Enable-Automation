package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"user-name\"]")
	WebElement userName;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement passwrod;
	
	@FindBy(xpath = "//*[@id=\"login-button\"]")
	WebElement loginBtn;
	
	public void Login(String user , String pswd) throws InterruptedException {
		SendText(userName, user);
		SendText(passwrod, pswd);
		ClickButton(loginBtn);
		Thread.sleep(2000);
	}

}
