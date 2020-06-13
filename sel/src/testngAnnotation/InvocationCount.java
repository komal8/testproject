package testngAnnotation;

import org.testng.annotations.Test;

public class InvocationCount {
	
	
	@Test(invocationCount=10)
	public void loginTest() {
		System.out.println("login repetative manner");
		//int i=9/0;
	}
	@Test(dependsOnMethods="loginTest")
	public void regPage(){
		System.out.println("register to app");
	}
	@Test(dependsOnMethods="loginTest")
	public void signUp() {
		System.out.println("signup to app");
	}
	@Test
	public void search()
	{
		System.out.println("search for particular");
	}

}
