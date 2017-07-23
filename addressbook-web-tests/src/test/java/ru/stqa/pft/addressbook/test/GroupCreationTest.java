package ru.stqa.pft.addressbook.test;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;


public class GroupCreationTest extends TestBase {


    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupHelper().getGroupCount(); // важно производить подсчет уже на открытой странице!!!
        app.getGroupHelper().createGroup(new GroupData("q1", "q2", "q33"));
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after,before + 1);
        }

}
