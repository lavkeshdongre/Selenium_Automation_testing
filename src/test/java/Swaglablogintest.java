import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Swaglablogintest {
  @Test(dataProvider = "data")
  public void verify_login(Integer n, String s) {
  }

  @DataProvider
  public Object[][] data() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
