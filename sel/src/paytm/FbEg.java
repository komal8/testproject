package paytm;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class FbEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		CaptureScreenshots(driver,"fb-login");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kadamk8@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("komu8");
		CaptureScreenshots(driver,"fb-inputs");
		driver.findElement(By.xpath("//input[@type='submit']"));
		CaptureScreenshots(driver,"fb-home");
	WebElement Birthfield= driver.findElement(By.xpath("//div[@class='_5k_5']"));
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select sel=new Select(day);
		sel.selectByIndex(8);	
		Select sel1=new Select(month);
		sel1.selectByValue("6");	
		Select sel2=new Select(year);
		sel2.selectByValue("1993");
		CaptureScreenshots(driver,"Birthfield-");

	}
	static void CaptureScreenshots(WebDriver driver,String ScreenshotsName) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".//Screenshots//Facebook-"+ScreenshotsName+".png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
