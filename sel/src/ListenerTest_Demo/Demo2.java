package ListenerTest_Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("document.getElementById('email').value='komalk@gmail.com';");
js.executeScript("document.getElementById('pass').value='komal123';");
/*WebElement btn=driver.findElement(By.xpath("//*[@id='u_0_b']"));
js.executeScript("arguments[0].click();",btn);*/
js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
js.executeScript("history.go[0]");
System.out.println(driver.getTitle());
js.executeScript("window.history.forward()");
System.out.println(driver.getTitle());
js.executeScript("window.history.back()");
System.out.println(driver.getTitle());

	}

}
