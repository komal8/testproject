package bootstrap;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com");
		/*driver.switchTo().frame(0);
driver.findElement(By.xpath("//a[(text()='Login')]")).click();
driver.switchTo().frame(1);
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kadam.komal37@gmail.com");*/
List<WebElement>frame=		driver.findElements(By.tagName("iframe"));
int framecount=frame.size();
Iterator<WebElement>itr=frame.iterator();
while(itr.hasNext()) {
	WebElement childFrame=itr.next();
	String framename=driver.getTitle();
}
System.out.println(framecount);


	
	
	
}
	}


