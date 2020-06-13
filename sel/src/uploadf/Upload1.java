package uploadf;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\Amit Jadhav\\Desktop\\LIC-2018.pdf");
		driver.findElement(By.className("pm-dialog")).click();
Alert alert=driver.switchTo().alert();
String alertText=alert.getText();
System.out.println(alertText);
alert.dismiss(); 
	}
}

