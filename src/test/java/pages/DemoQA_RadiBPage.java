package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Drivers;

public class DemoQA_RadiBPage {

    public DemoQA_RadiBPage() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }

    @FindBy (xpath = "//div[contains(text(),'Radio Button')]")
    public WebElement header;

    @FindBy(xpath="//label[contains(text(),'Yes')]")
    public WebElement yes;

    @FindBy(xpath="//span[@class='text-success']")
    public WebElement yesAssert;

    @FindBy(xpath="//label[contains(text(),'Impressive')]")
    public WebElement impressive;

    @FindBy(xpath = "//span[@class='text-success']")
    public WebElement impressiveAssert;

    @FindBy (xpath = "//label[@for='noRadio']")  // ???? How Can I test disabled radiobutton ?
    public WebElement no;


}
