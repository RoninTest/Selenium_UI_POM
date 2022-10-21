package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.DemoQA_UpD_Page;
import utilities.ConfigReader;
import utilities.Drivers;

import java.io.File;

public class DemoQA_UpD_Test {
    DemoQA_UpD_Page upDPage=new DemoQA_UpD_Page();
    String filePath;
    String fileName;

    @Before
    public void Test000(){

        Drivers.getDriver().get(ConfigReader.getProperty("demoQAdonwloadUpload"));
        Assert.assertTrue(upDPage.header.isDisplayed());
    }

    @Test
    public void Test001(){

        upDPage.download.click();
        filePath="C:\\Users\\Eren\\Downloads";
        fileName="sampleFile.jpeg";
        boolean isDownload=isFileDownload(filePath,fileName);
        Assert.assertTrue(isDownload);

        Drivers.closeDriver();

    }

    public static boolean isFileDownload(String downloadPath,String fileName){
        File searchFile=new File(downloadPath);
        File[] files=searchFile.listFiles();

        for (int i=0; i<files.length;i++){
            if (files[i].getName().equals(fileName)){
                return true;
            }
        }
        return false;
    }
}
