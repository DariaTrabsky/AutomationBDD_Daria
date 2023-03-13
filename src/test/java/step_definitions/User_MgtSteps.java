package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.User_MgtPage;
import utils.BrowserUtils;

public class User_MgtSteps {
    User_MgtPage page;
    HomePage homePage;

    public User_MgtSteps() {
        page = new User_MgtPage();
        homePage = new HomePage();
    }

    @When("I click on nav button {string}")
    public void i_click_on_nav_button(String string) {
        BrowserUtils.click(homePage.usermgtBtn);
    }

    @Then("I should see title as {string}")
    public void i_should_see_title_as(String string) {
        String expected = "Register New User";
        BrowserUtils.assertEquals(page.headerTitle.getText(), expected);
    }

    @Then("Verify button {string} is present")
    public void verifyBtnIsPresent(String btn) {
        switch (btn) {
            case "Login":
                BrowserUtils.isDisplayed(page.loginBtn);
                break;
            case "Access DB":
                BrowserUtils.isDisplayed(page.accessDbBtn);
                break;
            default:
                System.out.println("Invalid button");
        }
    }
}