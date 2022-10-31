package tests;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import pages.DemoQA_Page;
import utilities.ConfigReader;
import utilities.Drivers;
import utilities.ReusableMethods;

import java.io.IOException;


public class DemoQA_ElementsPage_Test extends ReusableMethods {

    final static Logger logger = Logger.getLogger(Test.class);

    @Test
    public void Test001() throws IOException {

        logger.info("Main Page Test Started");

        Drivers.getDriver().get(ConfigReader.getProperty("demoQAUrl"));
        DemoQA_Page demoQA_page=new DemoQA_Page();

        demoQA_page.menu_elements.click();
        String expected1=demoQA_page.page_elements.getText();
        Assert.assertTrue(expected1.contains("Elements"));

        TakeSnapShot(Drivers.getDriver(),ConfigReader.getProperty("screenShotPath")+PicList().get(0));

        logger.info("Main Page Test Completed");
        Drivers.closeDriver();

    }



}
