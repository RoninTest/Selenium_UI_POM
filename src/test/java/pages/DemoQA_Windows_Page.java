package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Drivers;

public class DemoQA_Windows_Page {

    public DemoQA_Windows_Page() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }

    @FindBy (xpath="//div[@class='main-header']")
    public WebElement headerWinPage;

    @FindBy (xpath = "//button[@id='tabButton']")
    public WebElement newTab;

    @FindBy (xpath = "//h1[@id='sampleHeading']")
    public WebElement secondPage;

    @FindBy (xpath = "//button[@id='windowButton']")
    public WebElement newWindow;

    @FindBy (xpath = "//button[@id='messageWindowButton']")
    public  WebElement messageWindow;

    @FindBy (xpath = "//body")
    public WebElement windowMessage;

}
