package ru.prj.tst.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.prj.tst.addressbook.model.GroupData;

import java.util.List;

public class GroupCreationTests extends TestBase {


  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().goToGroupPage();
    List<GroupData> before
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after,before+1);

  }

}
