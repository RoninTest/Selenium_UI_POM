package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Drivers;

public class DemoQA_ButtonsPage {

    public DemoQA_ButtonsPage() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }

    @FindBy (xpath = "//div[@class='main-header']")
    public WebElement header;

    /* Double Click Button */
    @FindBy (id = "doubleClickBtn")
    public WebElement doubleClickButton;

    @FindBy(id="doubleClickMessage")
    public WebElement assertDoubleClickButton;

    /* Right Click Button */
    @FindBy (xpath = "//div[@class='mt-4']//button[@id='rightClickBtn']")
    public WebElement rightClickBtn;

    @FindBy (id="rightClickMessage")
    public WebElement rightClickMessage;


    /* Click Me */
    @FindBy(xpath="//div[last()]/button")  //
    public WebElement clickMe;

    @FindBy (id="dynamicClickMessage")
    public WebElement dynamicClickMessage;
}
