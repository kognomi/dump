package ru.prj.tst.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.prj.tst.addressbook.model.ContactData;

public class ContactHelper extends HelperBase{


  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"),contactData.getFirstname());
    type(By.name("middlename"),contactData.getMiddlename());
    type(By.name("lastname"),contactData.getLastname());
    type(By.name("address"),contactData.getAddress());
    type(By.name("home"),contactData.getHomePhone());
    type(By.name("mobile"),contactData.getMobilePhone());
    type(By.name("work"),contactData.getWorkPhone());
    type(By.name("email"),contactData.getEmail());
    type(By.name("email2"),contactData.getEmail2());
    type(By.name("email3"),contactData.getEmail3());

  }

  public void submitContactCreation() {
    click(By.name("submit"));

  }

  public void returnToHomePage() {
    click(By.linkText("home page"));

  }
}
