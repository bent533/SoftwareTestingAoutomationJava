package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupData;

/**
 * Created by Сергей on 02.07.2017.
 */
public class GroupHelper extends HelperBase{


  public GroupHelper(WebDriver wd) {

    super(wd);  /*после того как сделалиe extends от класса HekperBase*/
    /*это обращение к конструктору базового класса*/
  }

  public void returnToGroupPage() {
    click(By.linkText("group page"));
  }


  /* кликалка*/
  public void submitGroupCreation() {
    click(By.name("submit"));
  }


  public void fillGroupForm(GroupData groupData) {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
  }

  public void initGroupCreation() {
    click(By.name("new"));
  }

  public void deleteSelectedGroups() {
    click(By.name("delete"));
  }

  public void selectGroup() {
    click(By.name("selected[]"));
  }

  public void initGroupModification() {
    click(By.name("edit"));
  }

  public void submitGroupModification() {
    click(By.name("update"));
  }



  public void createGroup(GroupData test1)
  {
    initGroupCreation();
    fillGroupForm(test1);
    submitGroupCreation();
    returnToGroupPage();
  }

  public boolean isThereAGroup(By locator)
  {
    return isElementPresent(By.name("selected[]"));
  }


}
