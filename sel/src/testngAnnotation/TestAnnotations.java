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

public class TestAnnotations {
	@Test
	public void test() {
		System.out.println("test1");
	}
	@Test
	public void test2() {
		System.out.println("test2");
	}
	@Test
	public void test3() {
		System.out.println("test3");
	}
	@BeforeSuite
	public void beforesuite() {
		System.out.println("beforesuite");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("beforetest");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("beforeclass");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("beforemethod");
	}
	@AfterSuite
	public void aftersuite()
	{
	System.out.println("aftersuite");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("aftersuite");
	}
@AfterClass
public void afterclass()
{
	System.out.println("afterclass");
}
@AfterMethod
public void aftermethod()
{
	System.out.println("aftermethod");
}
}
