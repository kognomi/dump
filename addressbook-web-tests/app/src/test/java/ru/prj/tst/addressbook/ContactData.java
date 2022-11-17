package ru.prj.tst.addressbook;

import org.openqa.selenium.By;

public class ContactData {
  public String firstname;
  public String middlename;
  public String lastname;
  public String address;
  public String homePhone;
  public String mobilePhone;
  public String workPhone;
  public String email;
  public String email2;
  public String email3;
  public ContactData(String firstname,String middlename,String lastname,
                     String address,String homePhone,String mobilePhone,String workPhone,String email,
                     String email2,String email3){
    this.firstname=firstname;
    this.middlename=middlename;
    this.lastname=lastname;
    this.address=address;
    this.homePhone=homePhone;
    this.mobilePhone=mobilePhone;
    this.workPhone=workPhone;
    this.email=email;
    this.email2=email2;
    this.email3=email3;

  }

  public String getFirstname() {
    return firstname;
  }

  public String getMiddlename() {
    return middlename;
  }

  public String getLastname() {
    return lastname;
  }

  public String getAddress() {
    return address;
  }

  public String getHomePhone() {
    return homePhone;
  }

  public String getMobilePhone() {
    return mobilePhone;
  }

  public String getWorkPhone() {
    return workPhone;
  }

  public String getEmail() {
    return email;
  }

  public String getEmail2() {
    return email2;
  }

  public String getEmail3() {
    return email3;
  }
}




