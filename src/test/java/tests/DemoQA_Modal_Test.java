package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoQA_Modal_Page;
import utilities.ConfigReader;
import utilities.Drivers;

import java.time.Duration;

public class DemoQA_Modal_Test extends DemoQA_Modal_Page{

    WebDriverWait wait;
    @Before
    public void setUp(){

        Drivers.getDriver().get(ConfigReader.getProperty("demoQaModals"));
        Assert.assertTrue(headerModal.isDisplayed());
    }

    @Test
    public void Test001(){
        showSmallModal.click();
        wait=new WebDriverWait(Drivers.getDriver(), Duration.ofSeconds(6));
        wait.until(ExpectedConditions.elementToBeClickable(closeSmallModalButton)).click();
        Assert.assertTrue(headerModal.isDisplayed());

        Drivers.closeDriver();
    }

    @Test
    public void Test002(){

        largeModelButton.click();
        closeLargeModal.click();
        Assert.assertTrue(headerModal.isDisplayed());

        Drivers.closeDriver();
    }
}
