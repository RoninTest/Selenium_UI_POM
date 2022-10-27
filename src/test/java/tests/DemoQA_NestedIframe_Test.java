package tests;

import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.DemoQA_NestedIframe_Page;
import utilities.ConfigReader;
import utilities.Drivers;

public class DemoQA_NestedIframe_Test {

    DemoQA_NestedIframe_Page nestedIframePage=new DemoQA_NestedIframe_Page();
    @Before
    public void setUp(){
        Drivers.getDriver().get(ConfigReader.getProperty("demoQANestedIframe"));

        Assert.assertTrue(nestedIframePage.headerNestedIframe.isDisplayed());

    }

    @Test
    public void Test001(){

        Drivers.getDriver().switchTo().frame(nestedIframePage.iframeOne);

        Assert.assertTrue(nestedIframePage.iframeOneBody.isDisplayed());
        Drivers.closeDriver();
    }

    @Test
    public void Test002(){
        Drivers.getDriver().switchTo().frame(nestedIframePage.iframeOne);
        //We try to find "Child Frame"
        Drivers.getDriver().switchTo().frame(0);

        Assert.assertTrue(nestedIframePage.childFrameText.isDisplayed());

        //to go main frame
        Drivers.getDriver().switchTo().parentFrame();
        Drivers.getDriver().switchTo().parentFrame();
        Assert.assertTrue(nestedIframePage.headerNestedIframe.isDisplayed());

        Drivers.closeDriver();

    }

}
