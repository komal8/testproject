package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Fb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\selenium3\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.facebook.com");
String expectedText="Create an account ";
 String actualText=driver.findElement(By.xpath("//*[@class='mbs _52lq fsl fwb fcb']")).getText();
 System.out.println(actualText);
 if(actualText.contentEquals(expectedText))	 
 {
	 System.out.println("verified");
 }
 else
 {
	 System.out.println(" not verified"); 
 }
 

		


	}

}
