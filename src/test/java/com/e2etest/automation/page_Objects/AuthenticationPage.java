package com.e2etest.automation.page_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etest.automation.utils.ConfigFileReader;
import com.e2etest.automation.utils.Setup;

public class AuthenticationPage {
	
	private ConfigFileReader configFileReader;

	/* @FindBy WebElement */

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Username']")
	public static WebElement username;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
	public static WebElement password;

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	public static WebElement btnLogin;
	
	@FindBy(how = How.XPATH, using = "//header/div[1]/div[2]/ul[1]/li[1]/span[1]")
	public static WebElement homePage;

	public AuthenticationPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();

	}

	/* Create Methods */
	public void fillUsername(String txt_username) {
		username.sendKeys(txt_username);
	}

	public void fillPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void clickonBtnLogin() {
		btnLogin.click();
	}

	public void goToURL() {
		Setup.driver.get(configFileReader.getProperties("home.url"));
	}
}
