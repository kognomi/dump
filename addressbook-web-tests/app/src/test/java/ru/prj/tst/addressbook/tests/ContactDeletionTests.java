package ru.prj.tst.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase{
  @Test
  public void testContactDeletion() {
    app.getContactHelper().selectContact();
    app.getContactHelper().initDeletion();
    app.getContactHelper().confirmDeletion();
  }
}
