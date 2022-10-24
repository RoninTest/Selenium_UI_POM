package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Drivers;

public class DemoQA_Upload_Page {

    public DemoQA_Upload_Page() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }
    @FindBy (xpath = "//input[@id='uploadFile']")
    public WebElement uploadButton;

    @FindBy (xpath = "//p[@id='uploadedFilePath']")
    public WebElement uploadFilePath;
}
