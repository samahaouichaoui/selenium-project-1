package com.e2etest.automation.utils;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.cucumber.java.Before;

public class Setup {

	/**
	 *This  class is used to start your browser session before running your test
	 */
	public static WebDriver driver;
	
@Before
	public void setWebDriver() {
	
		String browser = System.getProperty("browser");
		if (browser == null) {
			browser = "chrome";
		}
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/win/chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("['start-maximized']");
			chromeOptions.addArguments("--remote-allow-origins=*");
			chromeOptions.addArguments("--disable notifications");
			DesiredCapabilities cp = new DesiredCapabilities();
			cp.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
			chromeOptions.merge(cp);

			//WebDriver driver = new ChromeDriver(chromeOptions);

			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("gecko.chrome.driver", "src/test/resource/drivers/win/geckodriver.exe");
			FirefoxProfile profile = new FirefoxProfile();
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.setCapability("platform", Platform.WIN10);
			firefoxOptions.setProfile(profile);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		default:
			throw new IllegalArgumentException("Browser \"" + browser + "\" isn't supported.");
		}
	}
}
