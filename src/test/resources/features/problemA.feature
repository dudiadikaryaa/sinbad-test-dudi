@problemA
Feature: Use Case A Scenarios

  @usecase_1
  Scenario Outline: Search hotel in Bandung for 2 Adults & 1 Child
    Given the user opens PHPTravels Web
    When the user input <cityName> in destination field
    And the user add child field by 1
    And the user clicks Search button
    Then show search results for <cityName>
    Examples:
    | cityName    |
    | Bandung     |
    | Jakarta     |

  @usecase_2
  Scenario: Search hotel for 3 days starting this Saturday
    Given the user opens PHPTravels Web
    When the user input Bandung in destination field
    And the user choose check-in date 25-04-2020
    And the user choose check-out date 28-04-2020
    And the user clicks Search button
    Then show search results for Bandung

  @usecase_3
  Scenario: Search most expensive hotel AND most expensive room
    Given the user opens PHPTravels Web
    When the user input Bandung in destination field
    And the user choose check-in date 25-04-2020
    And the user choose check-out date 28-04-2020
    And the user add child field by 1
    And the user clicks Search button
    And the user clicks High to Low filter
    And the user choose most top hotel
    And the user choose most expensive room
    Then show checkout booking page