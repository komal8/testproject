package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpectedCondition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		WebElement ele=driver.findElement(By.xpath("//*[@name='q']"));
		ele.sendKeys("Testing");
		ele.submit();
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement ele1= wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Software testing - Wikipedia")));
		
ele1.click();
	}

}
