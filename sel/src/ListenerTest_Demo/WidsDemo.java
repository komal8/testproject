package ListenerTest_Demo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WidsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/popup.php");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		String MainWindow=driver.getWindowHandle();
		System.out.println("Main page:"+MainWindow);
		Set<String>Wids=driver.getWindowHandles();
		Iterator<String>itr=Wids.iterator();
		while(itr.hasNext()) {
			String childwindow=itr.next();
			if(!MainWindow.equals(childwindow)) {
				driver.switchTo().window(childwindow);
				System.out.println("child window :"+driver.getTitle());
				driver.findElement(By.xpath("//*[@type='text']")).sendKeys("komal kadam");
				driver.findElement(By.xpath("//*[@value='Submit']")).click();
				driver.close();
			}
		
			driver.switchTo().window(MainWindow);
			System.out.println("parent window :"+driver.getTitle());
		}
		

	
	}
}

