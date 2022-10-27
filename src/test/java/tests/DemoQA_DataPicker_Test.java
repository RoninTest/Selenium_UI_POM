package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.DemoQA_DatePicker_Page;
import utilities.ConfigReader;
import utilities.Drivers;

import java.util.List;

public class DemoQA_DataPicker_Test extends DemoQA_DatePicker_Page {

    @Before
    public void Test000(){
        Drivers.getDriver().get(ConfigReader.getProperty("demoQaDatePicker"));

        Assert.assertTrue(headerName.isDisplayed());
    }

    @Test
    public void Test001(){
      selectedDate("December","2050","10");
      Drivers.closeDriver();
    }

    private void selectedDate(String month, String year, String day){
        dateClick.click();
        Select select=new Select(selectMonth);
        select.selectByVisibleText(month);

        Select select1=new Select(selectYear);
        select1.selectByVisibleText(year);

        List<WebElement> days=Drivers.getDriver().findElements(By.cssSelector("div.react-datepicker__day"));
        for (WebElement allDays : days){
            String oneDay=allDays.getText();
            if (oneDay.equals(day)){
                allDays.click();
                break;
            }
        }
    }
}
