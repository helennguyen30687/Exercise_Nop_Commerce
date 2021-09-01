package pageUIs.nopCommerce;

public class LoginPageUI {
	public static final String LOGIN_EMAIL_TEXTBOX = "//input[@id='Email']";
	public static final String LOGIN_PASWORD_TEXTBOX = "//input[@id='Password']";
	public static final String LOGIN_BUTTON = "//button[text()='Log in']";
	public static final String EMPTY_EMAIL_ERROR_MESSAGE = "//span[@id='Email-error' and text()='Please enter your email']";
	public static final String REGISTER_LINK = "//a[text()='Register']";
	public static final String LOGIN_LINK = "//a[text()='Log in']";
	public static final String INVALID_EMAIL_ERROR_MESSAGE = "//span[@id='Email-error' and text()='Wrong email']";
	public static final String NOT_EXIST_EMAIL_ERROR_MESSAGE = "//div[contains(@class,'message-error validation-summary-errors') and text()='Login was unsuccessful. Please correct the errors and try again.']//li[text()='No customer account found']";
	public static final String REGISTERED_EMAIL_NULL_PASSWORD_ERROR_MESSAGE = "//div[contains(@class,'message-error validation-summary-errors') and text()='Login was unsuccessful. Please correct the errors and try again.']//li[text()='The credentials provided are incorrect']";
	public static final String REGISTERED_EMAIL_INCORRECT_PASSWORD_ERROR_MESSAGE = "//div[contains(@class,'message-error validation-summary-errors') and text()='Login was unsuccessful. Please correct the errors and try again.']//li[text()='The credentials provided are incorrect']";
	
}
