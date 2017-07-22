package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

/**
 * Created by Сергей on 02.07.2017.
 */
public class GroupModificationTest extends TestBase {
  @Test
  public void testGroupModification()
  {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification(); //новый метод
    app.getGroupHelper().fillGroupForm(new GroupData("c1", "q2", "c3"));
    app.getGroupHelper().submitGroupModification(); //новый метод
    app.getGroupHelper().returnToGroupPage();
  }


}
