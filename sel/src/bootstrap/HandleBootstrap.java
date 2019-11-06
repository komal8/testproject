package bootstrap;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBootstrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium3\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		driver.findElement(By.id("menu1")).click();
		
		/*	List<WebElement>ListDD=driver.findElements(By.id("menu1"));
		System.out.println("total no.of webelement coming "+"dropdown list is :"+ListDD.size());
		/*for(WebElement ele:ListDD)
		{
			System.out.println(ele.getAttribute("innerHTML"));
			if(ele.getAttribute("innerHTML").contains("Gmail")) {
				ele.click();
				break;
			}
	for(WebElement ele:ListDD) {
			System.out.println(ele.getText());
			if(ele.getText().equalsIgnoreCase("Gmail"))
			{
				ele.click();
				break;
			}
		}*/


	}	

}



