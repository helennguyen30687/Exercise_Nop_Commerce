package pageObjects.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopCommerce.LoginPageUI;

public class LoginPageObject extends BasePage {
	private WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterDataToEmailTextbox(String value) {
		waitForAllElementVisible(driver, LoginPageUI.LOGIN_EMAIL_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.LOGIN_EMAIL_TEXTBOX,value);
	}

	public void enterDataToPasswordTextbox(String value) {
		waitForAllElementVisible(driver, LoginPageUI.LOGIN_PASWORD_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.LOGIN_PASWORD_TEXTBOX,value);		
	}

	public void clickOnLoginButton() {
		waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
	}

	public boolean isEmptyEmailErrorMessage() {
		waitForAllElementVisible(driver, LoginPageUI.EMPTY_EMAIL_ERROR_MESSAGE);
		return isElementDisplayed(driver, LoginPageUI.EMPTY_EMAIL_ERROR_MESSAGE);
	}

}
