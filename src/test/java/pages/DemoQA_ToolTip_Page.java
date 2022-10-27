package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Drivers;

public class DemoQA_ToolTip_Page {

    public DemoQA_ToolTip_Page() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }

    @FindBy(className = "main-header")
    public WebElement headerToolTip;

    @FindBy (id="toolTipButton")
    public WebElement toolTipButton;

    @FindBy (id="toolTipTextField")
    public  WebElement toolTipTextField;
}
