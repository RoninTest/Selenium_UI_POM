package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.interactions.Actions;
import pages.DemoQA_Slider_Page;
import utilities.ConfigReader;
import utilities.Drivers;

public class DemoQA_Slider_Test extends DemoQA_Slider_Page{

    @Before
    public void Test000(){
        Drivers.getDriver().get(ConfigReader.getProperty("demoQaSlider"));
        Assert.assertTrue(headerSlider.isDisplayed());
    }
    @Test
    public void Test001(){

        String actual=sliderValue.getAttribute("value");
        Slider(50,0);
        String expected=sliderValue.getAttribute("value");
        Assert.assertNotEquals(expected,actual);
    }


    private void Slider (int xValue, int yValue){

        Actions act=new Actions(Drivers.getDriver());
        act.dragAndDropBy(slider, xValue,yValue).perform();

    }
}
