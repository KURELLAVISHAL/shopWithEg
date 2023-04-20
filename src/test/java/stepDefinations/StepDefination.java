package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utility.DriverFactory;

public class StepDefination {
	
	LoginPage loginPage=new LoginPage(DriverFactory.driver);
	
	
	
	@Given("user launches shopwitheg site")
	public void user_launches_shopwitheg_site() {
	   DriverFactory.driver.get("https://stg.shopwitheg.com/");
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
	    loginPage.clickLoginButton();
	}

	@When("user enters valid credentials")
	public void user_enters_valid_credentials() {
	    loginPage.enterEmail();
	    loginPage.enterPassword();
	}

	@Then("user will be sucessfully logged in")
	public void user_will_be_sucessfully_logged_in() {
	   
	}

}
