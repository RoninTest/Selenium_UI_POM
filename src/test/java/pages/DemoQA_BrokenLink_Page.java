package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Drivers;

public class DemoQA_BrokenLink_Page {
    public DemoQA_BrokenLink_Page() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }


    @FindBy (xpath="//a[@href='http://demoqa.com']")
    public WebElement validLink;

    @FindBy (xpath="//a[contains(text(),'Click Here for Broken Link')]")
    public WebElement brokenLink;

    @FindBy (xpath = "//div/img[2]")
    public WebElement brokenPicture;




}
