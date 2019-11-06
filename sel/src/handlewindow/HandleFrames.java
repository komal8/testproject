package handlewindow;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium3\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.goibibo.com");
			driver.findElement(By.xpath("//*[@id='get_sign_up']")).click();
	java.util.List<WebElement>ListListiframe=driver.findElements(By.tagName("iframe"));
			int framecount=ListListiframe.size();
			WebElement ele=driver.findElement(By.xpath("//*[@id='authiframe']"));
			driver.switchTo().frame(ele);
			driver.findElement(By.id("authMobile")).sendKeys("9096304959");
			driver.findElement(By.id("mobileSubmitBtn")).click();
			driver.close();
		

	}

}
