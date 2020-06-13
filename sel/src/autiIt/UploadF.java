package autiIt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadF {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
	//	driver.findElement(By.className("mTxt")).click();
	//	Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	String text=driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credenti')] ")).getText();
	System.out.println(text);
	driver.findElement(By.linkText("Elemental Selenium")).click();
	driver.quit();
	/*	driver.findElement(By.className("plainBtn")).click();
driver.findElement(By.id("emailId")).sendKeys("kadam.komal37gmail.com");
driver.findElement(By.id("pwd")).sendKeys("smile8");
driver.findElement(By.className("orangeBtn")).click(); */
	}

}
