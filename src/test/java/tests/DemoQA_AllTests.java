package tests;


import jdk.jfr.Description;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import utilities.ReusableMethods;

import java.io.IOException;


public class DemoQA_AllTests {

  final static Logger logger = Logger.getLogger(DemoQA_AllTests.class);
  ReusableMethods reusableMethods =new ReusableMethods();

  @Test @Description("Main Page")
    public void Test001() throws IOException {

    reusableMethods.ChekInInternetConnection();

    logger.info("****** R*O*N*I*N* The test cases are STARTED  R*O*N*I*N* *******");
    logger.info("*************************************************************************");
    DemoQA_ElementsPage_Test demoQA_elementsPage_test=new DemoQA_ElementsPage_Test();
    demoQA_elementsPage_test.Test001();


  }
  @Test @Description("Text Box Page")
    public void Test002(){

    DemoQA_TextBoxPage_Test demoQA_textBoxPage_test=new DemoQA_TextBoxPage_Test();
    demoQA_textBoxPage_test.Test001();

  }
  @Test @Description("CheckBox Test")
    public void Test003(){

    DemoQA_CheckBox_Test demoQACheckBoxTest=new DemoQA_CheckBox_Test();
    demoQACheckBoxTest.Test001();
  }

  @Test
  @DisplayName ("Radio Button Test")
    public void Test004(){

     DemoQA_RadioB_Test radioB_test=new DemoQA_RadioB_Test();
     radioB_test.Test001();
  }

  @Test @Description("Web Tables Page Test")
  public void Test005(){
    DemoQA_WebTables_Test webTables_test=new DemoQA_WebTables_Test();
    webTables_test.Test001();
  }

  @Test @Description("Button Tests")
  public void Test006(){
    DemoQA_Button_Test button_test=new DemoQA_Button_Test();
    button_test.Test000();
    button_test.Test001();
    button_test.Test002();
    button_test.Test003();

  }

  @Test @Description("Dynamic Pro. - 1")
  public void Test007(){
    DemoQA_Dynamic_Test dynamic_test=new DemoQA_Dynamic_Test();
    dynamic_test.Test000();
    dynamic_test.Test0001();
    dynamic_test.Test0002();

  }

  @Test @Description("Dynamic Pro.- 2")
  public void Test008(){
    DemoQA_Dynamic_Test dynamic_test=new DemoQA_Dynamic_Test();
    dynamic_test.Test000();
    dynamic_test.Test003();

  }

  @Test @Description("Broken Link")
  public void Test009() throws IOException {
    DemoQA_BrokenLink_Test brokenLinkTest=new DemoQA_BrokenLink_Test();
    brokenLinkTest.Test001();
    brokenLinkTest.Test002();
    brokenLinkTest.Test003();
  }


  @Test @Description("Download File")
  public void Test010(){

    DemoQA_Download_Test upD_test=new DemoQA_Download_Test();
    upD_test.Test000();
    upD_test.Test001();
  }

  @Test @Description("Upload Page Test")
  public void Test011(){
    DemoQA_UploadPage_Test uploadPage_test=new DemoQA_UploadPage_Test();
    uploadPage_test.Tes001();
  }

  @Test @Description("Windows Frame Tests-1")
  public void Test012(){
    DemoQA_WindowsFrame_Test demoQA_windowsFrame_test=new DemoQA_WindowsFrame_Test();
    demoQA_windowsFrame_test.Test000();
    demoQA_windowsFrame_test.Test001();

  }

  @Test @Description("Windows Frame Tests-2")
  public void Test013(){
    DemoQA_WindowsFrame_Test demoQA_windowsFrame_test=new DemoQA_WindowsFrame_Test();
    demoQA_windowsFrame_test.Test000();
    demoQA_windowsFrame_test.Test002();
  }
  @Test @Description("Windows Frame Tests-3")
  public void Test014(){
    DemoQA_WindowsFrame_Test demoQA_windowsFrame_test=new DemoQA_WindowsFrame_Test();
    demoQA_windowsFrame_test.Test000();
    demoQA_windowsFrame_test.Test003();

  }

  @Test @Description("Alerts - 1")
  public void Test015(){
  DemoQA_Alerts_Test demoQA_alerts_test=new DemoQA_Alerts_Test();
  demoQA_alerts_test.setUp();
  demoQA_alerts_test.Test001();
  }

  @Test @Description("Alerts - 2")
  public void Test016(){
    DemoQA_Alerts_Test demoQA_alerts_test=new DemoQA_Alerts_Test();
    demoQA_alerts_test.setUp();
    demoQA_alerts_test.Test002();
  }

  @Test @Description("Alerts - 3")
  public void Test017(){
    DemoQA_Alerts_Test demoQA_alerts_test=new DemoQA_Alerts_Test();
    demoQA_alerts_test.setUp();
    demoQA_alerts_test.Test003();

  }

  @Test @Description("Alerts - 4")
  public void Test018(){
    DemoQA_Alerts_Test demoQA_alerts_test=new DemoQA_Alerts_Test();
    demoQA_alerts_test.setUp();
    demoQA_alerts_test.Test004();

    logger.info("****** R*O*N*I*N* The test cases are COMPLETED R*O*N*I*N* *******");
  }






}
