package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		WebElement ele=driver.findElement(By.xpath("//*[@name='q']"));
		ele.sendKeys("Testing");
	ele.sendKeys(Keys.ENTER);
	//js.executeScript("window.scrollBy(0, 450)");
	WebElement ele1=driver.findElement(By.xpath(" //*[text()='The 7 Common Types of Software Testing! - Usersnap']"));
js.executeScript("argument[0].scrollIntoview();",ele1 );
	//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}

}
