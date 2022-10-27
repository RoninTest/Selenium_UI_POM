package tests;

import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoQA_ProgressBar_Page;
import utilities.ConfigReader;
import utilities.Drivers;

import java.time.Duration;

public class DemoQA_ProgressBar_Test extends DemoQA_ProgressBar_Page {

    SoftAssertions assertions=new SoftAssertions();
    @Before
    public void Test000(){
        Drivers.getDriver().get(ConfigReader.getProperty("demoQaProgresBar"));
        Assert.assertTrue(headerBar.isDisplayed());
    }

    @Test
    public void Test001(){

        startStopButton.click();
        Waiting();
        startStopButton.click();

        assertions.assertThat(progresBar.getAttribute("aria-valuenow"))
                .as("progressBar 60")
                .isEqualTo("60");
        assertions.assertAll();

        Drivers.closeDriver();
    }
    @Test
    public void Test002(){
        startStopButton.click();
        Waiting();

        WebDriverWait wait1=new WebDriverWait(Drivers.getDriver(),Duration.ofSeconds(20));
        wait1.until(ExpectedConditions.elementToBeClickable(resetButton));

        assertions.assertThat(resetButton.getText()).as("resetButton Text").isIn("Reset");
        assertions.assertAll();

        Drivers.closeDriver();
    }

    public void Waiting(){
        WebDriverWait wait=new WebDriverWait(Drivers.getDriver(),Duration.ofSeconds(20));
        wait.pollingEvery(Duration.ofMillis(10));
        wait.until(ExpectedConditions.attributeToBe(progresBar,"aria-valuenow","60"));
    }

}
