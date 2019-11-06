package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	@Test
	public void test1() {
		Assert.assertEquals("Hello","Hii");
	}
	@Test
	public void test2() {
		Assert.assertEquals("Hello","Hello");
	}
	@Test
	public void test3() {
		Assert.assertEquals("Hello","Hii","the text we are getting from appl not matching");
	}
	@Test
	public void test4() {
		Assert.assertTrue(true);
	}
	@Test
	public void test5() {
		Assert.assertEquals("Hello","Hii");
	}
	@Test
	public void test6() {
		Assert.assertTrue(false,"the condition is failed");
	}
	@Test
	public void test7() {
		Assert.assertEquals("Hello","Hii");
	}

}
