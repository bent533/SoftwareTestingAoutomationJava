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
    Assert.assertEquals(s.area(),625.0);
  }


  @Test
  public void testArea2()
  {
    Square s = new Square(25);
    Assert.assertEquals(s.area(),624.0);
  }

  @Test
  public void testArea3()
  {
    Square s = new Square(25);
    Assert.assertEquals(s.area(),4.0);
  }


}
