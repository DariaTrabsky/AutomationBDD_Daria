package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CalendarPage;
import pages.HomePage;
import utils.BrowserUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalendarSteps {
    CalendarPage page;

    HomePage homePage;

    public CalendarSteps() {

        page = new CalendarPage();
        homePage = new HomePage();
    }

    @When("I click nav button {string}")
    public void i_click_nav_button(String navBtn) {
        switch (navBtn.toLowerCase()) {
            case "calendar":
                BrowserUtils.click(homePage.calendarBtn);
                break;
            case "selectors":
                BrowserUtils.click(homePage.selectorsBtn);
                break;
            case "others":
                BrowserUtils.click(homePage.othersBtn);
                break;
            default:
                System.out.println("Invalid button");

        }
        //     System.out.println("click nav button Selectors" + navBtn);
    }

    @When("I click a button {string}")
    public void i_click_a_button(String calendarBtn) {
        switch (calendarBtn) {
            case "endDateInput":
                BrowserUtils.click(page.endDateInputField);
                break;
            case "calendarTomorrowDate":
                BrowserUtils.click(page.calendarTomorrowDate);
                break;
            case "submitCalendarButton":
                BrowserUtils.click(page.submitCalendarBtn);
                break;
            default:
                System.out.println("Invalid button");

        }

    }

    @Then("text will display {int} day difference")
    public void text_will_display_day_difference(Integer int1) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/dd/yyyy");
        LocalDate current = LocalDate.now();
        String currentDate = formatter.format(current);
        String tomorrowDate = formatter.format(current.plusDays(1));

        String expectedDate = "There are 1 days between " + currentDate + " and " + tomorrowDate + "";
        String actualDate = page.resultText.getText();
        BrowserUtils.assertEquals(actualDate, expectedDate);
        BrowserUtils.quitDriver();
    }

    @Then("Verify text will contain current date")
    public void verify_text_will_contain_current_date() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/dd/yyyy");
        LocalDate current = LocalDate.now();
        String currentDate = formatter.format(current);
        String actualText = page.resultText.getText();
        BrowserUtils.assertTrue(actualText.contains(currentDate));
        BrowserUtils.quitDriver();
    }

}

