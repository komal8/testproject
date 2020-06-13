package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		/*WebElement url1=driver.findElement(By.linkText("Gmail"));
		url1.click();
		System.out.println(url1); */

	//	WebElement url=driver.findElement(By.tagName("a"));
	List<WebElement> Url2=driver.findElements(By.tagName("a"));
		System.out.println(Url2);
		
	}

}
