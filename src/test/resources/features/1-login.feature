@Suite @Calculate
Feature: CP01 - Validar Suma
  Background: Validar sumar dos numeros enteros
    Given el usuario entra al url

    @ValidarBuild2
    Scenario: 1 - Validar formulario 2
      When selecciona formulario 2
      Then mostrar formulario 2

      @ValidarBuild9
      Scenario: 2 - Validar formulario 9
        When selecciona formulario 9
        Then montrar formulario 9

      @ValidarBuilDB
      Scenario Outline: 3 - Validar formularios BD
        When usuario lee los datos de base de datos <id>
        Then realizar todas las operaciones guaradadas en bd

        Examples:
        |id|
        |1 |
        |2 |
        |3 |
        |4 |