package com.nopCommerce.register;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.nopCommerce.HomePageObject;
import pageObjects.nopCommerce.RegisterPageObject;
import pageObjects.nopCommerce.LoginPageObject;

public class Login extends BaseTest {
	WebDriver driver;
	String emailAddress, password;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
		emailAddress = getRandomEmail();
		password = "123456";
		homePage = new HomePageObject(driver);
		loginPage =  (LoginPageObject) homePage.getMenuToTransferedPageByNameOnTop(driver, "Log in");
	}

	@Test
	public void TC_01_Login_Empty_Data() {
		loginPage.sleepInSecond(3);
		loginPage.clickOnLoginButton();
		Assert.assertTrue(loginPage.isEmptyEmailErrorMessage());
	}
	
	@Test
	public void TC_02_Login_Invalid_Email() {
		loginPage.sleepInSecond(3);
		loginPage.enterToEmailTextbox("helen@123.");
		loginPage.enterToPasswordTextbox(password);
		loginPage.clickOnLoginButton();
		Assert.assertTrue(loginPage.isInvalidEmailErrorMessage());
	}
	
	@Test
	public void TC_03_Login_Not_Exist_Email() {
		loginPage.sleepInSecond(3);
		loginPage.enterToEmailTextbox("helenolala@yahoo.com");
		loginPage.enterToPasswordTextbox(password);
		loginPage.clickOnLoginButton();
		Assert.assertTrue(loginPage.isNotExistEmailErrorMessage());
	}
	
	@Test
	public void TC_04_Login_Registered_Email_Null_Password() {
		registerPage = (RegisterPageObject) loginPage.getMenuToTransferedPageByNameOnTop(driver, "Register");
		Assert.assertTrue(registerPage.isRegisterTitlePageDisplayed());
		registerPage.clicktoGenderMaleRadiobutton();
		registerPage.enterToFirstNameTextbox("Helen");
		registerPage.enterToLastNameTextbox("Nguyen");
		registerPage.enterToEmailTextbox(emailAddress);
		registerPage.enterToPasswordTextbox(password);
		registerPage.enterToConfirmPasswordTextbox(password);
		registerPage.clickOnRegisterButton();
		Assert.assertTrue(registerPage.isRegisterSuccessMessageDisplayed());

		homePage = (HomePageObject) registerPage.getMenuToTransferedPageByNameOnTop(driver, "Log out");
		homePage.sleepInSecond(3);
		loginPage = (LoginPageObject) homePage.getMenuToTransferedPageByNameOnTop(driver, "Log in");
		loginPage.enterToEmailTextbox(emailAddress);
		loginPage.clickOnLoginButton();
		Assert.assertTrue(loginPage.isRegisteredEmailPasswordNull());
	}
	
	@Test
	public void TC_05_Login_Registered_Email_Incorrect_Password() {
		loginPage=(LoginPageObject) loginPage.getMenuToTransferedPageByNameOnTop(driver, "Log in");
		loginPage.sleepInSecond(3);
		loginPage.enterToEmailTextbox(emailAddress);
		loginPage.enterToPasswordTextbox("123654");
		loginPage.clickOnLoginButton();
		Assert.assertTrue(loginPage.isRegisteredEmailIncorrectPassword());
	}
	
	@Test
	public void TC_06_Login_Success() {
		loginPage=(LoginPageObject) loginPage.getMenuToTransferedPageByNameOnTop(driver, "Log in");
		loginPage.sleepInSecond(3);
		loginPage.enterToEmailTextbox(emailAddress);
		loginPage.enterToPasswordTextbox(password);
		loginPage.clickOnLoginButton();
	}

	public String getRandomEmail() {
		Random rand = new Random();
		return "helennguyen" + rand.nextInt(9999) + "@gmail.com";
	}

	public void afterClass() {
		driver.quit();
	}

	RegisterPageObject registerPage;
	HomePageObject homePage;
	LoginPageObject loginPage;
}
