package ru.prj.tst.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() {
    goToContactCreationPage();
    fillContactForm(new ContactData("firstname", "middlename", "lastname", "address", "111", "222", "333", "1@mail.r", "2@mail.r", "3@mail.r"));
    submitContactCreation();
    returnToHomePage();
  }


}
