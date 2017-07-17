package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Сергей on 02.07.2017.
 */
public class SessionHelper extends HelperBase{
 /*  private WebDriver wd;
    - УБИРАЕМ, Т.К. НАСЛЕДУЕТСЯ ТЕПЕРЬ ИЗ БАЗОВГО КЛАССА*/


  public SessionHelper(WebDriver wd) {

    super(wd);  /*после того как сделалиe extends от класса HekperBase*/
    /*это обращение к конструктору базового класса*/
  }

  public void login(String username, String password) {
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).sendKeys("\\undefined");
    wd.findElement(By.id("LoginForm")).click();


    type(By.name("user"),username);
    type(By.name("pass"),password);
    click(By.xpath("//form[@id='LoginForm']/input[3]"));

    /* Заменили функцией после Extends
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(username);


    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(password);

    wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
  */
  }

}
