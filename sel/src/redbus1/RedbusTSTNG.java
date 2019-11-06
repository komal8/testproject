package redbus1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusTSTNG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium3\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.redbus.in");

		driver.findElement(By.xpath("//*[@class='manageHeaderLbl']")).click();
		driver.findElement(By.xpath("//div[@id='signin-block']")).click();	
		driver.findElement(By.id("signInLink")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='modalIframe']")));
	//	driver.findElement(By.xpath("//input[@id='mobileNoInp']")).sendKeys("9096304959"); //
		driver.findElement(By.xpath("//ul[@id='selectedPhCode']")).sendKeys("93");
		

	}

}
