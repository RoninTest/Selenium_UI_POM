package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoQA_DynamicPage;
import utilities.ConfigReader;
import utilities.Drivers;
import java.time.Duration;


public class DemoQA_Dynamic_Test {

    DemoQA_DynamicPage dynamicPage=new DemoQA_DynamicPage();
    WebDriverWait wait;


    @Before
    public void Test000(){
        Drivers.getDriver().get(ConfigReader.getProperty("demoQADynamic"));
        Assert.assertTrue(dynamicPage.headaer.isDisplayed());
    }

    @Test
    public void Test0001(){

        Assert.assertTrue(dynamicPage.randomId.isDisplayed());

    }
    @Test
    public void Test0002(){

        wait=new WebDriverWait(Drivers.getDriver(), Duration.ofSeconds(6));
        wait.until(ExpectedConditions.elementToBeClickable(dynamicPage.enableAfterButton)).click();

        Assert.assertTrue(dynamicPage.visibleAfterButton.isDisplayed());

        Drivers.closeDriver();

    }

    @Test
    public void Test003(){


        String currentClassName=dynamicPage.colorChangeButton.getAttribute("class");

        wait=new WebDriverWait(Drivers.getDriver(), Duration.ofSeconds(6));
        wait.until(ExpectedConditions.attributeToBe(dynamicPage.colorChangeButton,"class","mt-4 text-danger btn btn-primary"));

        String afterClassName=dynamicPage.colorChangeButton.getAttribute("class");

        Assert.assertNotEquals(currentClassName,afterClassName);

        Drivers.closeDriver();

    }


}
