package testng;

import org.testng.annotations.Test;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestcasesTsng {
	@Test
	public void test1() {
		System.out.println("test1()");
		Assert.assertTrue(true);
	}
	@Test
	public void test2() {
		System.out.println("test2()");
		Assert.assertTrue(false);
	}
	@Test
	public void test3() {
		System.out.println("test3()");
		Assert.assertFalse(true);
	}

}
