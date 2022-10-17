package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Drivers;

public class DemoQA_Page {

    public DemoQA_Page(){
        PageFactory.initElements(Drivers.getDriver(),this);
    }
    @FindBy(xpath ="//h5[contains(text(),'Elements')]")
    public WebElement menu_elements;

    @FindBy(xpath = "//div[@class=\"main-header\"]")
    public WebElement page_elements;
}
