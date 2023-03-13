Feature: Calendar page Scenarios

  @US1015
  Scenario: Choosing date from calendar
    #Given I navigate to homepage
    When I click nav button "Calendar"
    When I click a button "endDateInput"
    When I click a button "calendarTomorrowDate"
    When I click a button "submitCalendarButton"
    Then text will display 1 day difference
  @US1016
    Scenario: Choosing date from the calendar - Start date test
      #Given I navigate to homepage
      When I click nav button "Calendar"
      And I click a button "endDateInput"
      And I click a button "calendarTomorrowDate"
      And I click a button "submitCalendarButton"
      Then Verify text will contain current date
