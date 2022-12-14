package tests;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.ConfigReader;
import utilities.Drivers;
import utilities.ReusableMethods;

import java.io.IOException;


public class DemoQA_CheckBox_Test extends ReusableMethods {

    WebElement element,element1,element2,element3;
    @Test
    public void Test001() throws IOException {
        Drivers.getDriver().get(ConfigReader.getProperty("demoQACheckBox"));

        element=Drivers.getDriver().findElement(By.xpath("//div[@class='main-header']"));
        Assert.assertTrue(element.isDisplayed());
        element1=Drivers.getDriver().findElement(By.xpath("//button[@class='rct-option rct-option-expand-all']"));
        element1.click();
        element2=Drivers.getDriver().findElement(By.xpath("//span[@class='rct-text']//label[@for='tree-node-notes']//span[@class='rct-checkbox']"));
        element2.click();
        element3=Drivers.getDriver().findElement(By.id("result"));
        Assert.assertTrue(element3.isDisplayed());

        TakeSnapShot(Drivers.getDriver(),ConfigReader.getProperty("screenShotPath")+PicList().get(3));

        Drivers.closeDriver();
    }


}
