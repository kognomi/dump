package ru.prj.tst.addressbook.tests;

import org.testng.annotations.Test;
import ru.prj.tst.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{
  @Test
  public void testContactModification() {
    if (!app.getContactHelper().isThereAContact()) {
      app.getNavigationHelper().goToContactCreationPage();
      app.getContactHelper().createContact(new ContactData("firstname",
              "middlename", "lastname", "address",
              "111", "222", "333", "1@mail.r",
              "2@mail.r", "3@mail.r","test1"));
    }
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("ttt","ttt",
            "ttt","ttt","444","555",
            "666","4@.t","5@.t","6@.t",null),false);
    app.getContactHelper().confirmContactModification();
    app.getContactHelper().returnToHomePage();

  }

}
