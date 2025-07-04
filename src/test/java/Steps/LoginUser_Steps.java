package Steps;

import org.openqa.selenium.WebDriver;

import base.BaseClass;
import io.cucumber.java.en.When;
import pages.LoginUser_Pages;

public class LoginUser_Steps {

	LoginUser_Pages loginUserPage;
	WebDriver driver;

	public LoginUser_Steps() {
		driver = BaseClass.getDriver();
		loginUserPage = new LoginUser_Pages(driver);
	}

	@When("I enter email as {string} and password as {string}")
	public void i_enter_email_as_and_password_as(String useremail, String pass) {
		loginUserPage.enterLoginEmail(useremail);
		loginUserPage.enterLoginPassword(pass);
	}

	@When("I click on {string} button")
	public void i_click_on_button(String string) {
		loginUserPage.clickLoginButton();
	}
}
