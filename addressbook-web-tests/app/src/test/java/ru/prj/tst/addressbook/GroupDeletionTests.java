package ru.prj.tst.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion(){
    goToGroupPage();
    wd.findElement(By.name("selected[]")).click();
    wd.findElement(By.name("delete")).click();
    returnToGroupPage();

}



}
