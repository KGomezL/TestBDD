Feature: Como tester quiero validar el inicio de sesion en uTest en diferentes escenarios para un usuario no registrado

  Background:Inicio de sesion en uTest

  Scenario: Inicio de sesion incompleto
    When deje los campos vacios o en blanco
    And de clic en el boton Sign in
    Then debo ver un mensaje de error

  Scenario: Inicio de sesion invalido
    When introduzca credenciales invalidas
    And de clic en el boton Sign in
    Then debo ver un mensaje de error