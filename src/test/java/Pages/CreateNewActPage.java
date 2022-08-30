package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.thread.ITestNGThreadPoolExecutor;

import java.time.Duration;

public class CreateNewActPage {

    WebDriver driver;

    public CreateNewActPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//input[@name='firstname")
    WebElement firstName;

    @FindBy(xpath = "//input[@name='lastname")
    WebElement lastName;


    @FindBy(xpath = "//input[@name='reg_email__")
    WebElement phoneEmail;

    @FindBy(xpath = "//input[@name='reg_passwd__")
    WebElement passWord;

    @FindBy(xpath = "//select[@id='month']")
    WebElement month;

    @FindBy(xpath = "//select[@id='day']")
    WebElement day;

    @FindBy(xpath = "//select[@id='year']")
    WebElement year;

    @FindBy(xpath = "//span[@class='_5k_2 _5dba'][2]")
    public WebElement genderMale;

    @FindBy(xpath = "//button[@name='websubmit']")
    public WebElement submitNewActInfo;

    public void enterNewActInfo(String byMonth, String byDay, String byYear ){

    Select select = new Select(this.month);
    select.selectByVisibleText(byMonth);
    Select select1 = new Select(this.day);
    select1.selectByValue(byDay);

    Select select2 = new Select(this.year);
    select2.selectByValue(byYear);

    }

}
