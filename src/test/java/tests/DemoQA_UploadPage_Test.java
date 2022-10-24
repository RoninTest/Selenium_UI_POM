package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.DemoQA_Upload_Page;
import utilities.ConfigReader;
import utilities.Drivers;

public class DemoQA_UploadPage_Test {

    @Test
    public void Tes001(){
        Drivers.getDriver().get(ConfigReader.getProperty("demoQaDownloadUpload"));
        DemoQA_Upload_Page demoQAUploadPage=new DemoQA_Upload_Page();
        demoQAUploadPage.uploadButton
                .sendKeys("C:\\Users\\Eren\\Desktop\\Alieren\\TESTS\\Java_Selenium_UI\\uploadpic.jpg");

        Assert.assertTrue(demoQAUploadPage.uploadFilePath.isDisplayed());

        Drivers.closeDriver();

    }


}
