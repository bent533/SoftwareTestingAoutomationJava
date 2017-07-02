package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {



    
    @Test
    public void testGroupDeletion () {
      /*  wd.get("http://localhost/addressbook/group.php");
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).sendKeys("\\undefined");
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
        wd.findElement(By.name("se lected[]")).click();
        wd.findElement(By.xpath("//div[@id='content']/form/input[5]")).click();*/

        app.gotoGroupPage();
        app.selectGroup();
        app.deleteSelectedGroups();
        app.returnToGroupPage();
    }


}
