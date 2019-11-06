package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependncyTstng {
@Test
public void test1() {
	Assert.assertEquals("Hello","Hello");
}
@Test(dependsOnMethods= {"test1"})
public void test2() {
	Assert.assertEquals("Hello", "Hello");
}
@Test(dependsOnMethods= {"test1","test2"})
public void test3() {
	Assert.assertEquals("Hi", "Hi","the text we are getting from an applc is"+" ");
}
@Test(dependsOnMethods= {"test3"})
public void test4() {
	Assert.assertTrue(false);
}
@Test(dependsOnMethods= {"test4"})
public void test5() {
	Assert.assertTrue(true);
}
}
