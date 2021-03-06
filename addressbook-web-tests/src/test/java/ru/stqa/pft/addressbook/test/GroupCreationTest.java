package ru.stqa.pft.addressbook.test;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;


public class GroupCreationTest extends TestBase {


    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().gotoGroupPage();

        List<GroupData> before = app.getGroupHelper().getGroupList(); // важно производить подсчет уже на открытой странице!!!

        app.getGroupHelper().createGroup(new GroupData("q1", "q2", "q33"));

        List<GroupData> after = app.getGroupHelper().getGroupList();

        Assert.assertEquals(after.size(),before.size() + 1);
        }

}
