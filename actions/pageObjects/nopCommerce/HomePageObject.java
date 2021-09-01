package pageObjects.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.nopCommerce.HomePageUI;

public class HomePageObject extends BasePage {
	private WebDriver driver;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isHomePageSliderDisplayed() {
		waitForElementVisible(driver, HomePageUI.HOME_PAGE_SLIDER);
		return isElementDisplayed(driver, HomePageUI.HOME_PAGE_SLIDER);
	}

	public void clickToDesktopMenu() {
		// TODO Auto-generated method stub
		
	}

	public void clickToProductLink() {
		// TODO Auto-generated method stub
		
	}

	public void clickToAddReviewLink() {
		// TODO Auto-generated method stub
		
	}

	public void enterToReviewTitleTextbox(String string) {
		// TODO Auto-generated method stub
		
	}

	public void enterToReviewTextTextbox(String string) {
		// TODO Auto-generated method stub
		
	}

	public void selectToRatingRadiobutton() {
		// TODO Auto-generated method stub
		
	}

	public void clickToSubmitButton() {
		// TODO Auto-generated method stub
		
	}
	
}
