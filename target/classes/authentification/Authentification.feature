@authentification
Feature: Je me connecte à l'application OrangeHRM
  En tantque utilisateur  je souhaite m'identifier à l'application OrangeHRM

  @connexion_ok
  Scenario: Authentification à l'application OrangeHRM
    Given Je me connecte à l'application OrangeHRM 
    When Je saisie le username "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page home "Dashboard"
  
  @deconnexion 
   Scenario:  vérifier la deconnexion 
    Given Je me connecte à l'application OrangeHRM 
    When Je saisie le username "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page home "Dashboard"
    And   
  

    