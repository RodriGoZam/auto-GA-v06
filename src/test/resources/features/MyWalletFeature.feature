Feature: Verificar My Wallet Home

  Background: Preconditions
    Given Localhost page is loaded

  Scenario: Verificar si el boton ingreso es visible
    #And New Account is Created
    And click 'Menu' button on 'Header' page
    And click '+CUENTA' button on 'Account Handle' page
    When the 'Crea Tu Cuenta ' page is loaded
    And fill "Cuenta X" 'Nombre de Cuenta' textfield on 'Crea Tu Cuenta' page
    And click 'Crear Cuenta' button on 'Crea Tu Cuenta' page
#    <KEY>
#  <action: click, fill, choose, ...>
#  <object:button, textfield, select field, radio button,...>
#    <where: on 'Name Object' page >

    Given
    And
    When la cuenta es creada
    And mi lista de cuanta esta refresca
    Then Click on the new account that was created
      And Ingreso Button is visible
      And Ingreso Button is visible
      And Ingreso Button is visible
    Then Ingreso Button is visible
