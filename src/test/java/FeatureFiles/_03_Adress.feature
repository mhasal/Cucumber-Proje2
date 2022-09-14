Feature: Addadress Functionality

  Background:
    Given Navigate to basqar

    When Enter username and password and click login button

    Then User should login successfuly


  Scenario Outline: Addadress

    And Click on the element in the Dialog
      | customerButton  |
      | myaccountButton |
      | manageButton    |
      | addNewAdd       |




    When User sending the keys in Dialog content

      | telephone | <phone>   |
      | street    | <street>  |
      | city      | <city>    |
      | zip       | <zipcode> |

    And Click on the element in the Dialog
      | country    |
      | turkey     |
      | saveButton |


    And Success message displayed


    Examples:
      | street      | city     | zipcode | phone  |
      | Esenler     | Istanbul | 12345   | 123456 |
      | Bagcilar    | Ankara   | 56789   | 456789 |
      | Sultanbeyli | Izmir    | 14785   | 147852 |






