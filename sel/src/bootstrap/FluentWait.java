package bootstrap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
driver.findElement(By.xpath("//*[@type='email']")).sendKeys("kadam.komal37@gmail.com");
WebElement btn=driver.findElement(By.xpath("//*[@class='RveJvd snByac']"));



	}

}
