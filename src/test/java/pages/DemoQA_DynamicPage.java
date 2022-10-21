package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Drivers;

public class DemoQA_DynamicPage {
    public DemoQA_DynamicPage() {

        PageFactory.initElements(Drivers.getDriver(),this);
    }

    @FindBy (xpath = "//div[@class='main-header']")
    public WebElement headaer;

    @FindBy (xpath = "//div/p")
    public WebElement randomId;

    @FindBy (xpath="//button[@id='enableAfter']")
    public WebElement enableAfterButton;

    @FindBy (xpath = "//button[@id='colorChange']")
    public WebElement colorChangeButton;

    @FindBy (xpath = "//button[@id='visibleAfter']")
    public WebElement visibleAfterButton;
}
