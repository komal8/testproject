package uploadf;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFRobot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com");
		String mainwindow=driver.getWindowHandle();
	Set<String>	wids=driver.getWindowHandles();
	Iterator<String> itr=wids.iterator();
	while(itr.hasNext())
	{
	
		String childwindow = itr.next();
		if(!mainwindow.equals(childwindow))
		{
		driver.switchTo().window(childwindow);
		driver.close();
		}
	}
	driver.switchTo().window(mainwindow);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
/*	driver.findElement(By.xpath("//div[text()='Login']")).click();
	driver.findElement(By.id("eLoginNew")).sendKeys("kadam.komal37@gmail.com");
driver.findElement(By.id("pLogin")).sendKeys("komalk8*");
driver.findElement(By.xpath("//button[text()='Login']")).click(); */
	
	}

}
