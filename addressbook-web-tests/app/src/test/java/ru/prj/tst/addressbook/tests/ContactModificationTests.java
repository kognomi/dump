package ru.prj.tst.addressbook.tests;

import org.testng.annotations.Test;
import ru.prj.tst.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{
  @Test
  public void testContactModification() {
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("ttt","ttt","ttt","ttt","444","555","666","4@.t","5@.t","6@.t",null));
    app.getContactHelper().confirmContactModification();
    app.getContactHelper().returnToHomePage();

  }

}
