package com.nopCommerce.register;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.nopCommerce.MyAccountCustomerPageObject;
import pageObjects.nopCommerce.MyAccountProductReviewPageObject;
import pageObjects.nopCommerce.ComputerDesktopPageObject;
import pageObjects.nopCommerce.ComputerPageObject;
import pageObjects.nopCommerce.HomePageObject;
import pageObjects.nopCommerce.RegisterPageObject;
import pageObjects.nopCommerce.LoginPageObject;
import pageObjects.nopCommerce.MyAccountAddressPageObject;
import pageObjects.nopCommerce.MyAccountChangePasswordPageObject;

public class MyAccount extends BaseTest {
	WebDriver driver;
	String emailAddress, password,emailUpdate;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
		emailAddress = getRandomEmail();
		emailUpdate = "automation" + emailAddress;
		password = "123456";
		homePage = new HomePageObject(driver);

		registerPage = (RegisterPageObject) homePage.getMenuToTransferedPageByNameOnTop(driver, "Register");
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
		loginPage = (LoginPageObject) homePage.getMenuToTransferedPageByNameOnTop(driver, "Log in");
		loginPage.sleepInSecond(3);
		loginPage.enterToEmailTextbox(emailAddress);
		loginPage.enterToPasswordTextbox(password);
		loginPage.clickOnLoginButton();
	}

	@Test
	public void TC_01_Update_Customer_Info() {
		String firstName = "Automation", lastName = "FC",  companyName = "Automation FC",
				dateOfBirth = "1", monthOfBirth = "January", yearOfBirth = "1999";
		customerPage = (MyAccountCustomerPageObject) homePage.getMenuToTransferedPageByNameOnTop(driver, "My account");
		customerPage.clickToGenderFemaleRadioButton();
		customerPage.enterToFirstNameTextbox(firstName);
		customerPage.enterToLastNameTextbox(lastName);
		customerPage.selectToDateDropdownlist(dateOfBirth);
		customerPage.selectToMonthDropdownlist(monthOfBirth);
		customerPage.selectToYearDropdownlist(yearOfBirth);
		customerPage.enterToEmailTextbox(emailUpdate);
		customerPage.enterToCompanyNameTextbox(companyName);
		customerPage.clickToSavebutton();
		customerPage.sleepInSecond(3);
		Assert.assertTrue(customerPage.isGenderFemaleSelected());
		Assert.assertTrue(customerPage.isFirstLastEmailCompanyNameUpdated(firstName));
		Assert.assertTrue(customerPage.isFirstLastEmailCompanyNameUpdated(lastName));
		Assert.assertTrue(customerPage.isDateUpdated(dateOfBirth));
		Assert.assertTrue(customerPage.isMonthUpdated(monthOfBirth));
		Assert.assertTrue(customerPage.isYearUpdated(yearOfBirth));
		Assert.assertTrue(customerPage.isFirstLastEmailCompanyNameUpdated(emailUpdate));
		Assert.assertTrue(customerPage.isFirstLastEmailCompanyNameUpdated(companyName));
	}

	@Test
	public void TC_02_Add_Address_Info() {
		String firstName = "Automation", lastName = "FC", fullName = firstName + " " + lastName, email = "automation" + getRandomEmail(),
				companyName = "Automation FC", country = "Viet Nam", state = "Other", city = "Da Nang", zipcode = "550000",
				cityzip = city + ", " + zipcode, address1 = "123/04 Le Lai", address2 = "234/ 05 Hai Phong", phoneNumber = "123456789",
				faxNumber = "0988988988";
		addressPage = (MyAccountAddressPageObject) customerPage.getMenuPageByNameInMyAccount(driver, "Addresses");
		addressPage.clickOnAddNewButton();
		addressPage.sleepInSecond(2);
		addressPage.enterToFirstNameTextbox(firstName);
		addressPage.enterToLastNameTextbox(lastName);
		addressPage.enterToEmailTextbox(email);
		addressPage.selectToCountryTextbox(country);
		addressPage.enterToCompanyTextbox(companyName);
		addressPage.selectToStateTextbox(state);
		addressPage.enterToCityTextbox(city);
		addressPage.enterToAddress1Textbox(address1);
		addressPage.enterToAddress2Textbox(address2);
		addressPage.enterToZipTextbox(zipcode);
		addressPage.enterToPhoneTextbox(phoneNumber);
		addressPage.enterToFaxTextbox(faxNumber);
		addressPage.clickOnSavebutton();
		addressPage.sleepInSecond(2);
		Assert.assertTrue(addressPage.isTitleUpdated(fullName));
		Assert.assertTrue(addressPage.isFullNameUpdated(fullName));
		Assert.assertTrue(addressPage.isEmailUpdated(email));
		Assert.assertTrue(addressPage.isPhoneNumberUpdated(phoneNumber));
		Assert.assertTrue(addressPage.isFaxNumberUpdated(faxNumber));
		Assert.assertTrue(addressPage.isCompanyNameUpdated(companyName));
		Assert.assertTrue(addressPage.isAdress1Updated(address1));
		Assert.assertTrue(addressPage.isAdress2Updated(address2));
		Assert.assertTrue(addressPage.isCityZipCodeUpdated(cityzip));
		Assert.assertTrue(addressPage.isCountryUpdated(country));
	}

	@Test
	public void TC_03_Change_Password() {
		String passwordNew="123123";
		changePasswordPage = (MyAccountChangePasswordPageObject) addressPage.getMenuPageByNameInMyAccount(driver, "Change password");
		changePasswordPage.enterToOldPasswordTextbox(password);
		changePasswordPage.enterToNewPasswordTextbox(passwordNew);
		changePasswordPage.enterToConfirmPasswordTextbox(passwordNew);
		changePasswordPage.clickOnChangePasswordButton();
		changePasswordPage.clickToCloseBarNoti();
		changePasswordPage.sleepInSecond(3);
		homePage = (HomePageObject) changePasswordPage.getMenuToTransferedPageByNameOnTop(driver, "Log out");
		loginPage = (LoginPageObject) homePage.getMenuToTransferedPageByNameOnTop(driver, "Log in");
		loginPage.enterToEmailTextbox(emailUpdate);
		loginPage.enterToPasswordTextbox(password);
		loginPage.clickOnLoginButton();
		Assert.assertTrue(loginPage.isRegisteredEmailIncorrectPassword());
		
		loginPage = (LoginPageObject) homePage.getMenuToTransferedPageByNameOnTop(driver, "Log in");
		loginPage.enterToEmailTextbox(emailUpdate);
		loginPage.enterToPasswordTextbox(passwordNew);
		loginPage.clickOnLoginButton();
	}
	
//	@Test
	public void TC_04_My_Product_Review() {
//		computerPage = (ComputerPageObject) loginPage.getMenuPageByNameOnHeader(driver, "Computers");
//		computerPage.sleepInSecond(3);
//		computerDeskTopPage = (ComputerDesktopPageObject) computerPage.getSubMenuPageByNameInComputerMenu(driver, "Desktops");
//		computerDeskTopPage.clickToProductLink();
//		computerDeskTopPage.clickToAddReviewLink();
//		computerDeskTopPage.enterToReviewTitleTextbox("");
//		computerDeskTopPage.enterToReviewTextTextbox("");
//		homePage.selectToRatingRadiobutton();
//		homePage.clickToSubmitButton();
		
	}
	
	
	public String getRandomEmail() {
		Random rand = new Random();
		return "helennguyen" + rand.nextInt(9999) + "@gmail.com";
	}
	
//	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	RegisterPageObject registerPage;
	HomePageObject homePage;
	LoginPageObject loginPage;
	MyAccountCustomerPageObject customerPage;
	MyAccountAddressPageObject addressPage;
	MyAccountChangePasswordPageObject changePasswordPage;
	MyAccountProductReviewPageObject productReviewPage;
	ComputerPageObject computerPage;
	ComputerDesktopPageObject computerDeskTopPage;
}
