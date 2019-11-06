package testng;

import org.testng.annotations.Test;

public class PriotizetstngTest {
	@Test(priority=1)
	public void loginTest() {
	System.out.println("loginTest()");
	}
@Test(priority=2)
public void sendanEmail() {
	System.out.println("sendanEmail()");
}
@Test(priority=3)
public void logout() {
	System.out.println("logout()");
}

}
