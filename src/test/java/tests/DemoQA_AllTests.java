package tests;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import jdk.jfr.Description;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.slf4j.MDC;

import java.io.File;

public class DemoQA_AllTests {

  final static Logger logger = Logger.getLogger(DemoQA_AllTests.class);



  @Test @Description("Main Page")
    public void Test001()  {

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

  @Test @Description("Radio Button Test")
    public void Test004(){

     DemoQA_RadioB_Test radioB_test=new DemoQA_RadioB_Test();
     radioB_test.Test001();
    logger.info("****** R*O*N*I*N* The test cases are COMPLETED  R*O*N*I*N* *******");
  }



}
