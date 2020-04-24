@problemB
Feature: Use Case B Scenarios

  @usecase_1
  Scenario Outline: Submit Visa Indonesia to Australia
    Given the user opens PHPTravels Web
    And the user logs in
    When the user clicks Visa button
    And the user choose <baseCountry> as base country
    And the user choose <destinationCountry> as destination country
    And the user choose visa date <Date>
    And the user clicks Submit button
    And the user fill input fields Visa booking with <FirstName>, <LastName>, <PhoneNumber>
    And the user clicks Booking button
    Then visa booking successfully submitted
    Examples:
    | baseCountry | destinationCountry | FirstName | LastName | PhoneNumber | Date       |
    | Indonesia   | Australia          | Sinbad    | Test     | 08888888    | 01-06-2020 |

  @usecase_2
  Scenario Outline: Assert Submitted Visa Invoice
    Given the user opens PHPTravels Web
    And the user logs in
    When the user clicks Visa button
    And the user choose <baseCountry> as base country
    And the user choose <destinationCountry> as destination country
    And the user choose visa date <Date>
    And the user clicks Submit button
    And the user fill input fields Visa booking with <FirstName>, <LastName>, <PhoneNumber>
    And the user clicks Booking button
    And the user clicks Show Invoice button
    Then show booking invoice data <FirstName>, <LastName>, <PhoneNumber>, <Date>
    Examples:
      | baseCountry | destinationCountry | FirstName | LastName | PhoneNumber | Date        |
      | Indonesia   | Australia          | Sinbad    | Test     | 08888888    | 01-06-2020  |