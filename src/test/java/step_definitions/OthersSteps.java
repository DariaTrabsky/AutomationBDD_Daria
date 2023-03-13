package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OthersPage;
import utils.BrowserUtils;

import javax.sql.rowset.BaseRowSet;

public class OthersSteps {

    OthersPage page;

    public OthersSteps(){
        page = new OthersPage();
    }
    @When("I open Others page")
    public void i_open_others_page() {

        System.out.println("opened others page");
    }

    @Then("Verify Disabled button is disabled")
    public void verify_disabled_button_is_disabled() {
        String disableText = "DISABLED BUTTON";
        BrowserUtils.assertEquals(page.statusBtn.getText(),disableText);
        BrowserUtils.isDisabled(page.statusBtn);
        BrowserUtils.quitDriver();
    }
    @When("I click on Toggle button")
    public void i_click_on_toggle_button() {
        BrowserUtils.sleep(2000);
        BrowserUtils.click(page.toggleBtn);
      //System.out.println("Toggle button has been clicked on");
    }
    @Then("Disabled button switches to enable")
    public void disabled_button_switches_to_enable() {
        String enableText = "ENABLED BUTTON";
        BrowserUtils.assertEquals(page.statusBtn.getText(),enableText);
        BrowserUtils.isDisabled(page.statusBtn);
        BrowserUtils.quitDriver();
      //  System.out.println("Disabled button switches is enabled");
    }
}
