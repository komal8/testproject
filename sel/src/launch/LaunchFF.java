package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchFF {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium3\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("komal");
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("kadam");
		driver.findElement(By.xpath("//input[@id='u_0_q']")).sendKeys("kadamkomal12@gmail.com");
		driver.findElement(By.xpath("//input[@id='u_0_x']")).sendKeys("smile8*");
		Select select=new Select(driver.findElement(By.xpath("//*[@name='birthday_day']")));
		select.selectByVisibleText("8");
		Select select1=new Select(driver.findElement(By.xpath("//*[@id='month']")));
		select1.selectByValue("6");
		Select select2=new Select(driver.findElement(By.xpath("//*[@id='year']")));
		select2.selectByVisibleText("1993");
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		Thread.sleep(2000);
		driver.close();
		
		
			
	}

}
