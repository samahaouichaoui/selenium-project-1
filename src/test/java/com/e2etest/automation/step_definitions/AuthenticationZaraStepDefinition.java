package com.e2etest.automation.step_definitions;

import org.testng.Assert;

import com.e2etest.automation.page_Objects.AuthenticationZaraPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationZaraStepDefinition {

	private AuthenticationZaraPage authenticationZaraPage;

	public AuthenticationZaraStepDefinition() {
		this.authenticationZaraPage = new AuthenticationZaraPage();
	}

	@Given("Je me connecte sur l application zara {string}")
	public void jeMeConnecteSurLApplicationZara(String url) throws InterruptedException {
		authenticationZaraPage.goToURL(url);
		Thread.sleep(3000);
	}

	@When("Je clique sur le lien se connecter")
	public void jeCliqueSurLeLienSeConnecter() {
		authenticationZaraPage.clickOnbtnOnSeconnecter();
	}

	@Then("Je me redirige vers la page {string}")
	public void jeMeRedirigeVersLaPageDemarrerLaSession(String txt) {

		String titlePage = authenticationZaraPage.pageConnexion.getText();
		Assert.assertTrue(titlePage.contains(txt));
	}

	@When("Je saisis l adresse mail {string}")
	public void jeSaisisLAdresseMail(String email) {
		authenticationZaraPage.fillEmail(email);
	}

	@When("Je saisis le password {string}")
	public void jeSaisisLePassword(String password) {
		authenticationZaraPage.fillPassword(password);
	}

}
