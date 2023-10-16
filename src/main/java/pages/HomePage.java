package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//*[@class='page-header']//*[normalize-space(text())='Sign In']")
	WebElement signinlink;

	@FindBy(xpath = "//*[@id='search']")
	WebElement searchField;

	@FindBy(xpath = "//button[@type='submit' and @title='Search']")
	WebElement searchButton;

	@FindBy(xpath = "//*[@class='product-item-info']")
	List<WebElement> results;

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public String fetchTitle() {
		String titleOfPage = driver.getTitle();

		return titleOfPage;
	}

	public boolean isSignInDisplaying() {
		boolean isGettingDisplayed = signinlink.isDisplayed();

		return isGettingDisplayed;
	}

	public void searchProduct(String product) {
		searchField.sendKeys(product);
		searchButton.click();
	}

	public int getResultsCount() {
		int numberOfResults = results.size();

		System.out.println("Total number of results are : " + numberOfResults);
		return numberOfResults;
	}

}
