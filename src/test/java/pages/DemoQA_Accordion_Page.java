package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Drivers;

public class DemoQA_Accordion_Page {

    public DemoQA_Accordion_Page() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }

    @FindBy (className = "main-header")
    public WebElement headerAccordion;

    @FindBy (xpath="//div[@class='card'][1]/div[2]")
    public  WebElement firstCard;

    @FindBy (id="section1Heading")
    public  WebElement firstCardHeader;

    @FindBy (xpath = "//div[@class='card'][1]/div[2]")
    public WebElement firstCardAttribute;

}
