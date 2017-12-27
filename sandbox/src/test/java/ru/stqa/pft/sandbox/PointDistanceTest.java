package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointDistanceTest {

  @Test
  public void testPointDistance() {
    Point p1 = new Point(0.5,1);
    Point p2 = new Point(2, 3);
    Assert.assertEquals(p1.distance(p2), 2.5);
  }
}
