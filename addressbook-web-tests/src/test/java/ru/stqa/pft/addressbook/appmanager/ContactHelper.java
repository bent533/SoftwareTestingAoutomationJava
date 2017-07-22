package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Сергей on 18.07.2017.
 */
public class ContactHelper extends HelperBase
{


  /*Здесь передали в конструктор базового класса браузер, который будет использоваться */
  public ContactHelper(WebDriver wd) { super(wd);  }

  public void fillContactForm(ContactData contactData) {
      type(By.name("firstname"), contactData.getFirstname());
      type(By.name("middlename"), contactData.getMiddlename());
      type(By.name("lastname"), contactData.getLastname());
      type(By.name("nickname"), contactData.getNickname());
      type(By.name("title"), contactData.getTitle());
      type(By.name("company"), contactData.getCompany());
      type(By.name("address"), contactData.getAddress());
      type(By.name("home"), contactData.getHome());
      type(By.name("mobile"), contactData.getMobile());
      type(By.name("work"), contactData.getWork());
      type(By.name("fax"), contactData.getFax());
      type(By.name("email"), contactData.getEmail());
      type(By.name("email2"), contactData.getEmail2());
      type(By.name("email3"), contactData.getEmail3());
      type(By.name("homepage"), contactData.getHomepage());
      type(By.name("byear"), contactData.getByear());
      type(By.name("address2"), contactData.getAddress2());
      type(By.name("phone2"), contactData.getPhone2());
      type(By.name("notes"), contactData.getNotes());
    }


  public void submitContactCreation() {
    click(By.name("submit"));
  }

  public void initContactModification() {
    click(By.name("selected[]"));
    click(By.cssSelector("img[alt='Edit']"));  //выяснить почему такой локатор
  }


  public void submitContactModification() { click(By.name("update"));  }

}
