package tests;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import pages.DemoQA_Page;
import utilities.ConfigReader;
import utilities.Drivers;

public class DemoQA_ElementsPage_Test {



    @Test
    public void Test001(){
        Drivers.getDriver().get(ConfigReader.getProperty("demoQAUrl"));
        DemoQA_Page demoQA_page=new DemoQA_Page();

        demoQA_page.menu_elements.click();
        String expected1=demoQA_page.page_elements.getText();
        Assert.assertTrue(expected1.contains("Elements"));


    }

    @After
    public void exit(){
        Drivers.closeDriver();
    }






}
