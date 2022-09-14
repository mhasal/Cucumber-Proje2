Feature: Create user Functionality

  Scenario Outline: Create user

    Given Navigate to basqar

    And Click on the element in the Dialog
      | registerBtn |


    And User sending the keys in Dialog content
      | firstname       | <firstname>       |
      | lastname        | <lastname>        |
      | emailAdress     | <emailAdress>     |
      | password        | <password>        |
      | passwordConfirm | <passwordConfirm> |

    And Click on the element in the Dialog
      | createBtn |

    And Success message should be displayed



    Examples:
      | firstname | lastname    | emailAdress         | password       | passwordConfirm |
      | Java22345   | Selenium22345 | grup2223245@gmail.com | 12234256223Gr- | 12234256223Gr-  |
