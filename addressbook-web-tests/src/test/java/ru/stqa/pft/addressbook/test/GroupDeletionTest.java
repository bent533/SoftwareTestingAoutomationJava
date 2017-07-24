package ru.stqa.pft.addressbook.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class GroupDeletionTest extends TestBase {

    @Test
    public void testGroupDeletion () {
      /*  wd.get("http://localhost/addressbook/group.php");
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).sendKeys("\\undefined");
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
        wd.findElement(By.name("se lected[]")).click();
        wd.findElement(By.xpath("//div[@id='content']/form/input[5]")).click();*/

        app.getNavigationHelper().gotoGroupPage();
        //Перед удалением смотрим,есть ли элемент такой на форме
        if(! app.getGroupHelper().isThereAGroup(By.name("selected[]")))
        {
            app.getGroupHelper().createGroup(new GroupData("testDeletionCreation",null,null));
        }
        List<GroupData> before = app.getGroupHelper().getGroupList(); // важно производить подсчет уже на открытой странице!!!
        app.getGroupHelper().selectGroup(before.size()-1);
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
        List<GroupData> after = app.getGroupHelper().getGroupList(); // важно производить подсчет уже на открытой странице!!!
        Assert.assertEquals(after.size(),before.size() - 1);

        before.remove(before.size()-1);
        Assert.assertEquals(before,after);
    }


}
