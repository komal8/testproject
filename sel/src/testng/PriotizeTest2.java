package testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class PriotizeTest2 {
	@Test(priority=1)
	public void login() {
		System.out.println("login");
	}
	@Test(priority=2)
	public void sendanEmail() {
		System.out.println("sendanEmail");
	}
	@Test(priority=3)
	public void logout(){
		System.out.println("logout");
	}
@Test 
public void createAnaccount(){
	System.out.println("createanaccount()");
}
@Test
public void deleteAnaccount(){
	System.out.println("deleteanaccount()");
	
}
}
