package tests;


import jdk.jfr.Description;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import utilities.ReusableMethods;
import java.io.IOException;


public class DemoQA_AllTests {

  final static Logger logger = Logger.getLogger(Test.class);
  ReusableMethods reusableMethods=new ReusableMethods();

  @Before
  @Description("Internet Connection")
  public void InternetControl(){
    reusableMethods.ChekInInternetConnection();
  }

  @Test
  @Description("Main Page")
  public void Test001() throws IOException {

    logger.info("****** R*O*N*I*N* The test cases are STARTED  R*O*N*I*N* *******");
    logger.info("*************************************************************************");
    DemoQA_ElementsPage_Test demoQA_elementsPage_test = new DemoQA_ElementsPage_Test();

    demoQA_elementsPage_test.Test001();
  }
  @Test
  @Description("Text Box Page")
  public void Test002() throws IOException {
    DemoQA_TextBoxPage_Test demoQA_textBoxPage_test = new DemoQA_TextBoxPage_Test();
    demoQA_textBoxPage_test.Test001();
  }
  @Test
  @Description("CheckBox Page")
  public void Test003() throws IOException {

    DemoQA_CheckBox_Test demoQACheckBoxTest = new DemoQA_CheckBox_Test();
    demoQACheckBoxTest.Test001();
  }
  @Test
  @DisplayName("Radio Button Page")
  public void Test004() {
    DemoQA_RadioB_Test radioB_test = new DemoQA_RadioB_Test();
    radioB_test.Test001();
  }
  @Test
  @Description("Web Tables Page Page")
  public void Test005() {
    DemoQA_WebTables_Test webTables_test = new DemoQA_WebTables_Test();
    webTables_test.Test000();
    webTables_test.Test001();
  }
  @Test
  @Description("Button Page")
  public void Test006() {
    DemoQA_Button_Test button_test = new DemoQA_Button_Test();
    button_test.Test000();
    button_test.Test001();
    button_test.Test002();
    button_test.Test003();
  }
  @Test
  @Description("Dynamic Pro. - 1")
  public void Test007() {
    DemoQA_Dynamic_Test dynamic_test = new DemoQA_Dynamic_Test();
    dynamic_test.Test000();
    dynamic_test.Test0001();
    dynamic_test.Test0002();
  }
  @Test
  @Description("Dynamic Pro.- 2")
  public void Test008() {
    DemoQA_Dynamic_Test dynamic_test = new DemoQA_Dynamic_Test();
    dynamic_test.Test000();
    dynamic_test.Test003();
  }
  @Test
  @Description("Broken Link")
  public void Test009() throws IOException {
    DemoQA_BrokenLink_Test brokenLinkTest = new DemoQA_BrokenLink_Test();
    brokenLinkTest.Test001();
    brokenLinkTest.Test002();
  }
  @Test
  @Description("Download File")
  public void Test010() {

    DemoQA_Download_Test upD_test = new DemoQA_Download_Test();
    upD_test.Test000();
    upD_test.Test001();
  }
  @Test
  @Description("Upload Page Test")
  public void Test011() {
    DemoQA_UploadPage_Test uploadPage_test = new DemoQA_UploadPage_Test();
    uploadPage_test.Tes001();
  }
  @Test
  @Description("Windows Frame Tests-1")
  public void Test012() {
    DemoQA_WindowsFrame_Test demoQA_windowsFrame_test = new DemoQA_WindowsFrame_Test();
    demoQA_windowsFrame_test.Test000();
    demoQA_windowsFrame_test.Test001();
  }

  @Test
  @Description("Windows Frame Tests-2")
  public void Test013() {
    DemoQA_WindowsFrame_Test demoQA_windowsFrame_test = new DemoQA_WindowsFrame_Test();
    demoQA_windowsFrame_test.Test000();
    demoQA_windowsFrame_test.Test002();
  }
  @Test
  @Description("Windows Frame Tests-3")
  public void Test014() {
    DemoQA_WindowsFrame_Test demoQA_windowsFrame_test = new DemoQA_WindowsFrame_Test();
    demoQA_windowsFrame_test.Test000();
    demoQA_windowsFrame_test.Test003();
  }

  @Test
  @Description("Alerts - 1")
  public void Test015() {
    DemoQA_Alerts_Test demoQA_alerts_test = new DemoQA_Alerts_Test();
    demoQA_alerts_test.setUp();
    demoQA_alerts_test.Test001();
  }
  @Test
  @Description("Alerts - 2")
  public void Test016() {
    DemoQA_Alerts_Test demoQA_alerts_test = new DemoQA_Alerts_Test();
    demoQA_alerts_test.setUp();
    demoQA_alerts_test.Test002();
  }

  @Test
  @Description("Alerts - 3")
  public void Test017() {
    DemoQA_Alerts_Test demoQA_alerts_test = new DemoQA_Alerts_Test();
    demoQA_alerts_test.setUp();
    demoQA_alerts_test.Test003();
  }

  @Test
  @Description("Alerts - 4")
  public void Test018() {
    DemoQA_Alerts_Test demoQA_alerts_test = new DemoQA_Alerts_Test();
    demoQA_alerts_test.setUp();
    demoQA_alerts_test.Test004();
  }

  @Test
  @Description("Nested Frame -1 ")
  public void Test019() {
    DemoQA_NestedIframe_Test nestedIframe_test = new DemoQA_NestedIframe_Test();
    nestedIframe_test.setUp();
    nestedIframe_test.Test001();
  }

  @Test
  @Description("Nested Frame -2 ")
  public void Test020() {
    DemoQA_NestedIframe_Test nestedIframe_test = new DemoQA_NestedIframe_Test();
    nestedIframe_test.setUp();
    nestedIframe_test.Test002();
  }

  @Test
  @Description("IFrame -1 ")
  public void Test021() {
    DemoQA_Iframe_Test iframe_test = new DemoQA_Iframe_Test();
    iframe_test.setUp();
    iframe_test.Test001();
  }

  @Test
  @Description("IFrame -2 ")
  public void Test022() {
    DemoQA_Iframe_Test iframe_test = new DemoQA_Iframe_Test();
    iframe_test.setUp();
    iframe_test.Test002();
  }

  @Test
  @Description("Modal - 1")
  public void Test023() {
    DemoQA_Modal_Test modal_test=new DemoQA_Modal_Test();
    modal_test.setUp();
    modal_test.Test001();
  }

  @Test
  @Description("Modal - 2")
  public void Test024() {
    DemoQA_Modal_Test modal_test=new DemoQA_Modal_Test();
    modal_test.setUp();
    modal_test.Test002();
  }

  @Test
  @Description ("Accordian - 1")
  public void Test025(){
    DemoQA_Accordion_Test accordion_test=new DemoQA_Accordion_Test();
    accordion_test.Test000();
    accordion_test.Test001();
  }

  @Test
  @Description ("Accordian - 2")
  public void Test026(){
    DemoQA_Accordion_Test accordion_test=new DemoQA_Accordion_Test();
    accordion_test.Test000();
    accordion_test.Test002();
  }
  @Test
  @Description ("Auto Complete - 1")
  public void Test027(){
    DemoQA_AutoComplete_Test autoComplete_test=new DemoQA_AutoComplete_Test ();
    autoComplete_test.Tes000();
    autoComplete_test.Test001();
  }

  @Test
  @Description ("Auto Complete - 2")
  public void Test028(){
    DemoQA_AutoComplete_Test autoComplete_test=new DemoQA_AutoComplete_Test ();
    autoComplete_test.Tes000();
    autoComplete_test.Test002();
  }
  @Test
  @Description ("DatePicker- 1")
  public void Test029(){
    DemoQA_DataPicker_Test dataPicker_test=new DemoQA_DataPicker_Test();
    dataPicker_test.Test000();
    dataPicker_test.Test001();
  }
  @Test
  @Description ("Slider - 1")
  public void Test030(){
    DemoQA_Slider_Test slider_test=new DemoQA_Slider_Test();
    slider_test.Test000();
    slider_test.Test001();
  }
  @Test
  @Description ("Progress Bar - 1")
  public void Test031(){
    DemoQA_ProgressBar_Test progressBar_test=new DemoQA_ProgressBar_Test();
    progressBar_test.Test000();
    progressBar_test.Test001();
  }
  @Test
  @Description ("Progress Bar - 2")
  public void Test032(){
    DemoQA_ProgressBar_Test progressBar_test=new DemoQA_ProgressBar_Test();
    progressBar_test.Test000();
    progressBar_test.Test002();
  }
  @Test
  @Description ("Tool Tip - 1")
  public void Test033(){
    DemoQA_ToolTip_Test toolTip_test=new DemoQA_ToolTip_Test();
    toolTip_test.Test000();
    toolTip_test.Test001();
  }
  @Test
  @Description ("Tool Tip - 2")
  public void Test034(){
    DemoQA_ToolTip_Test toolTip_test=new DemoQA_ToolTip_Test();
    toolTip_test.Test000();
    toolTip_test.Test002();
    logger.info("****** R*O*N*I*N* The test cases are COMPLETED R*O*N*I*N* *******");
  }




}
