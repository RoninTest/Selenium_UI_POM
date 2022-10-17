package tests;

import org.junit.Test;
import pages.DemoQA_TextBoxPage;

public class DemoQA_AllTests {

  @Test
    public void Test001(){
      DemoQA_ElementsPage_Test demoQA_elementsPage_test=new DemoQA_ElementsPage_Test();
      demoQA_elementsPage_test.Test001();

  }
  @Test
    public void Test002(){
      DemoQA_TextBoxPage_Test demoQA_textBoxPage_test=new DemoQA_TextBoxPage_Test();
      demoQA_textBoxPage_test.Test001();
  }

}
