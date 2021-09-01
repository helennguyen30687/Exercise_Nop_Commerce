package pageObjects.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.nopCommerce.RegisterPageUI;

public class RegisterPageObject extends BasePage {
	private WebDriver driver;

	public RegisterPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnRegisterButton() {
		waitForElementVisible(driver, RegisterPageUI.REGISTER_BUTTON);
		clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
	}

	public void clicktoGenderMaleRadiobutton() {
		waitForElementVisible(driver, RegisterPageUI.GENDER_MALE_RADIO);
		clickToElement(driver, RegisterPageUI.GENDER_MALE_RADIO);
	}

	public void enterToFirstNameTextbox(String value) {
		waitForElementVisible(driver, RegisterPageUI.FIRST_NAME_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.FIRST_NAME_TEXTBOX, value);
	}

	public void enterToLastNameTextbox(String value) {
		waitForElementVisible(driver, RegisterPageUI.LAST_NAME_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.LAST_NAME_TEXTBOX, value);
	}

	public void enterToEmailTextbox(String value) {
		waitForElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, value);
	}

	public void enterToPasswordTextbox(String value) {
		waitForElementVisible(driver, RegisterPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, value);
	}

	public void enterToConfirmPasswordTextbox(String value) {
		waitForElementVisible(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX, value);
	}

	public void clickOnRegisterLink() {
		waitForElementVisible(driver, RegisterPageUI.REGISTER_LINK);
		clickToElement(driver, RegisterPageUI.REGISTER_LINK);
	}

	public boolean isEmptyFirstNameErrorMessage() {
		waitForElementVisible(driver, RegisterPageUI.FIRST_NAME_ERROR_MESSAGE);
		return isElementDisplayed(driver, RegisterPageUI.FIRST_NAME_ERROR_MESSAGE);
	}

	public boolean isEmptyLastNameErrorMessage() {
		waitForElementVisible(driver, RegisterPageUI.LAST_NAME_ERROR_MESSAGE);
		return isElementDisplayed(driver, RegisterPageUI.LAST_NAME_ERROR_MESSAGE);
	}

	public boolean isEmptyEmailErrorMessage() {
		waitForElementVisible(driver, RegisterPageUI.EMAIL_ERROR_MESSAGE);
		return isElementDisplayed(driver, RegisterPageUI.EMAIL_ERROR_MESSAGE);
	}

	public boolean isEmptyPasswordErrorMessage() {
		waitForElementVisible(driver, RegisterPageUI.PASSWORD_ERROR_MESSAGE);
		return isElementDisplayed(driver, RegisterPageUI.PASSWORD_ERROR_MESSAGE);
	}

	public boolean isEmptyConfirmPasswordErrorMessage() {
		waitForElementVisible(driver, RegisterPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE);
		return isElementDisplayed(driver, RegisterPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE);
	}

	public boolean isRegisterSuccessMessageDisplayed() {
		waitForElementVisible(driver, RegisterPageUI.REGISTER_SUCCESS_MESSAGE);
		return isElementDisplayed(driver, RegisterPageUI.REGISTER_SUCCESS_MESSAGE);
	}

	public boolean isExistEmailErrorMessage() {
		waitForElementVisible(driver, RegisterPageUI.EXIST_EMAIL_ERROR_MESSAGE);
		clickToElement(driver, RegisterPageUI.EXIST_EMAIL_ERROR_MESSAGE);
		return isElementDisplayed(driver, RegisterPageUI.EXIST_EMAIL_ERROR_MESSAGE);
	}

	public boolean isRegisterTitlePageDisplayed() {
		waitForElementVisible(driver, RegisterPageUI.REGISTER_TITLE_TEXT);
		clickToElement(driver, RegisterPageUI.REGISTER_TITLE_TEXT);
		return isElementDisplayed(driver, RegisterPageUI.REGISTER_TITLE_TEXT);
	}

	public boolean isPasswordLessSixCharacterErrorMessage() {
		waitForElementVisible(driver, RegisterPageUI.PASSWORD_LESS_SIX_CHARACTER_ERROR_MESSAGE);
		clickToElement(driver, RegisterPageUI.PASSWORD_LESS_SIX_CHARACTER_ERROR_MESSAGE);
		return isElementDisplayed(driver, RegisterPageUI.PASSWORD_LESS_SIX_CHARACTER_ERROR_MESSAGE);
	}

	public boolean isConfirmPasswordNotMatchPasswordErrorMessage() {
		waitForElementVisible(driver, RegisterPageUI.CONFIRM_PASSWORD_NOT_MATCH_PASSWORD_ERROR_MESSAGE);
		clickToElement(driver, RegisterPageUI.CONFIRM_PASSWORD_NOT_MATCH_PASSWORD_ERROR_MESSAGE);
		return isElementDisplayed(driver, RegisterPageUI.CONFIRM_PASSWORD_NOT_MATCH_PASSWORD_ERROR_MESSAGE);
	}

	public boolean isRegisterInvalidEmailErrorMessage() {
		waitForElementVisible(driver, RegisterPageUI.INVALID_EMAIL_ERROR_MESSAGE);
		clickToElement(driver, RegisterPageUI.INVALID_EMAIL_ERROR_MESSAGE);
		return isElementDisplayed(driver, RegisterPageUI.INVALID_EMAIL_ERROR_MESSAGE);
	}

}
