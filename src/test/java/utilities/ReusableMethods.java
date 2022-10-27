package utilities;

import org.junit.Test;


import javax.swing.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

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

            // JOptionPane.showMessageDialog(null,"Please, check your internet connection.","Selenium Test Project",JOptionPane.INFORMATION_MESSAGE);
            System.out.println("\n"
                    +"*********************** WARNING **************************** "
                    +"\n"
                    +"               Internet is not connected                     "
                    +"\n"
                    +"***********************************************************");
        }

    }

}
