package ru.stqa.pft.addressbook.test;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanager.AplicationManager;

/**
 * Created by Сергей on 30.06.2017.
 */
public class TestBase {


  /*ушли от наследования extends к делегированию*/
  protected final AplicationManager app = new AplicationManager(BrowserType.CHROME);

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod
  public void tearDown() {

    app.stop();
  }

}
