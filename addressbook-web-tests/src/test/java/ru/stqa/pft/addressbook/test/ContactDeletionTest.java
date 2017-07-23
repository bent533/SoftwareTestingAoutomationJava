package ru.stqa.pft.addressbook.test;

import org.testng.Assert;
import org.testng.annotations.Test;;
import org.openqa.selenium.By;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Сергей on 23.07.2017.
 */
public class ContactDeletionTest extends TestBase {

  @Test
  public void testContactDeletion ()
  {
    app.getNavigationHelper().gotoHome();
    int before = app.getContactHelper().getContactCount();
    //Перед удалением смотрим,есть ли элемент такой на форме
    if(! app.getContactHelper().isThereAContact(By.name("selected[]")))
    {
      app.getContactHelper().createContact(new ContactData("No_find_w1", "No_find_w2", "No_find_w3", "w4", "w5", "w6", "w7", "w8", "w9", "w10", "No_find_w12", "w13", "w14", "w15", "w16", "w17", "w18", "w19", "w20","c1"), true);
    }

    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContacts();
    app.getNavigationHelper().gotoHome();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after,before-1);
  }

}
