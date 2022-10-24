package utilities;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ReusableMethods {

    // When It requires a reuse method.
    @Test
    public void ChekInInternetConnection() throws IOException {

        try{
            URL url=new URL("https://www.google.com");
            URLConnection connection= url.openConnection();
            connection.connect();
            System.out.println("Internet is connected");
        }catch (MalformedURLException e){
            System.out.println("Internet is connected");
        }catch (IOException e){
            System.out.println("\n"
                    +"*********************** WARNING **************************** "
                    +"\n"
                    +"               Internet is not connected                     "
                    +"\n"
                    +"***********************************************************");
        }






    }

}
