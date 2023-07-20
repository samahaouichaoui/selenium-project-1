package com.e2etest.automation.step_definitions;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import com.e2etest.automation.page_Objects.AuthenticationPage;
import com.e2etest.automation.utils.ConfigFileReader;
import com.e2etest.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationStepDefinition {

	private AuthenticationPage authenticationPage;

	public AuthentificationStepDefinition() {
		this.authenticationPage = new AuthenticationPage();
	}

	@Given("Je me connecte à l'application OrangeHRM")
	public void jeMeConnecteÀLApplicationOrangeHRM() {
		authenticationPage.goToURL();
	}

	@When("Je saisie le username {string}")
	public void jeSaisieLeUsername(String username) {
		authenticationPage.fillUsername(username);
	}

	@When("Je saisie le mot de passe {string}")
	public void jeSaisieLeMotDePasse(String pswd) {
		authenticationPage.fillPassword(pswd);
	}

	@When("Je clique sur le bouton Login")
	public void jeCliqueSurLeBoutonLogin() {
		authenticationPage.clickonBtnLogin();
	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String result1) {
		String message = authenticationPage.homePage.getText();
		Assert.assertTrue(message.contains(result1));

	}

}
