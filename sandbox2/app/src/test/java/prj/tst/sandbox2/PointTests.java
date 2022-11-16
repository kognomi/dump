package prj.tst.sandbox2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
  @Test
  public void testDistance() {
    Point p1= new Point(1,1);
    Point p2 = new Point(1,1);
    Point p3 = new Point(0,0);
    Assert.assertEquals(p1.distance(p2),0);
    Assert.assertFalse(p1.distance(p3)==0);
  }
}
