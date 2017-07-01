package ru.stqa.pft.addressbook;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class EditGroup extends TestBase {

    
    @Test
    public void testEditGroup() {
/*

        wd.get("http://localhost/addressbook/");
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).sendKeys("\\undefined");
        wd.findElement(By.id("LoginForm")).click();
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
        wd.findElement(By.linkText("groups")).click();
        if (!wd.findElement(By.name("selected[]")).isSelected()) {
            wd.findElement(By.name("selected[]")).click();
        }
*/

        gotoGroupPage();
        selectGroup();

        wd.findElement(By.xpath("//div[@id='content']/form/input[6]")).click();
        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys("q1+");
        wd.findElement(By.name("update")).click();
        wd.findElement(By.linkText("groups")).click();
    }
    

    /*@AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }*/

}
