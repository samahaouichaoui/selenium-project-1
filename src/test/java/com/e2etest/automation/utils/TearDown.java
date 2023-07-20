package com.e2etest.automation.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

/**
 * this class is used to cleanly exit it when the test has completed
 **/
public class TearDown {

	  /**
	     * This method is used to close browser.
	     * This method is called after the invocation of each test method in given class.
	     * @After Methods annotated with @After execute after every scenario.
	     */
	
	@After
	public void quitDriver(Scenario scenario) {

		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) Setup.driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "screenshot");
		}
		Setup.driver.quit();
	}
}
