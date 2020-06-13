package frameExample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.crmpro.com/");
		WebElement un=driver.findElement(By.name("username"));
		WebElement upass=driver.findElement(By.name("password"));
		WebElement loginBtn=driver.findElement(By.xpath("//input[@class='btn btn-small']"));
		un.sendKeys("Mayuri_257");
		upass.sendKeys("mayuri$257");
		loginBtn.click();
		String hm_Title=driver.getTitle();
		System.out.println(hm_Title);
		//driver.switchTo().frame("mainpanel"); // switching frame based on name
		//driver.switchTo().frame(1);   //switching frame based on index
List<WebElement>iframe=driver.findElements(By.tagName("iframe"));
int framecount=iframe.size();
System.out.println(framecount);
//driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
//driver.switchTo().defaultContent();
driver.switchTo().frame("leftpanel");
//driver.quit();
	}

}
