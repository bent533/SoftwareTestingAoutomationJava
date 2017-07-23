package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Сергей on 18.07.2017.
 */
public class ContactModificationTest extends TestBase{

  @Test
  public void testContactCreation()
  {
    app.getNavigationHelper().gotoHome();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("mod_w1", "mod_w2", "mod_w3", "mod_w4", "mod_w5", "mod_w6", "mod_w7", "mod_w8", "mod_w9", "w10", "w12", "w13", "w14", "w15", "w16", "w17", "w18", "w19", "mod_w20",null),false);
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().gotoHome();
  }



}





