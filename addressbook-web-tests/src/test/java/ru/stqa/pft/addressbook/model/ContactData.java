package ru.stqa.pft.addressbook.model;

/**
 * Created by Сергей on 18.07.2017.
 */
public class ContactData {
  private final String firstname;
  private final String middlename;
  private final String lastname;
  private final String nickname;
  private final String title;
  private final String company;
  private final String address;
  private final String home;
  private final String mobile;
  private final String work;
  private final String fax;
  private final String email;
  private final String email2;
  private final String email3;
  private final String homepage;
  private final String byear;
  private final String address2;
  private final String phone2;
  private final String notes;
  private String group;

  public ContactData(String firstname,
                     String middlename,
                     String lastname,
                     String nickname,
                     String title,
                     String company,
                     String address,
                     String home,
                     String mobile,
                     String work,
                     String fax,
                     String email,
                     String email2,
                     String email3,
                     String homepage,
                     String byear,
                     String phone2,
                     String address2,
                     String notes,
                     String group)
  {
    this.firstname = firstname;
    this.middlename = middlename;
    this.lastname = lastname;
    this.nickname = nickname;
    this.title = title;
    this.company = company;
    this.address = address;
    this.home = home;
    this.mobile = mobile;
    this.work = work;
    this.fax = fax;
    this.email = email;
    this.email2 = email2;
    this.email3 = email3;
    this.homepage = homepage;
    this.byear = byear;
    this.address2 = address2;
    this.phone2 = phone2;
    this.notes = notes;
    this.group = group;
  }

  public String getFirstname() { return firstname; }
  public String getMiddlename() { return middlename; }
  public String getLastname() { return lastname; }
  public String getNickname() { return nickname; }
  public String getTitle() { return title; }
  public String getCompany() { return company; }
  public String getAddress() { return address; }
  public String getHome() { return home; }
  public String getMobile() { return mobile; }
  public String getWork() { return work; }
  public String getFax() { return fax; }
  public String getEmail() { return email; }
  public String getEmail2() { return email2; }
  public String getEmail3() { return email3; }
  public String getHomepage() { return homepage; }
  public String getByear() { return byear; }
  public String getAddress2() { return address2; }
  public String getPhone2() { return phone2; }
  public String getNotes() { return notes; }

  public String getGroup() { return group; }
}
