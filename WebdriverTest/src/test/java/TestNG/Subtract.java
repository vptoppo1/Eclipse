package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class Subtract {
  @Test
  @Parameters({"a","b"})
  public void sub(int c, int d) {
	  int subtract = c-d;
	  System.out.println("Substraction of two numbers is: " +subtract);
  }
}
