package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Drivers;

public class DemoQA_Modal_Page {
    public DemoQA_Modal_Page() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }



    @FindBy (xpath = "//div[@class='main-header']")
    public WebElement headerModal;

    @FindBy (xpath = "//button[@id='showSmallModal']")
    public WebElement showSmallModal;

    @FindBy (css = "div.modal-body")
    public WebElement modalBody;

    @FindBy (xpath = "//button[@id='closeSmallModal']")
    public WebElement closeSmallModalButton;

    @FindBy (id = "showLargeModal")
    public WebElement largeModelButton;

    @FindBy (xpath = "//button[@id='closeLargeModal']")
    public WebElement closeLargeModal;

}
