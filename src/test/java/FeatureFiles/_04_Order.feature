Feature: Product purchase Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario: Create product purchase
    And Click on the element in the Dialog


      | productButton  |
      | sizeButton     |
      | colorButton    |
      | addcartButton  |
      | shopcartButton |
      | proceedcButton |
      | nextButton     |
      | placeoButton   |

    And Purchase verify displayed