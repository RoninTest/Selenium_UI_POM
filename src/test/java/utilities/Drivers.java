package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Drivers {

    static WebDriver driver;
    public Actions actions;

    public static WebDriver getDriver(){
        if(driver==null){

            switch (ConfigReader.getProperty("browser")){
                case "chrome" :
                    WebDriverManager.chromedriver().setup();;
                    driver=new ChromeDriver();
                    break;

                case "safari" :
                    WebDriverManager.safaridriver().setup();
                    driver=new SafariDriver();
                    break;
                case "firefox" :
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;

                default:
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        }
        return driver;
    }

    public static void closeDriver(){
        if(driver!=null){
            driver.close();
            driver=null;
        }
    }


}
