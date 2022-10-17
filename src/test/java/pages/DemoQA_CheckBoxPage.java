package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Drivers;

public class DemoQA_CheckBoxPage {

    public DemoQA_CheckBoxPage() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='main-header']")
    public WebElement main_header;

    @FindBy(className = "rct-option rct-option-expand-all")
    public WebElement expandAll;

    @FindBy(xpath = "//span[@class='rct-node-icon'][@xpath='1']")
    public WebElement notes;

    @FindBy(id ="result" )
    public WebElement result;
}
