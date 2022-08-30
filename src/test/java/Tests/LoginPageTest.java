package Tests;

import Pages.LoginPage;
import Utils.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginPage;

    @Test
    public void negCredErrorMssg() {
        loginPage = new LoginPage(driver);
        loginPage.enterNegCredientials("abc123@gml.com", "12345");
        String expectedErrorMsg = "The email you entered isn’t connected to an account. Find your account and log in.";

        Assert.assertEquals(loginPage.actualErrorMsg.getText(), expectedErrorMsg);
        System.out.println("\nACTUAL   ERROR MESSAGE: " + loginPage.actualErrorMsg.getText());
        System.out.println("EXPECTED ERROR MESSAGE: " + expectedErrorMsg);

    }

    @Test
    public void testNegCredByCss() {
        loginPage = new LoginPage(driver);
        loginPage.enterNegCredByCss("ttes24321@gmil.com", "testPW1234");
        String actualErrMsg = "The email you entered isn’t connected to an account. Find your account and log in.";
        Assert.assertEquals(loginPage.actualErrorMsgByCss.getText(), actualErrMsg);
        System.out.println("\n");
        System.out.println("ACTUAL ERROR MESSAGE:   " + actualErrMsg);
        System.out.println("EXPECTED ERROR MESSAGE: " + loginPage.actualErrorMsgByCss.getText());
        System.out.println("\n");

    }

    @Test
    public void verifyLoginButtonColor() {
        loginPage = new LoginPage(driver);
        String buttonColor = loginPage.loginButton.getCssValue("background-color");
        String Hex = Color.fromString(buttonColor).asHex();
        System.out.println("Button Color: " + buttonColor);
        System.out.println("HEX code: " + Hex);


    }
}