package ru.stqa.pft.addressbook.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Сергей on 18.07.2017.
 */
public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation()
  {
    int before = app.getContactHelper().getContactCount();
    app.getNavigationHelper().gotoAddNewContact();
    app.getContactHelper().createContact(new ContactData("w1", "w2", "w3", "w4", "w5", "w6", "w7", "w8", "w9", "w10", "w12", "w13", "w14", "w15", "w16", "w17", "w18", "w19", "w20","q1"), true);
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after,before+1);
  }


}
