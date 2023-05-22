package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductPage;

public class CheckoutTC3 extends TestBase{

	LoginPage loginPage;
	ProductPage productPage;
	CheckoutPage checkoutPage;
	
	@DataProvider(name = "loginData")
	public static Object[][] loginData(){
		return new Object[][]
				{
					{"problem_user","secret_sauce"}};
				}
	
	
	@DataProvider(name = "checkoutData")
	public static Object[][] CheckoutData(){
		return new Object[][]
				{
					{"Sahar", "Hassan", "454545"}};
				}
	
	@Test(dataProvider="loginData", priority = 1)
	public void Login(String user, String pswd) throws InterruptedException {
		loginPage = new LoginPage(driver);
		loginPage.Login(user, pswd);
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 2)
	public void addToCart() throws InterruptedException {
		productPage = new ProductPage(driver);
		productPage.addOneProduct();
	}
	
	@Test(dataProvider="checkoutData", priority = 3)
	public void Checkout(String fname, String lname, String code) throws InterruptedException {
		checkoutPage = new CheckoutPage(driver);
		checkoutPage.errorMessage(fname, lname, code);

	}
	
}

