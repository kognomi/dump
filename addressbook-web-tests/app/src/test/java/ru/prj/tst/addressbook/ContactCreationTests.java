package ru.prj.tst.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ContactCreationTests {


  FirefoxDriver wd;

  @BeforeMethod
  public void setup()  throws Exception {

    wd = new FirefoxDriver(new FirefoxOptions().setBinary("C:/Program Files/Mozilla Firefox/firefox.exe"));
    wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    wd.get("http://localhost/addressbook/");
    login("admin", "secret");
  }

  @Test
  public void testContactCreation() {
    goToContactCreationPage();
    fillContactForm(new ContactData("firstname", "middlename", "lastname", "address", "111", "222", "333", "1@mail.r", "2@mail.r", "3@mail.r"));
    submitContactCreation();
    returnToHomePage();
  }

  private void fillContactForm(ContactData contactData) {
    wd.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());
    wd.findElement(By.name("middlename")).sendKeys(contactData.getMiddlename());
    wd.findElement(By.name("lastname")).sendKeys(contactData.getLastname());
    wd.findElement(By.name("address")).sendKeys(contactData.getAddress());
    wd.findElement(By.name("home")).sendKeys(contactData.getHomePhone());
    wd.findElement(By.name("mobile")).sendKeys(contactData.getMobilePhone());
    wd.findElement(By.name("work")).sendKeys(contactData.getWorkPhone());
    wd.findElement(By.name("email")).sendKeys(contactData.getEmail());
    wd.findElement(By.name("email2")).sendKeys(contactData.getEmail2());
    wd.findElement(By.name("email3")).sendKeys(contactData.getEmail3());
  }

  private void submitContactCreation() {
    wd.findElement(By.name("submit")).click();
  }

  private void returnToHomePage() {
    wd.findElement(By.linkText("home page")).click();
  }

  private void goToContactCreationPage() {
    wd.findElement(By.linkText("add new")).click();
  }

  @AfterMethod
  public  void tearDown(){
    wd.quit();
  }
  private void login(String login, String password) {
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(login);
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(password);
    wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
  }
}
