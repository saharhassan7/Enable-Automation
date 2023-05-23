package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {


protected WebDriver driver;

//Constructor
public PageBase(WebDriver driver)
{
	
	PageFactory.initElements(driver, this);
	
}

   public void SendText (WebElement element, String text)
    {
        element.clear();
        element.sendKeys(text);
    }

    public void ClickButton (WebElement element)
    {
        element.click();
    }
    
    public void Dispaly(WebDriver driver, WebElement element) {
    	  element.isDisplayed();
    	 }
	}