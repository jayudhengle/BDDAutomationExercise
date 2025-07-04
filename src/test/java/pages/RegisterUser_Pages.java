package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;

public class RegisterUser_Pages {

	WebDriver driver;
	Select days;
	String dob;
	String[] dates;
	Select months;
	Select years;
	Select country;

	@FindBy(xpath = "//a[contains(text(), 'Home')]")
	WebElement homePageSelection;

	@FindBy(xpath = "//*[contains(text(), 'Signup / Login')]")
	WebElement signUpLoginBtn;

	@FindBy(xpath = "//*[@class='signup-form']/h2")
	WebElement signUpFormTxt;

	@FindBy(name = "name")
	WebElement nameFormTxtBox;

	@FindBy(xpath = "//*[@data-qa='signup-email']")
	WebElement emailTxtBox;

	@FindBy(xpath = "//*[text() = 'Signup']")
	WebElement signUpBtn;

	@FindBy(xpath = "//*[@class='signup-form']/h2")
	WebElement signUpTxt;

	@FindBy(id = "id_gender1")
	WebElement mrRadioBtn;

	@FindBy(id = "id_gender2")
	WebElement mrsRadioBtn;

	@FindBy(name = "name")
	WebElement nameTxtBox;

	@FindBy(name = "password")
	WebElement passwordTxtBox;

	@FindBy(id = "days")
	WebElement dobDaysDrpDown;

	@FindBy(id = "months")
	WebElement dobMonthsDrpDown;

	@FindBy(id = "years")
	WebElement dobYearsDrpDown;

	@FindBy(id = "first_name")
	WebElement first_nameTxtBox;

	@FindBy(id = "last_name")
	WebElement last_nameTxtBox;

	@FindBy(id = "company")
	WebElement companyTxtBox;

	@FindBy(id = "address1")
	WebElement address1TxtBox;

	@FindBy(id = "address2")
	WebElement address2TxtBox;

	@FindBy(id = "country")
	WebElement countryDrpDown;

	@FindBy(id = "state")
	WebElement stateTxtBox;

	@FindBy(id = "city")
	WebElement cityTxtBox;

	@FindBy(id = "zipcode")
	WebElement zipcodeTxtBox;

	@FindBy(id = "mobile_number")
	WebElement mobile_numberTxtBox;

	@FindBy(xpath = "//*[text() = 'Create Account']")
	WebElement createAccountBtn;

	@FindBy(xpath = "//*[text() = 'Continue']")
	WebElement continueBtn;

	@FindBy(xpath = "//h2[@class='title text-center']/b")
	WebElement accountCreatedTxt;

	@FindBy(xpath = "//b")
	WebElement userTxt;

	

	public RegisterUser_Pages(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePage() {
		return homePageSelection.getAttribute("style");
	}

	public void clickSignUpLogin() {
		signUpLoginBtn.click();
	}

	public String verifySignUpTxt() {
		return signUpFormTxt.getText();
	}

	public void enterNameEmail(String name, String email) {
		nameFormTxtBox.sendKeys(name);
		emailTxtBox.sendKeys(email);
	}

	public void clickSinupBtn() {
		signUpBtn.click();
	}

	public void fillAccountDetails(DataTable datatable) {
		if (datatable.cell(1, 0).equals("Mr")) {
			mrRadioBtn.click();
		} else {
			mrsRadioBtn.click();
		}

		nameTxtBox.clear();
		nameTxtBox.sendKeys(datatable.cell(1, 1));

		passwordTxtBox.sendKeys(datatable.cell(1, 2));
		dob = datatable.cell(1, 3);

		dates = dob.split(" ");

		days = new Select(dobDaysDrpDown);
		days.selectByVisibleText(dates[0]);

		months = new Select(dobMonthsDrpDown);
		months.selectByVisibleText(dates[1]);

		years = new Select(dobYearsDrpDown);
		years.selectByVisibleText(dates[2]);
	}

	public void fillPersonalDetails(String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8, String string9, String string10) {

		first_nameTxtBox.sendKeys(string);
		last_nameTxtBox.sendKeys(string2);
		companyTxtBox.sendKeys(string3);
		address1TxtBox.sendKeys(string4);
		address2TxtBox.sendKeys(string5);

		country = new Select(countryDrpDown);
		country.selectByVisibleText(string6);

		stateTxtBox.sendKeys(string7);
		cityTxtBox.sendKeys(string8);
		zipcodeTxtBox.sendKeys(string9);
		mobile_numberTxtBox.sendKeys(string10);
	}

	public void clickCreateAccountBtn() {
		createAccountBtn.click();
	}

	public void clickContinueBtn() {
		continueBtn.click();
	}

	public String verifyAccountCreated() {
		return (accountCreatedTxt.getText());
	}

	public String verifyLoggedUser() {
		return (userTxt.getText());
	}

}
