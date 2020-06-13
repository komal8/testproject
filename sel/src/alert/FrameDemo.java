package alert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("http://www.goibibo.com");
List<WebElement>frames=		driver.findElements(By.tagName("iframe"));
int TotalFramecount=frames.size();
System.out.println("total frames are:"+TotalFramecount);
driver.findElement(By.id("get_sign_in")).click();
driver.switchTo().frame("authiframe");
driver.findElement(By.xpath("//*[@id='authMobile']")).sendKeys("7533042530");
driver.findElement(By.xpath("//*[@id='mobileSubmitBtn']")).click();
Thread.sleep(1000);
driver.switchTo().parentFrame();


	}

}
