package pageObjects.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.nopCommerce.MyAccountCustomerInfoUI;
import pageUIs.nopCommerce.HomePageUI;
import pageUIs.nopCommerce.MyAccountAddressPageUI;
import pageUIs.nopCommerce.RegisterPageUI;

public class MyAccountAddressPageObject extends BasePage{
	private WebDriver driver;

	public MyAccountAddressPageObject(WebDriver driver) {
		this.driver = driver;
	}
	public void clickOnAddNewButton() {
		waitForElementClickable(driver, MyAccountAddressPageUI.ADD_NEW_BUTTON);
		clickToElement(driver, MyAccountAddressPageUI.ADD_NEW_BUTTON);
	}
	
	public void enterToFirstNameTextbox(String firstName) {
		waitForElementVisible(driver, MyAccountAddressPageUI.FIRST_NAME_TEXTBOX);
		sendkeyToElement(driver, MyAccountAddressPageUI.FIRST_NAME_TEXTBOX, firstName);
	}
	public void enterToLastNameTextbox(String lastName) {
		waitForElementVisible(driver, MyAccountAddressPageUI.LAST_NAME_TEXTBOX);
		sendkeyToElement(driver, MyAccountAddressPageUI.LAST_NAME_TEXTBOX, lastName);		
	}
	public void enterToEmailTextbox(String email) {
		waitForElementVisible(driver, MyAccountAddressPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, MyAccountAddressPageUI.EMAIL_TEXTBOX, email);		
	}
	public void selectToCountryTextbox(String country) {
		waitForElementVisible(driver, MyAccountAddressPageUI.COUNTRY_DROPDOWNLIST);
		selectDropdownByText(driver, MyAccountAddressPageUI.COUNTRY_DROPDOWNLIST, country);	
	}
	public void enterToCompanyTextbox(String companyName) {
		waitForElementVisible(driver, MyAccountAddressPageUI.COMPANY_TEXTBOX);
		sendkeyToElement(driver, MyAccountAddressPageUI.COMPANY_TEXTBOX, companyName);		
	}
	public void selectToStateTextbox(String state) {
		waitForElementVisible(driver, MyAccountAddressPageUI.STATE_DRPDOWNLIST);
		selectDropdownByText(driver, MyAccountAddressPageUI.STATE_DRPDOWNLIST, state);
	}
	public void enterToCityTextbox(String city) {
		waitForElementVisible(driver, MyAccountAddressPageUI.CITY_TEXTBOX);
		sendkeyToElement(driver, MyAccountAddressPageUI.CITY_TEXTBOX, city);	
	}
	public void enterToAddress1Textbox(String address1) {
		waitForElementVisible(driver, MyAccountAddressPageUI.ADDRESS1_TEXTBOX);
		sendkeyToElement(driver, MyAccountAddressPageUI.ADDRESS1_TEXTBOX, address1);	
	}
	public void enterToAddress2Textbox(String address2) {
		waitForElementVisible(driver, MyAccountAddressPageUI.ADDRESS2_TEXTBOX);
		sendkeyToElement(driver, MyAccountAddressPageUI.ADDRESS2_TEXTBOX, address2);	
	}
	public void enterToPhoneTextbox(String phoneNumber) {
		waitForElementVisible(driver, MyAccountAddressPageUI.PHONE_NUMBER_TEXTBOX);
		sendkeyToElement(driver, MyAccountAddressPageUI.PHONE_NUMBER_TEXTBOX, phoneNumber);	
	}
	public void enterToZipTextbox(String zipcode) {
		waitForElementVisible(driver, MyAccountAddressPageUI.ZIPCODE_TEXTBOX);
		sendkeyToElement(driver, MyAccountAddressPageUI.ZIPCODE_TEXTBOX, zipcode);	
	}
	public void enterToFaxTextbox(String faxNumber) {
		waitForElementVisible(driver, MyAccountAddressPageUI.FAX_NUMBER_TEXTBOX);
		sendkeyToElement(driver, MyAccountAddressPageUI.FAX_NUMBER_TEXTBOX, faxNumber);	
	}
	public void clickOnSavebutton() {
		waitForElementClickable(driver, MyAccountAddressPageUI.SAVE_BUTTON);
		clickToElement(driver, MyAccountAddressPageUI.SAVE_BUTTON);
	}
	public boolean isTitleUpdated(String fullName) {
		waitForElementVisible(driver, MyAccountAddressPageUI.VERIFY_FULL_NAME_TITLE, fullName);
		return isElementDisplayed(driver, MyAccountAddressPageUI.VERIFY_FULL_NAME_TITLE, fullName);
	}
	public boolean isFullNameUpdated(String fullName) {
		waitForElementVisible(driver, MyAccountAddressPageUI.VERIFY_NAME_COMPANY_ADDRESS12_STATE_COUNTRY, fullName);
		return isElementDisplayed(driver, MyAccountAddressPageUI.VERIFY_NAME_COMPANY_ADDRESS12_STATE_COUNTRY, fullName);
	}
	public boolean isEmailUpdated(String email) {
		waitForElementVisible(driver, MyAccountAddressPageUI.VERIFY_EMAIL_PHONE_FAX_NUMBER, email);
		return isElementDisplayed(driver, MyAccountAddressPageUI.VERIFY_EMAIL_PHONE_FAX_NUMBER, email);
	}
	public boolean isPhoneNumberUpdated(String phoneNumber) {
		waitForElementVisible(driver, MyAccountAddressPageUI.VERIFY_EMAIL_PHONE_FAX_NUMBER, phoneNumber);
		return isElementDisplayed(driver, MyAccountAddressPageUI.VERIFY_EMAIL_PHONE_FAX_NUMBER, phoneNumber);
	}
	public boolean isFaxNumberUpdated(String faxNumber) {
		waitForElementVisible(driver, MyAccountAddressPageUI.VERIFY_EMAIL_PHONE_FAX_NUMBER, faxNumber);
		return isElementDisplayed(driver, MyAccountAddressPageUI.VERIFY_EMAIL_PHONE_FAX_NUMBER, faxNumber);
	}
	public boolean isCompanyNameUpdated(String companyName) {
		waitForElementVisible(driver, MyAccountAddressPageUI.VERIFY_NAME_COMPANY_ADDRESS12_STATE_COUNTRY, companyName);
		return isElementDisplayed(driver, MyAccountAddressPageUI.VERIFY_NAME_COMPANY_ADDRESS12_STATE_COUNTRY, companyName);
	}
	public boolean isAdress1Updated(String address1) {
		waitForElementVisible(driver, MyAccountAddressPageUI.VERIFY_NAME_COMPANY_ADDRESS12_STATE_COUNTRY, address1);
		return isElementDisplayed(driver, MyAccountAddressPageUI.VERIFY_NAME_COMPANY_ADDRESS12_STATE_COUNTRY, address1);
	}
	public boolean isCityZipCodeUpdated(String cityzip) {
		waitForElementVisible(driver, MyAccountAddressPageUI.VERIFY_NAME_COMPANY_ADDRESS12_STATE_COUNTRY, cityzip);
		return isElementDisplayed(driver, MyAccountAddressPageUI.VERIFY_NAME_COMPANY_ADDRESS12_STATE_COUNTRY, cityzip);
	}
	public boolean isAdress2Updated(String address2) {
		waitForElementVisible(driver, MyAccountAddressPageUI.VERIFY_NAME_COMPANY_ADDRESS12_STATE_COUNTRY, address2);
		return isElementDisplayed(driver, MyAccountAddressPageUI.VERIFY_NAME_COMPANY_ADDRESS12_STATE_COUNTRY, address2);
	}
	public boolean isCountryUpdated(String country) {
		waitForElementVisible(driver, MyAccountAddressPageUI.VERIFY_NAME_COMPANY_ADDRESS12_STATE_COUNTRY, country);
		return isElementDisplayed(driver, MyAccountAddressPageUI.VERIFY_NAME_COMPANY_ADDRESS12_STATE_COUNTRY, country);
	}

}
