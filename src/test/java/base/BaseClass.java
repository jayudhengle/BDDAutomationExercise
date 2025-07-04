package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {

	private static WebDriver driver;

	public static void intializeBrowser() {
		ChromeOptions options = new  ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options); // Or use WebDriverManager
        driver.manage().window().maximize();
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void closeBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}
}
