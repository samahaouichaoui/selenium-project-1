@authentification
Feature: Je me connecte à l'application OrangeHRM
  En tantque utilisateur  je souhaite m'identifier à l'application OrangeHRM

  Background: 
    Given Je me connecte à l'application OrangeHRM
    When Je saisie le username "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le bouton Login

  @connexion_ok
  Scenario: Authentification à l'application OrangeHRM
    Then Je me redirige vers la page home "Dashboard"

  @deconnexion
  Scenario: vérifier la deconnexion
    Then Je me redirige vers la page home "Dashboard"
    When Je clique sur l'icone logout
    And Je clique sur le bouton logout
