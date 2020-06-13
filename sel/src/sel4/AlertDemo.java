package sel4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		Alert alert=driver.switchTo().alert();
		driver.switchTo().alert().accept();
		
	//	driver.switchTo().alert().getText();
		//driver.switchTo().alert().dismiss();
		/* String actual=alert.getText();
		System.out.println("the text is:"+actual); */
			
			driver.quit();
		

	}

}
