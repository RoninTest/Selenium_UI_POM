package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Drivers;

public class DemoQA_DatePicker_Page {
    public DemoQA_DatePicker_Page() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }

    @FindBy (className = "main-header")
    public WebElement headerName;

    @FindBy (id="datePickerMonthYearInput")
    public WebElement dateClick;

    @FindBy (className = "react-datepicker__month-select")
    public WebElement selectMonth;

    @FindBy (className = "react-datepicker__year-select")
    public WebElement selectYear;

}
