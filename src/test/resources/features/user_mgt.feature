Feature: User-Mgt page Scenarios


  @US4001
  Scenario:  verify title of the page is "Register New User"
    When I click on nav button "User-Mgt"
    Then I should see title as "Register New User"

  @US4002
  Scenario: verify Login button is present
    When I click on nav button "User-Mgt"
    Then Verify button "Login" is present

  @US4003
  Scenario:verify Access DB button is present
    When I click on nav button "User-Mgt"
    Then Verify button "Access DB" is present
