package testng;

import org.testng.annotations.Test;

public class Demo {
	@Test
	public void test1()
	{
		System.out.println("i am first test");
	}
	@Test(enabled=true)
	public void test2() {
		System.out.println("i am second test");
	}
	@Test
	public void test3() {
		System.out.println("i am third test");
	}
	@Test(enabled=false)
	public void test4(){
		System.out.println("i am fourth test ");
	}
	@Test(enabled=true)
	public void test5() {
		System.out.println("i am fifth test ");
	}
	@Test(enabled=false)
	public void test6() {
		System.out.println("i am sixth test");
	}
	

}
