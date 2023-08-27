@outline
Feature: Authentification sur l application zara
  En tant que utilisateur je souhaite m authentifier sur l application avec un scenario outline

  @login
  Scenario Outline: Authentification sur l application zara avec plusieurs utilisateurs
    Given Je me connecte sur l application zara "https://www.zara.com/tn"
    When Je clique sur le lien se connecter
    Then Je me redirige vers la page "Démarrer la session"
    When Je saisis l adresse mail "<email>"
    And Je saisis le password "<password>"
    And Je clique sur  se connecter
    

    Examples: 
      | email                    | password    |
      | samehaouichaoui@yahoo.fr | samah2020AB |
      | samhaouichaoui@yahoo.fr  | samah2020AB |
      | amine@yahoo.fr           | amine123    |
