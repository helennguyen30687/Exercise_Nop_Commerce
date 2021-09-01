package pageObjects.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.nopCommerce.MyAccountCustomerInfoUI;
import pageUIs.nopCommerce.HomePageUI;
import pageUIs.nopCommerce.RegisterPageUI;

public class MyAccountProductReviewPageObject extends BasePage{
	private WebDriver driver;

	public MyAccountProductReviewPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToGenderFemaleRadioButton() {
		waitForElementClickable(driver, MyAccountCustomerInfoUI.GENDER_FEMALE_RADIO);
		clickToElement(driver, MyAccountCustomerInfoUI.GENDER_FEMALE_RADIO);

	}

	public void enterToFirstNameTextbox(String value) {
		waitForElementVisible(driver, MyAccountCustomerInfoUI.FIRST_NAME_TEXTBOX);
		sendkeyToElement(driver, MyAccountCustomerInfoUI.FIRST_NAME_TEXTBOX, value);
	}

	public void enterToLastNameTextbox(String value) {
		waitForElementVisible(driver, MyAccountCustomerInfoUI.LAST_NAME_TEXTBOX);
		sendkeyToElement(driver, MyAccountCustomerInfoUI.LAST_NAME_TEXTBOX, value);
	}

	public void enterToDateDropdownlist(String value) {
		waitForElementVisible(driver, MyAccountCustomerInfoUI.DAY_BIRTHDAY_DROPDOWNLIST);
		selectDropdownByText(driver, MyAccountCustomerInfoUI.DAY_BIRTHDAY_DROPDOWNLIST, value);
	}

	public void enterToMonthDropdownlist(String value) {
		waitForElementVisible(driver, MyAccountCustomerInfoUI.MONTH_BIRTHDAY_DROPDOWNLIST);
		selectDropdownByText(driver, MyAccountCustomerInfoUI.MONTH_BIRTHDAY_DROPDOWNLIST, value);
	}

	public void enterToYearDropdownlist(String value) {
		waitForElementVisible(driver, MyAccountCustomerInfoUI.YEAR_BIRTHDAY_DROPDOWNLIST);
		selectDropdownByText(driver, MyAccountCustomerInfoUI.YEAR_BIRTHDAY_DROPDOWNLIST, value);
	}

	public void enterToEmailTextbox(String value) {
		waitForElementVisible(driver, MyAccountCustomerInfoUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, MyAccountCustomerInfoUI.EMAIL_TEXTBOX, value);
	}

	public void enterToCompanyNameTextbox(String value) {
		waitForElementVisible(driver, MyAccountCustomerInfoUI.COMPANY_NAME_TEXTBOX);
		sendkeyToElement(driver, MyAccountCustomerInfoUI.COMPANY_NAME_TEXTBOX, value);
	}

	public void clickToSavebutton() {
		waitForElementClickable(driver, MyAccountCustomerInfoUI.SAVE_BUTTON);
		clickToElement(driver, MyAccountCustomerInfoUI.SAVE_BUTTON);
	}

	public boolean isGenderFemaleSelected() {
		waitForElementVisible(driver, MyAccountCustomerInfoUI.GENDER_FEMALE_RADIO);
		return isElementSelected(driver, MyAccountCustomerInfoUI.GENDER_FEMALE_RADIO);
	}

	public boolean isFirstLastEmailCompanyNameUpdated(String value) {
		waitForElementVisible(driver, MyAccountCustomerInfoUI.FIRST_LAST_EMAIL_COMPANY_UPDATED_TEXTBOX, value);
		return isElementDisplayed(driver, MyAccountCustomerInfoUI.FIRST_LAST_EMAIL_COMPANY_UPDATED_TEXTBOX, value);
	}

	public boolean isDateUpdated(String dateOfBirth) {
		waitForElementVisible(driver, MyAccountCustomerInfoUI.DATE_UPDATED_DROPDOWNLIST, dateOfBirth);
		return isElementDisplayed(driver, MyAccountCustomerInfoUI.DATE_UPDATED_DROPDOWNLIST, dateOfBirth);
	}

	public boolean isMonthUpdated(String monthOfBirth) {
		waitForElementVisible(driver, MyAccountCustomerInfoUI.MONTH_BIRTHDAY_DROPDOWNLIST,monthOfBirth);
		return isElementDisplayed(driver, MyAccountCustomerInfoUI.MONTH_BIRTHDAY_DROPDOWNLIST, monthOfBirth);
	}

	public boolean isYearUpdated(String yearOfBirth) {
		waitForElementVisible(driver, MyAccountCustomerInfoUI.MONTH_BIRTHDAY_DROPDOWNLIST,yearOfBirth);
		return isElementDisplayed(driver, MyAccountCustomerInfoUI.MONTH_BIRTHDAY_DROPDOWNLIST, yearOfBirth);
	}

}
