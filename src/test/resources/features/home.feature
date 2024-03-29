Feature: Homepage scenarios

  @HomeScenarios @US1021
  Scenario: Test Header
    #Given I navigate to homepage
    Then I should see header as "Automation with Selenium"


  @US1022
  Scenario: Test navigation buttons
    #Given I navigate to homepage
    Then Verify button "Home" is displayed
    Then Verify button "Calendar" is displayed
    Then Verify button "User-Mgt" is displayed
    Then Verify button "Others" is displayed
    Then Verify button "Tables" is displayed
