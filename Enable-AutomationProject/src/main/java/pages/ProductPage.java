package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageBase{

	public ProductPage( WebDriver driver) 
	
	{
		super(driver);
	}
	
	
	@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement product1;
	
	@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
	WebElement product2;
	
	@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
	WebElement product3;
	
	@FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
	WebElement shoppingCart;
	
	@FindBy(xpath = "//*[@id=\"checkout\"]")
	WebElement checkoutBtn;
	
	
	public void addOneProduct() throws InterruptedException {
		ClickButton(product1);
		Thread.sleep(1000);
		ClickButton(shoppingCart);
		Thread.sleep(1000);
		ClickButton(checkoutBtn);
		Thread.sleep(1000);
		
	}
	public void addThreeProducts() throws InterruptedException {
		ClickButton(product1);
		ClickButton(product2);
		ClickButton(product3);
		Thread.sleep(1000);
		ClickButton(shoppingCart);
		Thread.sleep(1000);
		ClickButton(checkoutBtn);
		Thread.sleep(1000);
	
}}
