package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class OthersPage {

    public OthersPage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(id = "btn-status")
    public WebElement statusBtn;

    @FindBy(id = "toggle-btn")
    public WebElement toggleBtn;

}


