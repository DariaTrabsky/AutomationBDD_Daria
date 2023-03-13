package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User_MgtPage {

    @FindBy(tagName = "//h2[contains(text(),'Register New User')]")
    public WebElement headerTitle;


    @FindBy(id = "practice-form")
    public WebElement loginBtn;

    @FindBy(id = "access-db-btn")
    public WebElement accessDbBtn;




}
