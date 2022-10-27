package tests;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoQA_Windows_Page;
import utilities.ConfigReader;
import utilities.Drivers;

import java.util.ArrayList;
import java.util.List;

public class DemoQA_WindowsFrame_Test {

    DemoQA_Windows_Page demoQAWindowsPage=new DemoQA_Windows_Page();


    @Before
    public void Test000(){
        Drivers.getDriver().get(ConfigReader.getProperty("demoQaBrowserWindows"));

            Assert.assertTrue(demoQAWindowsPage.headerWinPage.isDisplayed());
    }

    @Test
    public void Test001()  {
        demoQAWindowsPage.newTab.click();
        List<String> tabs=new ArrayList<>(Drivers.getDriver().getWindowHandles());
        Drivers.getDriver().switchTo().window(tabs.get(1));

        String actual=demoQAWindowsPage.secondPage.getText();
        String expected="This is a sample page";
        Assert.assertEquals(expected,actual);

        Drivers.getDriver().switchTo().window(tabs.get(0));

        Assert.assertTrue(demoQAWindowsPage.headerWinPage.isDisplayed());

            Drivers.closeDriver();
    }



    @Test
    public void Test002(){
        demoQAWindowsPage.newWindow.click();

        List<String> tabs=new ArrayList<>(Drivers.getDriver().getWindowHandles());
        Drivers.getDriver().switchTo().window(tabs.get(1));

        String actual=demoQAWindowsPage.secondPage.getText();
        String expected="This is a sample page";
        Assert.assertEquals(expected,actual);

        Drivers.getDriver().switchTo().window(tabs.get(1)).close();
       Drivers.closeDriver();
    }



    @Test
    public void Test003(){

        demoQAWindowsPage.messageWindow.click();

        for (String windowsHandle : Drivers.getDriver().getWindowHandles()){
            Drivers.getDriver().switchTo().window(windowsHandle);
        }

        /* Do something  */

        Drivers.getDriver().close();
        List<String> tabs=new ArrayList<>(Drivers.getDriver().getWindowHandles());
        Drivers.getDriver().switchTo().window(tabs.get(0)).close();

        Drivers.closeDriver();
    }
}
