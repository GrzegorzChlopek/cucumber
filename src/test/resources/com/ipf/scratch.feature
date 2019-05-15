Feature: The user withdraws money from the account

  Scenario: User trying to withdraw more than has on account

    Given I have account with balance 200 PLN

    When  I try withdraws 500 PLN

    Then  I see notice that withdraws amount is too much
    And   Information about account balance
    And   User check account balance.