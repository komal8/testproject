package ksrtc;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handlewindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/login/show.do");
	/*	driver.findElement(By.xpath("//*[@href='/oprs-web/login/show.do']")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept(); */	
driver.findElement(By.xpath(" //a[contains(text(),'New User Register')]")).click();

WebDriverWait wait = new WebDriverWait(driver, 120);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'User Name(e-Mail)')]"))).sendKeys("kadam.komal8@gmail.com");
/*String mainwindow =driver.getWindowHandle();
System.out.println("the name of child window is:" +mainwindow);
driver.switchTo().window(mainwindow);
System.out.println("handel");
driver.findElement(By.xpath("//label[contains(text(),'User Name(e-Mail)')]")).sendKeys("komal@gmail.com"); */
 TakesScreenshot ts=(TakesScreenshot)driver;
 File  scrfile=ts.getScreenshotAs(OutputType.FILE);
 File destfile= new File(".\\sel\\Screenshots\\ksrtc.png");
 try {
	FileHandler.copy(scrfile,destfile );
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//label[contains(text(),'Full Name')]")).sendKeys("kadam komal");
driver.findElement(By.xpath("//label[contains(text(),'Mobile Number')]")).sendKeys("9093014220");
driver.findElement(By.xpath("//input[@name='SaveBtn']")).click();
	}

}
