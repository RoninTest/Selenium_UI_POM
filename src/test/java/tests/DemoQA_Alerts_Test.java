package tests;


import org.junit.Assert;


import org.junit.Before;
import org.junit.Test;



import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoQA_Alerts_Page;
import utilities.ConfigReader;
import utilities.Drivers;

import java.time.Duration;



public class DemoQA_Alerts_Test extends DemoQA_Alerts_Page{

    @Before
    public void setUp() {

        Drivers.getDriver().get(ConfigReader.getProperty("demoQaAlerts"));
        Assert.assertTrue(headerAlert.isDisplayed());
    }


        @Test
        public void Test001() {
            alertButton.click();
            Drivers.getDriver().switchTo().alert().accept();

            Drivers.closeDriver();
        }

        @Test
        public void Test002() {

            timerAlertButton.click();
            WebDriverWait wait = new WebDriverWait(Drivers.getDriver(), Duration.ofSeconds(6));
            wait.until(ExpectedConditions.alertIsPresent());
            Drivers.getDriver().switchTo().alert().accept();

            Drivers.closeDriver();
        }

    @Test
    public void Test003() {
        confirmButton.click();
        Drivers.getDriver().switchTo().alert().accept();

        Drivers.closeDriver();
    }

    @Test
    public void Test004() {
        promtButton.click();
        Drivers.getDriver().switchTo().alert().sendKeys("Hello");
        Drivers.getDriver().switchTo().alert().accept();

        Drivers.closeDriver();
    }
    }










