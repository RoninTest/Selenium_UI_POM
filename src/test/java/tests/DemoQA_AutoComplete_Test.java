package tests;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.DemoQA_AutoComplete_Page;
import utilities.ConfigReader;
import utilities.Drivers;

import java.util.List;


public class DemoQA_AutoComplete_Test extends DemoQA_AutoComplete_Page {

    @Before
    public void Tes000(){
        Drivers.getDriver().get(ConfigReader.getProperty("demoQaAutoComplete"));
        Assert.assertTrue(headerAutoComplete.isDisplayed());
    }

    @Test
    public void Test001(){

       textBox.sendKeys("R");

        List<WebElement> colors=Drivers.getDriver().findElements(By.cssSelector("div.auto-complete__option"));

        for (WebElement color : colors){
            color.getText().contains("Red");
        }
        Drivers.closeDriver();

    }

    @Test
    public void Test002(){
        textBox.sendKeys("R");
        colorName.click();
        String text=box.getText();
        text.contains("Red");

        Drivers.closeDriver();
    }


}
