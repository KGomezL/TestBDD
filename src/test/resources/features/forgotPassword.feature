Feature: Como tester quiero validar la recuperación de contraseña para un usuario no registrado

  Scenario: Recuperar contraseña para usuario no registrado
    Given que quiera recuperar la contrasena
    When introduzca el correo
    And de clic en el boton Reset Password
    Then deberia ver un error de autenticacion