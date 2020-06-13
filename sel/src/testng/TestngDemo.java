package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo {
@BeforeSuite
	public void beforesuite() {
		System.out.println("beforesuite");
	}
@BeforeTest
	public void beforetest() {
		System.out.println("beforetest");
	}
@BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass");
	}
@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethod");		
}
@Test
public void login() {
	System.out.println("1st test case");
}
@Test
public void logout() {
	System.out.println("2nd test case");
}
@AfterSuite
	public void aftersuite() {
		System.out.println("aftersuite ");
	}
@AfterTest
	public void aftertest() {
		System.out.println("aftertest ");
	}
@AfterClass
	public void afterclass() {
		System.out.println("afterclass");
	}
@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod ");
	}
}
