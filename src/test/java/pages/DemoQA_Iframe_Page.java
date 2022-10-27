package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Drivers;

public class DemoQA_Iframe_Page {

    public DemoQA_Iframe_Page() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }

    @FindBy (xpath = "//div[@class='main-header']")
    public WebElement headerIframe;

    @FindBy (id = "sampleHeading")
    public  WebElement iframeFirstElement;

    @FindBy (id = "frame1")
    public WebElement frame1id;


    @FindBy (id="frame2")
    public WebElement frame2id;

    @FindBy (css = "div[id='framesWrapper'] div")
    public WebElement parentFrameText;

}
