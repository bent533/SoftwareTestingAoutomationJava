package ru.stqa.pft.addressbook.test;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;


public class GroupCreationTest extends TestBase {


    @Test
    public void testGroupCreation() {
        app.gotoGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("q1", "q2", "q3"));
        app.submitGroupCreation();
        app.returnToGroupPage();
    }

}
