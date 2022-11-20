package ru.prj.tst.addressbook.tests;

import org.testng.Assert;
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
    int before = app.getContactHelper().getContactCount();
    app.getContactHelper().selectContact(before-1);
    app.getContactHelper().initDeletion();
    app.getContactHelper().confirmDeletion();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after,before-1);
  }
}
