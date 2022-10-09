Feature: This feature would be creating a calculator for Add and Subtract
 @sanity
  Scenario: To Add two numbers
    Given I have a calculator
    When I add 4 and 5
    Then I should get the result as 9

  Scenario: To Subtract two numbers
    Given I have a calculator
    When I subtract 10 and 5
    Then I should get the result as 5

  Scenario Outline: To Add two numbers
    Given I have a calculator
    When I enter the number1 as <Number1> and number2 as <Number2>
    Then I should get the result as <result>

    Examples: 
      | Number1 |  | Number2 |  | result |
      |       3 |  |       2 |  |      5 |
      |       6 |  |       4 |  |     10 |
      |       5 |  |      10 |  |     10 |

   Scenario: To Add two numbers
    Given I have a calculator
    When I add below numbers
      | 3 |
      | 2 |
      | 5 |
      | 4 |
      | 3 |
    Then I should get the result as 17
