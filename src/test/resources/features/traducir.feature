Feature: Como usuario quiero usar el traductor para traducir palabras

  Scenario: Traducir la palabra bienvenido
    Given que ingrese a la url de Google Traductor
    When introduzca la palabra bienvenido en el campo de texto
    Then deberia ver la palabra welcome en la salida