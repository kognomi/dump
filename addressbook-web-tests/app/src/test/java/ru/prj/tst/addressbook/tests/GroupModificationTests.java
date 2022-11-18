package ru.prj.tst.addressbook.tests;

import org.testng.annotations.Test;
import ru.prj.tst.addressbook.model.GroupData;

public class GroupModificationTests extends  TestBase{
  @Test
  public void testGroupModification(){
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("aaa","bbb","ccc"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();


  }
}
