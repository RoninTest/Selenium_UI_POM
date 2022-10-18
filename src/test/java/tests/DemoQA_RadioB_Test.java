package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import pages.DemoQA_RadiBPage;
import utilities.ConfigReader;
import utilities.Drivers;

public class DemoQA_RadioB_Test {

    @Test
    public void Test001(){
        Drivers.getDriver().get(ConfigReader.getProperty("demoQARadiButton"));
        DemoQA_RadiBPage radiBPage=new DemoQA_RadiBPage();

        String element1=radiBPage.header.getText();
        Assert.assertEquals("Radio Button",element1);

        radiBPage.yes.click();
        Assert.assertTrue(radiBPage.yesAssert.isDisplayed());

        radiBPage.impressive.click();
        Assert.assertTrue(radiBPage.impressiveAssert.isDisplayed());

        radiBPage.no.click();
        Assert.assertTrue(radiBPage.no.isEnabled());

        Drivers.closeDriver();
    }

    @After
    public void exit(){
        Drivers.closeDriver();
    }
}
