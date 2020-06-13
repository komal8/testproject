package ListenerTest_Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerTest_Demo.ListenerTest.class)
public class ListenerDemo {

@Test
public void Login() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/V4/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.name("uid")).sendKeys("komal kadam");
	Thread.sleep(1000);
	driver.findElement(By.name("password")).sendKeys("koma@2344");
	driver.findElement(By.name("btnLogin")).click();		
}
@Test
public void FailTest() {
	System.out.println("forcefully trying to fail test case");
	Assert.assertTrue(false);
}
}
