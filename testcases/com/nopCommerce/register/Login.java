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

	}

	@Test
	public void TC_01_Login_Empty_Data() {
		loginPage = homePage.clickOnLoginLink();
		loginPage.sleepInSecond(3);
		loginPage.clickOnLoginButton();
		Assert.assertTrue(loginPage.isEmptyEmailErrorMessage());
	}

	@Test
	public void TC_06_Login_Success() {
		registerPage = new RegisterPageObject(driver);
		registerPage.clickOnRegisterLink();
		Assert.assertTrue(registerPage.isRegisterTitlePageDisplayed());
		registerPage.clicktoGenderMaleRadiobutton();
		registerPage.enterToFirstNameTextbox("Helen");
		registerPage.enterToLastNameTextbox("Nguyen");
		registerPage.enterToEmailTextbox(emailAddress);
		registerPage.enterToPasswordTextbox(password);
		registerPage.enterToConfirmPasswordTextbox(password);
		registerPage.clickOnRegisterButton();
		Assert.assertTrue(registerPage.isRegisterSuccessMessageDisplayed());

		homePage = registerPage.clickToLogOutLink();
		homePage.sleepInSecond(3);
		homePage.clickOnLoginLink();
		homePage.sleepInSecond(3);
		homePage.enterDataToEmailTextbox(emailAddress);
		homePage.enterDataToPasswordTextbox(password);
		homePage.clickOnLoginButton();
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
}
