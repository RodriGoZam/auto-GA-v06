Feature: Verificar My Wallet Home

  Scenario: Verificar si el boton +ingreso es visible
    Given Localhost page is loaded
    And New Account is Created
    Then Click on the new account that was created
  Then Ingreso Button is visible
