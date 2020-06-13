package sel4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotCDemo {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//span[contains(text(),'Select WORD files')]")).click();
	//	copy the file on clipboard from local directory
	//	it will pickup the file which u wants to upload
		// system clipboard ie.temporary memory
	StringSelection sel=	new StringSelection("C:\\Users\\Amit Jadhav\\Desktop\\Komal-Resume.docx");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
	
	Robot robot=new Robot();
	// paste that copied file to opened window
	robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_CONTROL);
robot.keyRelease(KeyEvent.VK_V);
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);



	}

}
