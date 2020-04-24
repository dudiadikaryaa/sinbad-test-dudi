@problemA
Feature: Use Case A Scenarios

  @usecase_1
  Scenario: Search hotel in Bandung for 2 Adults & 1 Child
    Given the user opens PHPTravels Web
    When the user input Bandung in destination field
    And the user add child field by 1
    And the user clicks Search button
    Then show search results for Bandung