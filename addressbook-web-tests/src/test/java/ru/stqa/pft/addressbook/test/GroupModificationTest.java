package ru.stqa.pft.addressbook.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

/**
 * Created by Сергей on 02.07.2017.
 */
public class GroupModificationTest extends TestBase {
  @Test
  public void testGroupModification()
  {
    app.getNavigationHelper().gotoGroupPage();
    //Перед изменением смотрим,есть ли элемент такой на форме
    if(! app.getGroupHelper().isThereAGroup(By.name("selected[]")))
    {
      app.getGroupHelper().createGroup(new GroupData("testModificationCreation",null,null));
    }
    List<GroupData> before = app.getGroupHelper().getGroupList(); // важно производить подсчет уже на открытой странице!!!
    app.getGroupHelper().selectGroup(before.size()-1);
    app.getGroupHelper().initGroupModification(); //новый метод
    app.getGroupHelper().fillGroupForm(new GroupData("c1", "q2", "c3"));
    app.getGroupHelper().submitGroupModification(); //новый метод
    app.getGroupHelper().returnToGroupPage();
    List<GroupData> after = app.getGroupHelper().getGroupList(); // важно производить подсчет уже на открытой странице!!!
    Assert.assertEquals(after.size(),before.size());
  }


}
