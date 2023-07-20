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

	@FindBy(how = How.NAME, using = "username")
	public static WebElement username;

	@FindBy(how = How.NAME, using = "password")
	public static WebElement password;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
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
