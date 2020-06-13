package testngAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation2 {

	@BeforeSuite
	public void setup()
	{
		System.out.println("launch the browser");
	}
	
	@BeforeTest
	public void url()
	{
		System.out.println("enter the url");
	}
	@BeforeClass
	public void login()
	{
		System.out.println("login to app");
	}
	@BeforeMethod
	public void open()
	{
		System.out.println("open app");
	}
	
	@Test
	public void test1()
	{
		System.out.println("1st test case");
	}
	@Test
	public void test2()
	{
		System.out.println("2nd test case");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("logout app");
	}
	@AfterClass
	public void cookies()
	{
		System.out.println("deletecookies");
	}
	@AfterTest
	public void clear() {
		System.out.println("clear history");
	}
	@AfterSuite
	public void exit() {
		System.out.println("exit browser");
	}

}
