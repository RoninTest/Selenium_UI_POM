package utilities;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class ReusableMethods {



    // When It requires a reuse method.

    public void ChekInInternetConnection()  {

        try{
            URL url=new URL("https://www.google.com");
            URLConnection connection= url.openConnection();
            connection.connect();
            System.out.println("Enjoy your test. Internet connection OK");
        }catch (MalformedURLException e){
            System.out.println("Enjoy your test. Internet connection OK");
        }catch (IOException e){

           System.out.println("\n"
                    +"*********************** WARNING **************************** "
                    +"\n"
                    +"               Internet is not connected                     "
                    +"\n"
                    +"***********************************************************");
        }

    }

    public void TakeSnapShot(WebDriver webDriver, String  fileWithPath) throws IOException {
        TakesScreenshot scrShot =((TakesScreenshot)webDriver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(fileWithPath);
        FileUtils.copyFile(SrcFile,DestFile);
    }



    public List PicList(){
        List<String> pictureName= new ArrayList<>();

        pictureName.add("1.MainPage.jpg");
        pictureName.add("2.TextBoxPage_1.jpg");
        pictureName.add("2.TextBoxPage_2.jpg");
        pictureName.add("2.CheckBoxPage_1.jpg");

        return pictureName;
    }

}
