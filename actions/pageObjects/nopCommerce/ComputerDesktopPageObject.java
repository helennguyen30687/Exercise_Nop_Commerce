package pageObjects.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.nopCommerce.HomePageUI;

public class ComputerDesktopPageObject extends BasePage {
	private WebDriver driver;

	public ComputerDesktopPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isHomePageSliderDisplayed() {
		waitForElementVisible(driver, HomePageUI.HOME_PAGE_SLIDER);
		return isElementDisplayed(driver, HomePageUI.HOME_PAGE_SLIDER);
	}
	
}
