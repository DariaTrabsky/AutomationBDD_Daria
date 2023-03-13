package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SelectorsPage;

public class SelectorsSteps {

    SelectorsPage page;

    public SelectorsSteps() {

        page = new SelectorsPage();
    }


    @And("I click {string} in Car section")
    public void iClickInCarSection(String color) {
        System.out.println("click on Red in Car section");
        System.out.println("click on Blue in Car section");
        System.out.println("click on Yellow in Car section");
    }

    @Then("Verify displayed text in Car section should be Red")
    public void verify_displayed_text_in_car_section_should_be_red() {
        System.out.println("Verify displayed text is Red");
    }

    @Then("Verify displayed text in Car section should be Blue")
    public void verify_displayed_text_in_car_section_should_be_blue() {
        System.out.println("Verify displayed text is Blue");
    }

    @Then("Verify displayed text in Car section should be Yellow")
    public void verify_displayed_text_in_car_section_should_be_yellow() {
        System.out.println("Verify displayed text is Yellow");


    }
}