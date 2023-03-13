package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class HomePage {


    public HomePage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }


    @FindBy(xpath = "//nav/a[contains(text(),'Calendar')]")
    public WebElement calendarBtn;

    @FindBy(id = "title")
    public WebElement headerTitle;

    @FindBy(xpath = "//nav/a[contains(text(),'Selectors')]")
    public WebElement selectorsBtn;

    @FindBy(xpath = "//nav/a[contains(text(),'Others')]")
    public WebElement othersBtn;

}
