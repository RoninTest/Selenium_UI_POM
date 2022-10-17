package utilities;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties properties;

    static {

        String filePath1="C:\\Users\\Eren\\Desktop\\Alieren\\TESTS\\Java_Selenium_UI\\";
        String filePath2="src\\test\\java\\configarition.properties";

        try {

            FileInputStream fis=new FileInputStream(filePath1+filePath2); //fis reads your properties document.

            properties=new Properties();
            properties.load(fis); // It is loaded which fis reads.

        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static String getProperty(String key){

        return properties.getProperty(key);
    }
}
