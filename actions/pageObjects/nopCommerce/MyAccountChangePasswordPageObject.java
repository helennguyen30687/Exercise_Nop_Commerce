package pageObjects.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.nopCommerce.MyAccountCustomerInfoUI;
import pageUIs.nopCommerce.HomePageUI;
import pageUIs.nopCommerce.LoginPageUI;
import pageUIs.nopCommerce.MyAccountChangePasswordPageUI;
import pageUIs.nopCommerce.RegisterPageUI;

public class MyAccountChangePasswordPageObject extends BasePage {
	private WebDriver driver;

	public MyAccountChangePasswordPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void enterToOldPasswordTextbox(String password) {
		waitForAllElementVisible(driver, MyAccountChangePasswordPageUI.OLD_PASSWORD_TEXTBOX);
		sendkeyToElement(driver, MyAccountChangePasswordPageUI.OLD_PASSWORD_TEXTBOX, password);
	}

	public void enterToNewPasswordTextbox(String passwordNew) {
		waitForAllElementVisible(driver, MyAccountChangePasswordPageUI.NEW_PASSWORD_TEXTBOX);
		sendkeyToElement(driver, MyAccountChangePasswordPageUI.NEW_PASSWORD_TEXTBOX, passwordNew);
	}

	public void enterToConfirmPasswordTextbox(String passwordNew) {
		waitForAllElementVisible(driver, MyAccountChangePasswordPageUI.CONFIRM_PASSWORD_TEXTBOX);
		sendkeyToElement(driver, MyAccountChangePasswordPageUI.CONFIRM_PASSWORD_TEXTBOX, passwordNew);
	}

	public void clickOnChangePasswordButton() {
		waitForElementClickable(driver, MyAccountChangePasswordPageUI.CHANGE_PASSWORD_BUTTON);
		clickToElement(driver, MyAccountChangePasswordPageUI.CHANGE_PASSWORD_BUTTON);
	}

	public void clickToCloseBarNoti() {
		waitForElementClickable(driver, MyAccountChangePasswordPageUI.CHANGE_PASSWORD_SUCCESS_BAR_CLOSE_BUTTON);
		clickToElement(driver, MyAccountChangePasswordPageUI.CHANGE_PASSWORD_SUCCESS_BAR_CLOSE_BUTTON);
	}

}
