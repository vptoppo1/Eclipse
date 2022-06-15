package TestNG;

import org.testng.annotations.Test;

public class SimpleTest {
	@Test(groups="Testing1")
	public void firstTest() {
		System.out.println("This is first test");
	}
	@Test
	public void secondTest() {
		System.out.println("This is second test");
	}
	@Test(groups="Testing1")
	public void thirdTest() {
		System.out.println("This is third test");
	}
  
}
