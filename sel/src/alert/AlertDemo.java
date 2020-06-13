package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://demo.guru99.com/test/delete_customer.php");
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@name='cusid']")).sendKeys("11023");
driver.findElement(By.xpath("//*[@type='submit']")).click();
Alert alert=driver.switchTo().alert();
String alerttxt=driver.switchTo().alert().getText();
System.out.println(alerttxt);
Thread.sleep(1000);
alert.accept();

	}

}
