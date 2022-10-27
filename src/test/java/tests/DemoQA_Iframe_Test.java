package tests;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.DemoQA_Iframe_Page;
import utilities.ConfigReader;
import utilities.Drivers;

import java.util.List;

public class DemoQA_Iframe_Test {
    DemoQA_Iframe_Page iframePage=new DemoQA_Iframe_Page();
    @Before
    public void setUp(){
        Drivers.getDriver().get(ConfigReader.getProperty("demoQaFrames"));
        Assert.assertTrue(iframePage.headerIframe.isDisplayed());

    }
    @Test
    public void Test001(){

        //Drivers.getDriver().switchTo().frame(Drivers.getDriver().findElement(By.id("frame1")));
        Drivers.getDriver().switchTo().frame(iframePage.frame1id);
        Assert.assertTrue(iframePage.iframeFirstElement.isDisplayed());
        Drivers.closeDriver();
    }

    @Test
    public void  Test002(){
        Drivers.getDriver().switchTo().frame(iframePage.frame2id);
        Assert.assertTrue(iframePage.iframeFirstElement.isDisplayed());

        Drivers.getDriver().switchTo().parentFrame();
        Assert.assertTrue(iframePage.headerIframe.isDisplayed());

        List<WebElement> elementList=Drivers.getDriver().findElements(By.cssSelector("div[id='framesWrapper'] div"));
        String paragraph=elementList.get(0).getText();
        Assert.assertTrue(paragraph.contains("Sample Iframe page"));

        Drivers.closeDriver();
    }



}
