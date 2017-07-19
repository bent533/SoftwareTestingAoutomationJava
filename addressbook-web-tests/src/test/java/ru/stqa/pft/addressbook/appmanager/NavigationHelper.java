package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Created by Сергей on 02.07.2017.
 */
public class NavigationHelper extends HelperBase{

  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void gotoGroupPage()
  {
    if (isElementPresent(By.tagName("h1")))

    click(By.linkText("groups"));
  }





  public void gotoAddNewContact() { click(By.linkText("add new"));}
  public void gotoHome(){click(By.linkText("home"));}


}
