package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Сергей on 21.06.2017.
 */
public class SquareTest
{

  @Test
  public void testArea()
  {
    Square s = new Square(25);
    assert s.area() == 62;

  }

  public void testArea2()
  {
    Square s = new Square(25);
    assert s.area() == 625;
    Assert.

  }


}
