package Tests;

import Utils.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

public class VerifyColor extends TestBase {

    @Test
    public void testLogoColor(){

        WebElement logoElem = driver.findElement(By.xpath("//img[@src='https://static.xx.fbcdn.net/rsrc.php/y8/r/dF5SId3UHWd.svg']"));
        String color = logoElem.getCssValue("color");
        String HexCode = Color.fromString(color).asHex();
        System.out.println("Color is: " + color);
        System.out.println("Hex code for color: "+HexCode);

    }

    @Test
    public void testCreateNewActColor(){
        WebElement createNewButtonColor = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        String color = createNewButtonColor.getCssValue("color");
        String hexCode = Color.fromString(color).asHex();
        System.out.println("Color is: "+color);
        System.out.println("HEX code is: "+hexCode);

    }




}
