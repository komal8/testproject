package autiIt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadF {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium3\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://naukri.com");
		driver.manage().window().maximize();
		driver.findElement(By.className("mTxt")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("plainBtn")).click();
driver.findElement(By.id("emailId")).sendKeys("kadam.komal37gmail.com");
driver.findElement(By.id("pwd")).sendKeys("smile8");
driver.findElement(By.className("orangeBtn")).click();
	}

}
