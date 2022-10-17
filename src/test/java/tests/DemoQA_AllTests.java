package tests;

import jdk.jfr.Description;
import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.junit.Test;
import pages.DemoQA_RadiBPage;

public class DemoQA_AllTests {

  @Test @Description("Main Page")
    public void Test001(){
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
  }

}
