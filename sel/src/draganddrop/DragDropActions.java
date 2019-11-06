package draganddrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium3\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
WebElement source=driver.findElement(By.id("box1"));
WebElement target=driver.findElement(By.id("box103"));
WebElement source1=driver.findElement(By.id("box3"));
WebElement target1=driver.findElement(By.id("box104"));
WebElement source2=driver.findElement(By.id("box4"));
WebElement target2=driver.findElement(By.id("box102"));
WebElement source3=driver.findElement(By.id("box5"));
WebElement target3=driver.findElement(By.id("box107"));
WebElement source4=driver.findElement(By.id("box6"));
WebElement target4=driver.findElement(By.id("box101"));
WebElement source5=driver.findElement(By.id("box2"));
WebElement target5=driver.findElement(By.id("box106"));
WebElement source6=driver.findElement(By.id("box7"));
WebElement target6=driver.findElement(By.id("box105"));
Actions actions=new Actions(driver);
actions.dragAndDrop(source, target).build().perform();
actions.dragAndDrop(source1, target1).build().perform();
actions.dragAndDrop(source2, target2).build().perform();
actions.dragAndDrop(source3, target3).build().perform();
actions.dragAndDrop(source4, target4).build().perform();
actions.dragAndDrop(source5, target5).build().perform();
actions.dragAndDrop(source6, target6).build().perform();


	}

}
