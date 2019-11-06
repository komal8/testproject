package paytm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchPaytm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium3\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.paytm.com");
		Thread.sleep(2000);
driver.findElement(By.xpath("//*[@class='_3ac-']")).click();
 List<WebElement>iframe=driver.findElements(By.tagName("iframe"));
 int framecount=iframe.size();
 System.out.println("total no. of frames"+framecount);
 WebElement ele=driver.findElement(By.xpath("//*[@src='/v1/api/login?isIframe=true&theme=mp-web']"));
 driver.switchTo().frame(ele);
 driver.findElement(By.xpath("//span[@event-type='customEvent']")).click();
 driver.findElement(By.xpath("//*[@name='username']")).sendKeys("9975337825");
 driver.findElement(By.xpath("//*[@name='password']")).sendKeys("smile8");
 		
 

	}

}
