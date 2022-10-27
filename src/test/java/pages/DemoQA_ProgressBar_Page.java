package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Drivers;

public class DemoQA_ProgressBar_Page {

    public DemoQA_ProgressBar_Page() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }
    @FindBy (className = "main-header")
    public WebElement headerBar;

    @FindBy (id="startStopButton")
    public WebElement startStopButton;

    @FindBy (css = "div[role='progressbar']")
    public WebElement progresBar;

    @FindBy (id="resetButton")
    public WebElement resetButton;


}
