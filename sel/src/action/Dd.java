package action;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dd {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
	WebElement Day=	driver.findElement(By.xpath("//*[text()='Day']"));
	Thread.sleep(1000);
Select select=new Select(Day);
 java.util.List<WebElement>  values=select.getOptions();
 int totaldays=values.size();
 System.out.println("totalvalues"+totaldays);
boolean status= select.isMultiple();
System.out.println(status);

 


	}

}
