package hooks;

import org.openqa.selenium.WebDriver;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	WebDriver driver;

	@Before
	public void setUp() {
		BaseClass.intializeBrowser();
	}

	@After
	public void tearDown() {
		BaseClass.closeBrowser();
	}

}
