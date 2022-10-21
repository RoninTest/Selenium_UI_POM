package tests;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.interactions.Actions;
import pages.DemoQA_ButtonsPage;
import utilities.ConfigReader;
import utilities.Drivers;

public class DemoQA_Button_Test {

    DemoQA_ButtonsPage buttonsPage=new DemoQA_ButtonsPage();
    Actions act=new Actions(Drivers.getDriver());

    @Before
        public void Test000(){

        Drivers.getDriver().get(ConfigReader.getProperty("demoQAButtons"));
        Assert.assertTrue(buttonsPage.header.isDisplayed());

    }

    @Test
    public void Test001(){


        act.doubleClick(buttonsPage.doubleClickButton).perform();

        String expected1="You have done a double click";
        String actual1=buttonsPage.assertDoubleClickButton.getText();

        Assert.assertEquals(expected1,actual1);
    }

    @Test
    public void Test002(){

        act.contextClick(buttonsPage.rightClickBtn).perform();

        String expected2="You have done a right click";
        String actual2=buttonsPage.rightClickMessage.getText();

        Assert.assertEquals(expected2,actual2);
    }



    @Test
    public void Test003(){

        buttonsPage.clickMe.click();

        String expected3="You have done a dynamic click";
        String actual3=buttonsPage.dynamicClickMessage.getText();

        Assert.assertEquals(expected3,actual3);

        Drivers.closeDriver();
    }

}
