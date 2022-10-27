package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Drivers;

public class DemoQA_Slider_Page {
    public DemoQA_Slider_Page() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }

    @FindBy (className = "main-header")
    public WebElement headerSlider;

    @FindBy (css="input[type='range']")
    public WebElement slider;

    @FindBy(id="sliderValue")
    public WebElement sliderValue;





}
