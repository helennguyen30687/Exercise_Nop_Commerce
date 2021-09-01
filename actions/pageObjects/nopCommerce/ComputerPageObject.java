package pageObjects.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.nopCommerce.HomePageUI;

public class ComputerPageObject extends BasePage {
	private WebDriver driver;

	public ComputerPageObject(WebDriver driver) {
		this.driver = driver;
	}

	
}
