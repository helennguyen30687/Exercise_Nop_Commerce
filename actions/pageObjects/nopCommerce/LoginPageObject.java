package pageObjects.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.nopCommerce.LoginPageUI;

public class LoginPageObject extends BasePage {
	private WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void enterToEmailTextbox(String value) {
		waitForAllElementVisible(driver, LoginPageUI.LOGIN_EMAIL_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.LOGIN_EMAIL_TEXTBOX, value);
	}

	public void enterToPasswordTextbox(String value) {
		waitForAllElementVisible(driver, LoginPageUI.LOGIN_PASWORD_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.LOGIN_PASWORD_TEXTBOX, value);
	}

	public boolean isEmptyEmailErrorMessage() {
		waitForAllElementVisible(driver, LoginPageUI.EMPTY_EMAIL_ERROR_MESSAGE);
		return isElementDisplayed(driver, LoginPageUI.EMPTY_EMAIL_ERROR_MESSAGE);
	}

	public boolean isInvalidEmailErrorMessage() {
		waitForAllElementVisible(driver, LoginPageUI.INVALID_EMAIL_ERROR_MESSAGE);
		return isElementDisplayed(driver, LoginPageUI.INVALID_EMAIL_ERROR_MESSAGE);
	}

	public boolean isNotExistEmailErrorMessage() {
		waitForAllElementVisible(driver, LoginPageUI.NOT_EXIST_EMAIL_ERROR_MESSAGE);
		return isElementDisplayed(driver, LoginPageUI.NOT_EXIST_EMAIL_ERROR_MESSAGE);
	}

	public boolean isRegisteredEmailPasswordNull() {
		waitForAllElementVisible(driver, LoginPageUI.REGISTERED_EMAIL_NULL_PASSWORD_ERROR_MESSAGE);
		return isElementDisplayed(driver, LoginPageUI.REGISTERED_EMAIL_NULL_PASSWORD_ERROR_MESSAGE);

	}

	public boolean isRegisteredEmailIncorrectPassword() {
		waitForAllElementVisible(driver, LoginPageUI.REGISTERED_EMAIL_INCORRECT_PASSWORD_ERROR_MESSAGE);
		return isElementDisplayed(driver, LoginPageUI.REGISTERED_EMAIL_INCORRECT_PASSWORD_ERROR_MESSAGE);
	}

	public void clickOnLoginButton() {
		waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
		
	}

}
