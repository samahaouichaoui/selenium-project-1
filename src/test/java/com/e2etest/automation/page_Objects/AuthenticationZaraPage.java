package com.e2etest.automation.page_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etest.automation.utils.Setup;

public class AuthenticationZaraPage {

	/* @FindBy WebElement */
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Log in to your account']")
	public static WebElement pageConnexion;

	@FindBy(how = How.XPATH, using = "//*[@id=\"theme-app\"]/div[1]/div/header/div[3]/a[1]/span")
	public static WebElement btnSeConnecter;

	@FindBy(how = How.XPATH, using = "//*[@id=\"logonId160\"]")
	public static WebElement email;

	@FindBy(how = How.XPATH, using = "//*[@id=\"password164\"]")
	public static WebElement password;

	public AuthenticationZaraPage() {
		PageFactory.initElements(Setup.driver, this);

	}

	/* Create Methods */
	public void goToURL(String url) {
		Setup.driver.get(url);
	}

	public void clickOnbtnOnSeconnecter() {
		btnSeConnecter.click();
	}

	public void fillEmail(String txt_mail) {
		email.sendKeys(txt_mail);
	}

	public void fillPassword(String txt_password) {
		password.sendKeys(txt_password);
	}
}
