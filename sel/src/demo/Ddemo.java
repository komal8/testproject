package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ddemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://jqueryui.com/droppable");
Actions actions=new Actions(driver);
driver.switchTo().frame(0);
WebElement source=driver.findElement(By.id("draggable"));
Thread.sleep(2000);
WebElement destination=driver.findElement(By.id("droppable"));
actions.dragAndDrop(source, destination).build().perform();


	}

}
