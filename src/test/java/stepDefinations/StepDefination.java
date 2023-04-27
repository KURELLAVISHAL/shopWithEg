package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;
import pages.LoginPage;
import utility.DriverFactory;

public class StepDefination {
	
	LoginPage loginPage=new LoginPage(DriverFactory.driver);
	LandingPage landingPage=new LandingPage(DriverFactory.driver);
	
	
	
	@Given("user launches shopwitheg site")
	public void user_launches_shopwitheg_site() {
	   DriverFactory.driver.get("https://stg.shopwitheg.com/");
	}


	@When("user enters invalid credentials")
	public void user_enters_invalid_credentials() {
		loginPage.enterInvalidEmail("klkadsjf");
		loginPage.enterInvalidPassword("ljsdl;kfjl;dsa");
	}

	@When("user clicks login button")
	public void user_clicks_on_login_button() {
		landingPage.clickLoginButton();
	}

	@Then("user will be displayed with error message for invalid credentials")
	public void user_will_be_displayed_with_error_message_for_invalid_credentials() {
		loginPage.verifyInvlidErrorMessage();
	}

	@When("user enters blank username and password")
	public void user_enters_blank_username_and_password() {
		loginPage.enterBlankEmail();
		loginPage.enterBlankPassword();
	}

	@Then("user will be displayed with error message for blank username and password")
	public void user_will_be_displayed_with_error_message_for_blank_username_and_password() {
		loginPage.verifyBlankErrorMessage();
	}
	
	@When("user clicks on signin button in login page")
	public void user_clicks_on_signin_button_in_login_page() {
		loginPage.clickSignInButton();
	}
	
	@When("user enters invalid {string} and {string}")
	public void user_enters_invalid_and(String email, String password) {
	    loginPage.enterInvalidEmail(email);
	    loginPage.enterInvalidPassword(password);
	}

}
