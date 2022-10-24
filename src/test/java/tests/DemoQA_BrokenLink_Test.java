package tests;


import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.junit.Test;
import pages.DemoQA_BrokenLink_Page;
import utilities.ConfigReader;
import utilities.Drivers;

import java.io.IOException;

public class DemoQA_BrokenLink_Test {

    HttpClient client;
    HttpGet request;
    HttpResponse response;
    DemoQA_BrokenLink_Page brokenLinkPage= new DemoQA_BrokenLink_Page();


    @Test
    public void Test001() throws IOException {

        Drivers.getDriver().get(ConfigReader.getProperty("demoQABroken"));


        do{
            client=HttpClientBuilder.create().build();
            request=new HttpGet("https://demoqa.com/");
            response= client.execute(request);
            int statusCode=response.getStatusLine().getStatusCode();

            Assert.assertEquals(200,statusCode);
        }while(brokenLinkPage.validLink.isSelected());

        Drivers.closeDriver();

    }

    @Test
    public void Test002() throws IOException {

        Drivers.getDriver().get(ConfigReader.getProperty("demoQABroken"));

            client=HttpClientBuilder.create().build();
            request=new HttpGet("http://the-internet.herokuapp.com/status_codes/500");
            response= client.execute(request);
            int statusCode=response.getStatusLine().getStatusCode();

            if (statusCode == 200){

                Assert.assertEquals(200,statusCode);

            }else {
                System.out.println("Class Name Page = "
                        + DemoQA_BrokenLink_Page.class.getName()
                        + "\t"
                        + "Class Name Test ="
                        + DemoQA_BrokenLink_Test.class.getName()
                        + " ******!!! Status Code 500 !!!***********");

                Assert.assertEquals(500,statusCode);

            }
        Drivers.closeDriver();
    }

    @Test
    public void Test003() throws IOException {

        Drivers.getDriver().get(ConfigReader.getProperty("demoQABroken"));



        String brokenImageUrl=brokenLinkPage.brokenPicture.getAttribute("src");
        client=HttpClientBuilder.create().build();
        request=new HttpGet(brokenImageUrl);
        response= client.execute(request);
        int statusCode=response.getStatusLine().getStatusCode();

        Assert.assertEquals(200,statusCode);

        Drivers.closeDriver();

    }


}
