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

public class Register extends BaseTest {
	WebDriver driver;
	public static String emailAddress, password;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
		emailAddress = getRandomEmail();
		password = "123456";
		homePage = new HomePageObject(driver);
	}

	@Test
	public void TC_01_Register_Empty_Data() {
		Assert.assertTrue(homePage.isHomePageSliderDisplayed());
		registerPage = homePage.clickToRegisterLink();
		registerPage.clickOnRegisterButton();
		Assert.assertTrue(registerPage.isEmptyFirstNameErrorMessage());
		Assert.assertTrue(registerPage.isEmptyLastNameErrorMessage());
		Assert.assertTrue(registerPage.isEmptyEmailErrorMessage());
		Assert.assertTrue(registerPage.isEmptyPasswordErrorMessage());
		Assert.assertTrue(registerPage.isEmptyConfirmPasswordErrorMessage());
	}
	@Test
	public void TC_02_Register_Invalid_Email() {
		registerPage.clickOnRegisterLink();
		Assert.assertTrue(registerPage.isRegisterTitlePageDisplayed());
		registerPage = homePage.clickToRegisterLink();
		registerPage.clicktoGenderMaleRadiobutton();
		registerPage.enterToFirstNameTextbox("Helen");
		registerPage.enterToLastNameTextbox("Nguyen");
		registerPage.enterToEmailTextbox("helen@123456");
		registerPage.enterToPasswordTextbox(password);
		registerPage.enterToConfirmPasswordTextbox(password);
		registerPage.clickOnRegisterButton();
		Assert.assertTrue(registerPage.isRegisterInvalidEmailErrorMessage());
	}
	@Test
	public void TC_03_Register_Exist_Email() {
		registerPage.clickOnRegisterLink();
		Assert.assertTrue(registerPage.isRegisterTitlePageDisplayed());
		
		registerPage.clicktoGenderMaleRadiobutton();
		registerPage.enterToFirstNameTextbox("Helen");
		registerPage.enterToLastNameTextbox("Nguyen");
		registerPage.enterToEmailTextbox(emailAddress);
		registerPage.enterToPasswordTextbox(password);
		registerPage.enterToConfirmPasswordTextbox(password);
		registerPage.clickOnRegisterButton();
		
		registerPage.clickToLogOutLink();
		Assert.assertTrue(homePage.isHomePageSliderDisplayed());
		registerPage = homePage.clickToRegisterLink();
		registerPage.clicktoGenderMaleRadiobutton();
		registerPage.enterToFirstNameTextbox("Helen");
		registerPage.enterToLastNameTextbox("Nguyen");
		registerPage.enterToEmailTextbox(emailAddress);
		registerPage.enterToPasswordTextbox(password);
		registerPage.enterToConfirmPasswordTextbox(password);
		registerPage.clickOnRegisterButton();
		Assert.assertTrue(registerPage.isExistEmailErrorMessage());
		
	}
	
	@Test
	public void TC_04_Register_Password_Less_6_Characters() {
		registerPage.clickOnRegisterLink();
		Assert.assertTrue(registerPage.isRegisterTitlePageDisplayed());
		registerPage.clicktoGenderMaleRadiobutton();
		registerPage.enterToFirstNameTextbox("Helen");
		registerPage.enterToLastNameTextbox("Nguyen");
		registerPage.enterToEmailTextbox(emailAddress);
		registerPage.enterToPasswordTextbox("123");
		registerPage.enterToConfirmPasswordTextbox("123");
		registerPage.clickOnRegisterButton();
		Assert.assertTrue(registerPage.isPasswordLessSixCharacterErrorMessage());
	}
	
	@Test
	public void TC_05_Register_Confirm_Password_Not_Match_Password() {
		registerPage.clickOnRegisterLink();
		Assert.assertTrue(registerPage.isRegisterTitlePageDisplayed());
		registerPage.clicktoGenderMaleRadiobutton();
		registerPage.enterToFirstNameTextbox("Helen");
		registerPage.enterToLastNameTextbox("Nguyen");
		registerPage.enterToEmailTextbox(emailAddress);
		registerPage.enterToPasswordTextbox(password);
		registerPage.enterToConfirmPasswordTextbox("123457");
		registerPage.clickOnRegisterButton();
		Assert.assertTrue(registerPage.isConfirmPasswordNotMatchPasswordErrorMessage());
	}
	
	@Test
		public void TC_06_Register_Success() {
		emailAddress = getRandomEmail();
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
