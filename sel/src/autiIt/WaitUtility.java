package autiIt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		WebElement fname=driver.findElement(By.name("firstname"));
		WebElement lname=driver.findElement(By.name("lastname"));
		WebElement email=driver.findElement(By.name("reg_email__"));
		WebElement pwd=driver.findElement(By.name("reg_passwd__"));
		WebElement forgottenLink=driver.findElement(By.partialLinkText("Forgotten"));
		sendkeys(driver,10,fname,"komal");
		sendkeys(driver,5,lname,"kadam");
		sendkeys(driver,10,email,"komal@8gmail.com");
		sendkeys(driver,10,pwd,"komal8*");
		clickonElement(driver,5,forgottenLink);
		
	}
	public static void sendkeys(WebDriver driver,int timeout,WebElement ele,String value) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys(value);
		
	}
	public static void clickonElement(WebDriver driver,int timeout,WebElement ele) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(ele));
		ele.click();
		
	}

}
