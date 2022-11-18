package ru.prj.tst.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;

public class ApplicationManager {
  WebDriver wd;
  private  NavigationHelper navigationHelper;
  private  ContactHelper contactHelper;
  private  GroupHelper groupHelper;
  private  SessionHelper sessionHelper;





  public void init() {
    String browser= Browser.FIREFOX.browserName();
    if (browser==Browser.FIREFOX.browserName()) {
      wd = new FirefoxDriver(new FirefoxOptions().setBinary("C:/Program Files/Mozilla Firefox/firefox.exe"));

    } else if (browser==Browser.CHROME.browserName()) {
      wd = new ChromeDriver();
    } else if (browser == Browser.EDGE.browserName()) {
      wd = new EdgeDriver();
    }

    wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    wd.get("http://localhost/addressbook/");
    groupHelper = new GroupHelper(wd);
    contactHelper = new ContactHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.login("admin", "secret");
  }

  public void stop() {
    wd.quit();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
