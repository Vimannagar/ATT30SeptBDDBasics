package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	@FindBy(xpath = "//*[@class='page-header']//*[normalize-space(text())='Sign In']")
	private WebElement signinlink;

	@FindBy(xpath = "//*[@id='search123']")
	private WebElement searchField;

	@FindBy(xpath = "//button[@type='submit' and @title='Search']")
	private WebElement searchButton;

	@FindBy(xpath = "//*[@class='product-item-info']")
	private List<WebElement> results;

	private WebDriver driver;
	private WebDriverWait wait;
	public HomePage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
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
		wait.until(ExpectedConditions.elementToBeClickable(searchButton));
		searchButton.click();
	}

	public int getResultsCount() {
		int numberOfResults = results.size();

		System.out.println("Total number of results are : " + numberOfResults);
		return numberOfResults;
	}

}
