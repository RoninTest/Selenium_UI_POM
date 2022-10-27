package tests;

import org.assertj.core.api.SoftAssertions;

import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoQA_ToolTip_Page;
import utilities.ConfigReader;
import utilities.Drivers;

import java.time.Duration;

public class DemoQA_ToolTip_Test extends DemoQA_ToolTip_Page {

    SoftAssertions assertions=new SoftAssertions();
    Actions actions=new Actions(Drivers.getDriver());
    WebDriverWait wait;

    @Before
    public void Test000(){
        Drivers.getDriver().get(ConfigReader.getProperty("demoQaToolTip"));

        assertions.assertThat(headerToolTip.getText())
                .as("ToolTip Text")
                .isEqualTo("Tool Tips");

    }

    @Test
    public void Test001(){
        actions.moveToElement(toolTipButton).perform();

        EasyWay(toolTipButton,"aria-describedby","buttonToolTip");

        String valueTool=toolTipButton.getAttribute("aria-describedby");
        assertions.assertThat(valueTool)
                .as("ToolTip Button Text")
                .isEqualTo("buttonToolTip");

        Drivers.closeDriver();
    }

    @Test
    public void Test002(){
        actions.moveToElement(toolTipTextField).perform();

        EasyWay(toolTipTextField,"aria-describedby","textFieldToolTip");

        String valueTool=toolTipTextField.getAttribute("aria-describedby");
        assertions.assertThat(valueTool)
                .as("Text Field Text")
                .isEqualTo("textFieldToolTip");

        Drivers.closeDriver();
    }

    public void EasyWay(WebElement element,String attribute, String value){
        wait=new WebDriverWait(Drivers.getDriver(), Duration.ofSeconds(2));
        wait.pollingEvery(Duration.ofMillis(1));
        wait.until(ExpectedConditions.attributeToBe(element,attribute,value));
    }


}
