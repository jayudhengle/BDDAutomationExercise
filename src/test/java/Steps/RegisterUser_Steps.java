package Steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterUser_Pages;

public class RegisterUser_Steps {

	WebDriver driver = BaseClass.getDriver();
	RegisterUser_Pages registerUserPages;

	@Given("I navigate to url {string}")
	public void i_navigate_to_url(String url) {
		registerUserPages = new RegisterUser_Pages(driver);
		driver.get(url);
	}

	@Then("I should see the home page is visible successfully")
	public void i_should_see_the_home_page_is_visible_successfully() {
		String attributeColor = registerUserPages.verifyHomePage();
		Assert.assertTrue(attributeColor.contains("orange"));
	}

	@When("I click on Signup-Login button")
	public void i_click_on_button() {
		registerUserPages.clickSignUpLogin();
	}

	@Then("I should see New User Signup! is visible")
	public void i_should_see_is_visible() {
		String actualTxt = registerUserPages.verifySignUpTxt();
		Assert.assertEquals(actualTxt, "New User Signup!");
	}

	@When("I enter name as {string} and email as {string}")
	public void i_enter_name_as_and_email_as(String name, String email) {
		registerUserPages.enterNameEmail(name, email);
	}

	@And("I click on Signup button")
	public void i_click_on_sign_up_button() {
		registerUserPages.clickSinupBtn();
	}

	@When("I fill account details")
	public void i_fill_account_details(DataTable datatable) {
		registerUserPages.fillAccountDetails(datatable);
	}

	@When("I fill personal details with first name {string}, last name {string}, company {string}, address {string}, address2 {string}, country {string}, state {string}, city {string}, zipcode {string}, and mobile number {string}")
	public void i_fill_personal_details_with_first_name_last_name_company_address_address2_country_state_city_zipcode_and_mobile_number(
			String string, String string2, String string3, String string4, String string5, String string6,
			String string7, String string8, String string9, String string10) {
		registerUserPages.fillPersonalDetails(string, string2, string3, string4, string5, string6, string7, string8,
				string9, string10);
	}

	@When("I click on Create Account button")
	public void i_click_on_Create_Account() {
		registerUserPages.clickCreateAccountBtn();
	}

	@When("I click on Continue button")
	public void i_click_on_continue_button() {
		registerUserPages.clickContinueBtn();
	}

	@Then("I should see ACCOUNT CREATED! is visible")
	public void i_should_see_account_created_is_visible() {
		String actualTxt = registerUserPages.verifyAccountCreated();
		Assert.assertEquals(actualTxt, "ACCOUNT CREATED!");
	}

	@Then("I should see Logged in as {string} is visible")
	public void i_should_see_logged_in_as_test_user_is_visible(String user) {
		String actualTxt = registerUserPages.verifyLoggedUser();
		Assert.assertEquals(actualTxt, user);
	}

}
