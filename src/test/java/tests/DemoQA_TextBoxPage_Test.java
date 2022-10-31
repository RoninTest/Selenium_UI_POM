package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DemoQA_TextBoxPage;
import utilities.ConfigReader;
import utilities.Drivers;
import utilities.ReusableMethods;

import java.io.IOException;

public class DemoQA_TextBoxPage_Test extends ReusableMethods {



    @Test
    public void Test001() throws IOException {

        Drivers.getDriver().get(ConfigReader.getProperty("demoQAUrlTextBox"));
        DemoQA_TextBoxPage demoQA_textBoxPage=new DemoQA_TextBoxPage();

        Actions actions=new Actions(Drivers.getDriver());

        Assert.assertTrue(demoQA_textBoxPage.ep_FullName.isDisplayed());

        TakeSnapShot(Drivers.getDriver(),ConfigReader.getProperty("screenShotPath")
                +PicList().get(1));

        actions.click(demoQA_textBoxPage.fullName_Field).sendKeys("AAAA")
                .sendKeys(Keys.TAB)
                .sendKeys("AAAA@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("Los Angeles")
                .sendKeys(Keys.TAB)
                .sendKeys("Los Angeles")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();
        String expected = demoQA_textBoxPage.registerName.getText();
        String actual="Name:AAAA";
        Assert.assertEquals(expected,actual);

        TakeSnapShot(Drivers.getDriver(),ConfigReader.getProperty("screenShotPath")
                +"2.TextBoxPage_2.jpg"+PicList().get(2));

        Drivers.closeDriver();
    }


}
