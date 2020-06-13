package robotDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Demo {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://www.indeed.co.in.");
	Thread.sleep(2000);
	driver.findElement(By.className("resume-promo-link")).click();
	driver.findElement(By.xpath("//label[contains(text(),'Upload Resume')]")).click();
	
	
	//Store the location of the file in clipboard 
	//Clipboard
	 StringSelection strSel = new StringSelection("C:\\SeleniumResume.doc");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSel, null);
	
	//Create an object for robot class
	Robot robot = new Robot();
	//Control key in the keyboard
	//Ctrl+V 
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);

	}




}

