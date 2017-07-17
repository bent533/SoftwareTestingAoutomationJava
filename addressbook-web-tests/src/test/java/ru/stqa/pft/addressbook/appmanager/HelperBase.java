package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

/**
 * Created by Сергей on 17.07.2017.
 */
public class HelperBase {


  protected WebDriver wd;

  public HelperBase(WebDriver wd) {
    this.wd=wd;
  }

  /*параметризировали locator'ом кликалку*/
  protected void click(By locator) {
    wd.findElement(locator).click();
  }

  protected void type(By locator, String text) {
    click(locator);
    if (text!=null)   /*null Нужен когда пустые значения пытаемся заполнить*/
    {
      String existingtesxt = wd.findElement(locator).getAttribute("value");/*тот текст который мы видим в поле значения ввода
      является значением value
      getText вернет нуль
      но для остальных значений нужно его использовать*/
      /*! отрицание*/
      if(! text.equals(existingtesxt))
      {
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
      }

    }
  }


  /*если посмотреть в AplMAnager то увидим как мы его измели сейча его это метод ниже*/
  public  boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

}
