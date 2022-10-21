package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Drivers;

public class DemoQA_WebTablesPage {

    public DemoQA_WebTablesPage() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }


    @FindBy(xpath = "//div[@class='main-header']")
    public WebElement header;

    @FindBy(xpath = "//button[@id='addNewRecordButton']")
    public WebElement buttonAdd;

    @FindBy(xpath = "//input[@id='firstName']") //FName,LName,Email,Age,Salary,Dep and Submit (6 TAB AND CLICK)
    public WebElement addCustomer;

    @FindBy (xpath = "//div[@id='registration-form-modal']")
    public WebElement addCustomerAssert;

    @FindBy(xpath = "//input[@id='searchBox']")  //search with a lastname //div[@class='rt-tr-group'][3]
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='rt-tr -odd']//div[2]") //Assert find the lastname and Assert The list hasn't the customer
    public WebElement findLastName;

    @FindBy(xpath="//div[@class='action-buttons']//span[@id='delete-record-4']") // Delete button
    public WebElement deleteCustomer;

    @FindBy(xpath = "//div[@class='rt-tr-group'][1]//div[@class='rt-tr -padRow -odd']//div[@class='rt-td'][1]")
    public WebElement customerAssert;

}
