package testng;

import org.junit.Assert;
import org.testng.annotations.Test;

public class FailedTc {
	@Test
	public void LoginTc() {
		System.out.println("lognin");
		Assert.assertTrue(true);
	}
	@Test
	public void HomeTc() {
		System.out.println("Homepage");
		Assert.assertTrue(true);
	}
	@Test
	public void SignUp() {
		System.out.println("signup page");
		Assert.assertFalse(true);
	}
	@Test
	public void Logout() {
		System.out.println("logout successfully");
		Assert.assertTrue(true);
	}

}
