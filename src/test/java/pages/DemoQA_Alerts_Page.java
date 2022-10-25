package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Drivers;

public class DemoQA_Alerts_Page {
    public DemoQA_Alerts_Page() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='main-header']")
    public WebElement headerAlert;

    @FindBy (xpath = "//button[@id='alertButton']")
    public WebElement alertButton;

    @FindBy (xpath = "//button[@id='timerAlertButton']")
    public WebElement timerAlertButton;

    @FindBy (xpath = "//button[@id='confirmButton']")
    public WebElement confirmButton;

    @FindBy (xpath = "//button[@id='promtButton']")
    public WebElement promtButton;

}
