package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Drivers;

public class DemoQA_AutoComplete_Page {
    public DemoQA_AutoComplete_Page() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }

    @FindBy (className = "main-header")
    public WebElement headerAutoComplete;

    @FindBy (id = "autoCompleteSingleInput")
    public WebElement textBox;

    @FindBy (id="react-select-3-option-0")
    public WebElement colorName;

    @FindBy (id="autoCompleteSingleContainer")
    public WebElement box;


}
