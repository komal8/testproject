package paytm;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement web_table=driver.findElement(By.xpath("//table[@id='customers']"));
		captureScreenshots(web_table,"table");
	}	
static void captureScreenshots(WebElement ele,String filename) {
	File scrfile=ele.getScreenshotAs(OutputType.FILE);

	try {
		FileHandler.copy(scrfile, new File(".//Screenshots//w3-"+filename+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}


 /*List<WebElement>iframe=driver.findElements(By.tagName("iframe"));
 int framecount=iframe.size();
 System.out.println("total no. of frames"+framecount);
 WebElement ele=driver.findElement(By.xpath("//*[@src='/v1/api/login?isIframe=true&theme=mp-web']"));
 driver.switchTo().frame(ele);
 driver.findElement(By.xpath("//span[@screen-name='auth-init/QRlogin']")).click(); 
 driver.findElement(By.xpath("//*[@name='username']")).sendKeys("9975337825");
 driver.findElement(By.xpath("//*[@name='password']")).sendKeys("smile8"); */
 		
 

	}


