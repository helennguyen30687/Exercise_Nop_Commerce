package commons;

import org.openqa.selenium.WebDriver;

import pageObjects.nopCommerce.MyAccountCustomerPageObject;
import pageObjects.nopCommerce.MyAccountProductReviewPageObject;
import pageObjects.nopCommerce.ComputerDesktopPageObject;
import pageObjects.nopCommerce.ComputerPageObject;
import pageObjects.nopCommerce.HomePageObject;
import pageObjects.nopCommerce.LoginPageObject;
import pageObjects.nopCommerce.MyAccountAddressPageObject;
import pageObjects.nopCommerce.MyAccountChangePasswordPageObject;
import pageObjects.nopCommerce.RegisterPageObject;

public class PageGeneratorManager {
	private static HomePageObject homePage;
	private static RegisterPageObject registerPage;
	private static LoginPageObject loginPage;
	private static MyAccountCustomerPageObject customerPage;
	private static MyAccountAddressPageObject addressPage;
	private static MyAccountChangePasswordPageObject changePasswordPage;
	private static MyAccountProductReviewPageObject productReviewPage;
	private static ComputerDesktopPageObject computerDesktopPage;
	private static ComputerPageObject computerPage;
	
	private PageGeneratorManager() {
		
	}
	
	public static HomePageObject getHomePage(WebDriver driver) {
		if(homePage == null) {
			homePage = new HomePageObject(driver);
		}
		return homePage;
	}
	
	public static RegisterPageObject getRegisterPage(WebDriver driver) {
		if(registerPage == null) {
			registerPage= new RegisterPageObject(driver);
		}
		return registerPage;
	}
	
	public static LoginPageObject getLoginPage(WebDriver driver) {
		if(loginPage == null) {
			loginPage= new LoginPageObject(driver);
		}
		return loginPage;
	}
	
	public static MyAccountCustomerPageObject getCustomerPage(WebDriver driver) {
		if(customerPage == null) {
			customerPage= new MyAccountCustomerPageObject(driver);
		}
		return customerPage;
	}
	public static  MyAccountAddressPageObject getAddressPage(WebDriver driver) {
		if(addressPage == null) {
			addressPage= new MyAccountAddressPageObject(driver);
		}
		return addressPage;
	}
	public static MyAccountChangePasswordPageObject getChangePasswordPage(WebDriver driver) {
		if(changePasswordPage == null) {
			changePasswordPage= new MyAccountChangePasswordPageObject(driver);
		}
		return changePasswordPage;
	}
	public static MyAccountProductReviewPageObject getProductReviewPage(WebDriver driver) {
		if(productReviewPage == null) {
			productReviewPage= new MyAccountProductReviewPageObject(driver);
		}
		return productReviewPage;
	}
	
	public static ComputerPageObject getComputerPage(WebDriver driver) {
		if(computerPage == null) {
			computerPage= new ComputerPageObject(driver);
		}
		return computerPage;
	}
	
	public static ComputerDesktopPageObject getComputerDesktopPage(WebDriver driver) {
		if(computerDesktopPage == null) {
			computerDesktopPage= new ComputerDesktopPageObject(driver);
		}
		return computerDesktopPage;
	}
}
