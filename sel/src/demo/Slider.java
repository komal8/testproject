package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium3\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://jqueryui.com/slider/");
Actions actions=new Actions(driver);
driver.switchTo().frame(0);
WebElement slider=driver.findElement(By.xpath("//div[@id='slider']"));
Thread.sleep(2000);
actions.moveToElement(slider).dragAndDropBy(slider, 300, 0).build().perform();
	}

}
