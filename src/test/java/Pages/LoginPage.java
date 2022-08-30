package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.WebDriverListener;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailPhone;

    @FindBy(xpath = "//input[@id='pass']")
    WebElement passWord;

    @FindBy(xpath = "//button[@name='login']")
    public  WebElement loginButton;

    @FindBy(xpath = "//div[@class='_9ay7']")
    public WebElement actualErrorMsg;


    @FindBy(xpath = "//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy'] ")
    WebElement newActButton;


    @FindBy(css = "input#email")
    WebElement email1;

    @FindBy(css = "input#pass")
    WebElement passWord1;

    @FindBy(css = "button[name=login")
    WebElement loginButton1;

    @FindBy(css = "div._9ay7")
    public WebElement actualErrorMsgByCss;


    public void enterNegCredientials(String emailPhone, String passWord){
        this.emailPhone.sendKeys(emailPhone);
        this.passWord.sendKeys(passWord);
        this.loginButton1.click();
    }


    public void enterNegCredByCss(String emailPhone1, String passWord1){
        this.email1.sendKeys(emailPhone1);
        this.passWord1.sendKeys(passWord1);
        this.loginButton1.click();

    }


    public void createNewAct(){
        this.newActButton.click();
    }

}
