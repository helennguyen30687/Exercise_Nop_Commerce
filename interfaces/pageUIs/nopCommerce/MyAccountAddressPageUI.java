package pageUIs.nopCommerce;

public class MyAccountAddressPageUI {
	public static final String ADD_NEW_BUTTON = "//button[text()='Add new']";
	public static final String FIRST_NAME_TEXTBOX = "//input[@id='Address_FirstName']";
	public static final String LAST_NAME_TEXTBOX = "//input[@id='Address_LastName']";
	public static final String EMAIL_TEXTBOX = "//input[@id='Address_Email']";
	public static final String COMPANY_TEXTBOX = "//input[@id='Address_Company']";
	public static final String COUNTRY_DROPDOWNLIST = "//select[@id='Address_CountryId']";
	public static final String STATE_DRPDOWNLIST = "//select[@id='Address_StateProvinceId']";
	public static final String CITY_TEXTBOX = "//input[@id='Address_City']";
	public static final String ADDRESS1_TEXTBOX = "//input[@id='Address_Address1']";
	public static final String ADDRESS2_TEXTBOX = "//input[@id='Address_Address2']";
	public static final String ZIPCODE_TEXTBOX = "//input[@id='Address_ZipPostalCode']";
	public static final String PHONE_NUMBER_TEXTBOX = "//input[@id='Address_PhoneNumber']";
	public static final String FAX_NUMBER_TEXTBOX = "//input[@id='Address_FaxNumber']";
	public static final String SAVE_BUTTON = "//button[text()='Save']";
	
	public static final String VERIFY_FULL_NAME_TITLE ="//div[@class='address-list']//div[@class='title']/strong[text()='%s']";
	public static final String VERIFY_EMAIL_PHONE_FAX_NUMBER ="//div[@class='address-list']//li[contains(.,'%s')]";
	public static final String VERIFY_NAME_COMPANY_ADDRESS12_STATE_COUNTRY ="//div[@class='address-list']//li[text()='%s']";

}
