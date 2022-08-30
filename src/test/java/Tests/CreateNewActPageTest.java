package Tests;

import Pages.CreateNewActPage;
import Pages.LoginPage;
import Utils.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CreateNewActPageTest extends TestBase {

    LoginPage loginPage;
    CreateNewActPage createNewActPage;



    @Test
    public void createNewAct(){
        loginPage = new LoginPage(driver);
        createNewActPage = new CreateNewActPage(driver);
        loginPage.createNewAct();
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement firstName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='firstname']")));
        firstName.sendKeys("John");

        WebElement lastName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='lastname']")));
        lastName.sendKeys("Wallace");

        WebElement phneEmail = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='reg_email__']")));
        phneEmail.sendKeys("888-555-1234");

        WebElement pw = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='reg_passwd__']")));
        pw.sendKeys("TEst12345!");


       createNewActPage.enterNewActInfo("Mar","28","1977");
        createNewActPage.genderMale.click();
     //   createNewActPage.submitNewActInfo.click();



    }



}
