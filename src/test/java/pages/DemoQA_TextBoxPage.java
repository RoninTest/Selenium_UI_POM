package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Drivers;

public class DemoQA_TextBoxPage {

    public DemoQA_TextBoxPage() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }

    @FindBy (xpath = "//li[@class=\"btn btn-light active\"]")
    public WebElement ep_Textbox;

    @FindBy (xpath = "//input[@id='userName']")
    public WebElement ep_FullName;

    @FindBy(id = "userName")
    public WebElement fullName_Field;

    @FindBy (id="name")
    public WebElement registerName;



}
