Feature: Testing of the message endpoint

  Scenario: I can get all the messages
    Given I am authenticated on the messages endpoint
    When I want to see al the messages
    Then I receive a successfull response
    And I can see the expected list of messages


