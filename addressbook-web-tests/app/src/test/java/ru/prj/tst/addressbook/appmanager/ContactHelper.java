package ru.prj.tst.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.prj.tst.addressbook.model.ContactData;

public class ContactHelper extends HelperBase{


  public ContactHelper(WebDriver wd) {
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

  public void selectContact() {
    click(By.name("selected[]"));
  }

  public void initDeletion() {
    click(By.xpath("//*[@id=\"content\"]/form[2]/div[2]/input"));

  }

  public void confirmDeletion() {
    if (isAlertPresent()) {
      wd.switchTo().alert().accept();
    }
  }

  public void initContactModification() {
click(By.xpath("//*[@id=\"maintable\"]/tbody/tr[2]/td[8]/a/img"));
  }

  public void confirmContactModification() {
    click(By.name("update"));
  }
}
