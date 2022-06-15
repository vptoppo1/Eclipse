package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class Multiply {
  @Test
  @Parameters({"a","b"})
  public void mul(int c, int d) {
	  int mult = c*d;
	  System.out.println("Multiplication of two numbers is: " +mult);
  }
}
