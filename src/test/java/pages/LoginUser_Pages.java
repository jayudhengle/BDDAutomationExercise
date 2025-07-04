package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginUser_Pages {


	@FindBy(xpath = "//input[@data-qa='login-email']")
	WebElement loginEmail;

	@FindBy(xpath = "//input[@data-qa='login-password']")
	WebElement loginPassword;

	@FindBy(xpath = "//button[@data-qa='login-button']")
	WebElement loginButton;

	public LoginUser_Pages(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterLoginEmail(String email) {
		loginEmail.sendKeys(email);
	}

	public void enterLoginPassword(String pass) {
		loginPassword.sendKeys(pass);
	}

	public void clickLoginButton() {
		loginButton.click();
	}

}
