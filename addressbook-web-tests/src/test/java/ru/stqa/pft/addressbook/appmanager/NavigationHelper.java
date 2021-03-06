package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



/**
 * Created by Сергей on 02.07.2017.
 */
public class NavigationHelper extends HelperBase{

  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void gotoGroupPage()
  {
    if (isElementPresent(By.tagName("h1"))
            && wd.findElement(By.tagName("h1")).getText().equals("Groups")
            && isElementPresent(By.name("new")))
    { return; } //сразу жевыходим из метода
    click(By.linkText("groups"));
  }

  public void gotoAddNewContact() { click(By.linkText("add new"));}

  public void gotoHome(){
    if(isElementPresent(By.id("maintable")))    // вот здесь косяко - если задержка 0 то ОКе
    {
      return;
    }
    click(By.linkText("home"));
  }


}
