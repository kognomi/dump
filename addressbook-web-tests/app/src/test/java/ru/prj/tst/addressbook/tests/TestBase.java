package ru.prj.tst.addressbook.tests;

import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.prj.tst.addressbook.appmanager.ApplicationManager;

public class TestBase {


  protected final ApplicationManager app = new ApplicationManager(Browser.EDGE.browserName());

  @BeforeMethod
  public void setup()  throws Exception {

    app.init();
  }

  @AfterMethod
  public  void tearDown(){
    app.stop();
  }

}
