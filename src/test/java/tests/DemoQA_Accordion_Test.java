package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoQA_Accordion_Page;
import utilities.ConfigReader;
import utilities.Drivers;

import java.time.Duration;


public class DemoQA_Accordion_Test extends DemoQA_Accordion_Page {
    WebDriverWait wait;
    @Before
    public void Test000(){
        Drivers.getDriver().get(ConfigReader.getProperty("demoQaAccordion"));
        Assert.assertTrue(headerAccordion.isDisplayed());
    }

    @Test
    public void Test001(){
       String name= firstCard.getText();
       boolean isThere= name.contains("Lorem Ipsum");
       Assert.assertTrue(isThere);

       Drivers.closeDriver();
    }

    @Test
    public void Test002(){

        firstCardHeader.click();
        wait=new WebDriverWait(Drivers.getDriver(), Duration.ofSeconds(2));
        wait.until(ExpectedConditions.attributeToBe(firstCardAttribute,"class","collapse"));
        String expected="collapse";
        String actual=firstCardAttribute.getAttribute("class");
        Assert.assertEquals(expected,actual);

        Drivers.closeDriver();
    }

}
