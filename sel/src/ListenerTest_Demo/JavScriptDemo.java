package ListenerTest_Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavScriptDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.stqatools.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('welcome to javascript');");
		Alert alert=driver.switchTo().alert();
		alert.accept();
String text=		js.executeScript("return document.title;").toString();
System.out.println("title of the page:"+text);
js.executeScript("window.location = 'https://www.stqatools.com'");		
js.executeScript("window.scrollBy(0,100)");

	}

}
