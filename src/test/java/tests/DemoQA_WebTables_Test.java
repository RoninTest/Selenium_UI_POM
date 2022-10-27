package tests;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.Keys;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoQA_WebTablesPage;
import utilities.ConfigReader;
import utilities.Drivers;


import java.time.Duration;

public class DemoQA_WebTables_Test {

    DemoQA_WebTablesPage webTablesPage=new DemoQA_WebTablesPage();
    Actions actions=new Actions(Drivers.getDriver());
    WebDriverWait wait;
    @Before
    public void Test000(){
        Drivers.getDriver().get(ConfigReader.getProperty("demoQAWebTables"));
    }

    @Test
    public void Test001()  {

        wait=new WebDriverWait(Drivers.getDriver(), Duration.ofSeconds(20) );
        Assert.assertTrue(webTablesPage.header.isDisplayed());

        webTablesPage.buttonAdd.click();
        String expected1="Registration Form";
        String actual1=webTablesPage.addCustomerAssert.getText();
        Assert.assertEquals(expected1,actual1);


        /* **Fill the form** */
        wait.until(ExpectedConditions.elementToBeClickable(webTablesPage.addCustomer));
        actions.click(webTablesPage.addCustomer)
                .sendKeys("AAAA")
                .sendKeys(Keys.TAB)
                .sendKeys("BBBB")
                .sendKeys(Keys.TAB)
                .sendKeys("ccccc@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("20")
                .sendKeys(Keys.TAB)
                .sendKeys("5000")
                .sendKeys(Keys.TAB)
                .sendKeys("IT")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();

        webTablesPage.searchBox.sendKeys("BBBB");
        String actual2=webTablesPage.findLastName.getText();
        String expected2="BBBB";
        Assert.assertEquals(expected2,actual2);


        webTablesPage.searchBox.clear();
        webTablesPage.deleteCustomer.click();
        webTablesPage.searchBox.sendKeys("AAAA");
        Assert.assertNotEquals("AAAA",webTablesPage.customerAssert.getText());

        Drivers.closeDriver();
    }


}
