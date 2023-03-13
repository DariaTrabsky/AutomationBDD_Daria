Feature: Others page scenarios

  @smoke @regression @US2001
  Scenario: Verify Disabled button is disabled initially
    #Given I navigate to homepage
    When I click nav button "Others"
    Then Verify Disabled button is disabled

  @US2002
  Scenario: Verify Toggle button enables disabled button on Others page
    #Given I navigate to homepage
    When I click nav button "Others"
    Then Verify Disabled button is disabled
    When I click on Toggle button
    Then Disabled button switches to enable

