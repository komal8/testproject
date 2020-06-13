package ListenerTest_Demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FailedTestcScreenshot {

	WebDriver driver;
	@Test
	public void CaptureScreenshot() {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//*[@id='emai']")).sendKeys("Learn Automation");
		
		
	}
@AfterMethod
public void tearDown(ITestResult result) {
	if(ITestResult.FAILURE== result.getStatus()) {
		TakesScreenshot ts=(TakesScreenshot)driver;
	File src=	ts.getScreenshotAs(OutputType.FILE);
	
		try {
			FileHandler.copy(src, new File("./Screenshots/"+result.getName()+".png"));
			System.out.println("screenshot taken");
		} catch (IOException e) {
			System.out.println("exception while getting screenshot"+e.getMessage());
			e.printStackTrace();
		}
		}
	driver.quit();
	
}
	
	
	
	
	}
	
	

