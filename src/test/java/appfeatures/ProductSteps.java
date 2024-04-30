package appfeatures;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductPage;
import qa.DriverFactory;

public class ProductSteps {
	ProductPage product = new ProductPage(DriverFactory.getDriver());
	
	@When("I click on Men")
	public void i_click_on() {
		product.clickOnSection();
	}

	@Then("I should redirect to section")
	public void i_should_redirect_to_section() {
	 boolean isDisplay = product.sectionInfo();
	 Assert.assertTrue(isDisplay);
	 
	}

	@When("I select the product")
	public void i_select_the_product() {
	    product.selectProduct();
	}

	@Then("Product page should display")
	public void product_page_should_display() {
		boolean isDisplayed = product.verifyingButton();
		
		Assert.assertTrue(isDisplayed);
	}

	@When("I select size and color")
	public void i_select_size_and_color() {
	  product.selectSize();
	}

	@When("Click on add to cart")
	public void click_on_add_to_cart() {
	    product.clickOnAddToCart();
	}

	@Then("I should see message contains {string}")
	public void i_should_see_product_added_confirmation(String word) {
	   String confirmMessage= product.fetchMessage();
	   
	   boolean isContaining = confirmMessage.contains(word);
	   
	   Assert.assertTrue(isContaining);
	}

}
