package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Drivers;

public class DemoQA_NestedIframe_Page {

    public DemoQA_NestedIframe_Page() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }

    @FindBy (xpath = "//div[@class='main-header']")
    public WebElement headerNestedIframe;

    @FindBy (id = "frame1")
    public WebElement iframeOne;

    @FindBy (tagName = "body")
    public WebElement iframeOneBody;

    @FindBy (tagName = "p")
    public WebElement childFrameText;


}
