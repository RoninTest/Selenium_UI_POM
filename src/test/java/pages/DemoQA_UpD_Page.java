package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Drivers;

public class DemoQA_UpD_Page {

    public DemoQA_UpD_Page() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }

    @FindBy (xpath = "//div[@class='main-header']")
    public WebElement header;

    @FindBy (xpath = "//div/a[@id='downloadButton']")
    public WebElement download;

    @FindBy (id="downloadButton")
    public WebElement donwloadFile;
}
