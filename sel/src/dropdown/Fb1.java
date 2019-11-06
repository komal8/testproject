 package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium3\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.facebook.com");
			driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("komal");
					driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("kadam");
							driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("kadamkomal37@gmail.com");
							driver.findElement(By.xpath("//*[@name='reg_email_confirmation__']")).sendKeys("kadamkomal37@gmail.com");
									driver.findElement(By.xpath("//*[@autocomplete='new-password']")).sendKeys("smile8");
									Select select=new Select(driver.findElement(By.id("day")));
									select.selectByIndex(8);
									Select select1=new Select(driver.findElement(By.id("month")));
									select1.selectByVisibleText("Jun");
									Select select2=new Select(driver.findElement(By.id("year")));
									select2.selectByValue("1993");
								
									driver.findElement(By.xpath("//*[@class='_58mt']")).click();
									driver.findElement(By.xpath("//*[@name='websubmit']")).click();
	}

}
