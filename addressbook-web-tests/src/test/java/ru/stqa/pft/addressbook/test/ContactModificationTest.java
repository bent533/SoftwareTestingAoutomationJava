package ru.stqa.pft.addressbook.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

/**
 * Created by Сергей on 18.07.2017.
 */
public class ContactModificationTest extends TestBase{

  @Test
  public void testContactCreation()
  {
    app.getNavigationHelper().gotoHome();

    //Перед изменением смотрим,есть ли КОНТАКТ на форме
    if(! app.getContactHelper().isThereAContact(By.name("selected[]")))
    {
      app.getContactHelper().createContact(new ContactData("No_find_w1", "No_find_w2", "No_find_w3", "w4", "w5", "w6", "w7", "w8", "w9", "w10", "No_find_w12", "w13", "w14", "w15", "w16", "w17", "w18", "w19", "w20","c1"), true);
    }
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("mod_w1", "mod_w2", "mod_w3", "mod_w4", "mod_w5", "mod_w6", "mod_w7", "mod_w8", "mod_w9", "w10", "w12", "w13", "w14", "w15", "w16", "w17", "w18", "w19", "mod_w20",null),false);
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().gotoHome();
  }



}





