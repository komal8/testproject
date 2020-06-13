package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Fb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (6)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.facebook.com");
String expectedText="Create an account ";
System.out.println(expectedText);
 String actualText=driver.findElement(By.xpath("//*[text()='Create an account']")).getText();
 System.out.println(actualText);
 if(actualText.equals(expectedText))	 
 {
	 System.out.println("verified");
 }
 else
 {
	 System.out.println(" not verified"); 
 }
 

		


	}

}
