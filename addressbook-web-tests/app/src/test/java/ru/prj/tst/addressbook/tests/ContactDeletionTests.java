package ru.prj.tst.addressbook.tests;

import org.testng.annotations.Test;
import ru.prj.tst.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase{
  @Test
  public void testContactDeletion() {
    if (!app.getContactHelper().isThereAContact()) {
      app.getNavigationHelper().goToContactCreationPage();
      app.getContactHelper().createContact(new ContactData("firstname",
              "middlename", "lastname", "address",
              "111", "222", "333", "1@mail.r",
              "2@mail.r", "3@mail.r","test1"));
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().initDeletion();
    app.getContactHelper().confirmDeletion();
  }
}
