package tests;


import org.junit.Assert;


import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.*;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoQA_Alerts_Page;
import utilities.ConfigReader;
import utilities.Drivers;

import java.time.Duration;



public class DemoQA_Alerts_Test {

    DemoQA_Alerts_Page demoQAAlertsPage = new DemoQA_Alerts_Page();
    WebDriverWait wait;

    @Before
    public void setUp() {

        Drivers.getDriver().get(ConfigReader.getProperty("demoQaAlerts"));
        Assert.assertTrue(demoQAAlertsPage.headerAlert.isDisplayed());
    }


        @Test
        public void Test001() {
            demoQAAlertsPage.alertButton.click();
            wait = new WebDriverWait(Drivers.getDriver(), Duration.ofSeconds(3));
            wait.until(ExpectedConditions.alertIsPresent());

            Drivers.closeDriver();
        }

        @Test
        public void Test002() {

            demoQAAlertsPage.timerAlertButton.click();
            wait = new WebDriverWait(Drivers.getDriver(), Duration.ofSeconds(6));
            wait.until(ExpectedConditions.alertIsPresent());
            Drivers.getDriver().switchTo().alert().accept();

            Drivers.closeDriver();
        }

    @Test
    public void Test003() {
        demoQAAlertsPage.confirmButton.click();
        wait = new WebDriverWait(Drivers.getDriver(), Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());
        Drivers.getDriver().switchTo().alert().dismiss();

        Drivers.closeDriver();
    }

    @Test
    public void Test004() {
        demoQAAlertsPage.promtButton.click();
        wait = new WebDriverWait(Drivers.getDriver(), Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());
        Drivers.getDriver().switchTo().alert().sendKeys("Hello");
        Drivers.getDriver().switchTo().alert().accept();

        Drivers.closeDriver();
    }
    }










