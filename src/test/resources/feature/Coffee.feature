Feature: Serve Coffee

  Scenario Outline: buying a cup of coffee
    Given there is <amount> left
    And i have payed <money>
    And i have chosen the <amountOfCoffee> i want
    Then i should get <number> coffee
    Examples:
      | amount | money | amountOfCoffee | number |
      | 10     | 10    | 1              | 1      |