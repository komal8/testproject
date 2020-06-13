package testngAnnotation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadriven2 {
	WebDriver driver;
	@BeforeMethod
public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}
@AfterMethod
public void teardown() {
	driver.quit();
} 
@Test(dataProvider="getData")
@DataProvider
public void testData(String fname,String lname,String eid,String pass) {
	driver.findElement(By.name("firstname")).clear();
	driver.findElement(By.name("firstname")).sendKeys("komal");
	driver.findElement(By.name("lastname")).clear();
	driver.findElement(By.name("lastname")).sendKeys("kadam");
	driver.findElement(By.name("reg_email__")).clear();
	driver.findElement(By.name("reg_email__")).sendKeys("komalk@gmail.com");
	driver.findElement(By.name("reg_passwd__")).clear();
	driver.findElement(By.name("reg_passwd__")).sendKeys("komal");
	System.out.println(fname+""+lname+""+eid+""+pass);
}


@DataProvider
public Object[][] getData() {
	Object data[][]=new Object[3][4];
	data[0][0]="pooja";
	data[0][1]="somani";
	data[0][2]="poo.18@gmail.com";
	data[0][3]="somu9*";
	
	data[1][0]="poonam";
	data[1][1]="swami";
	data[1][2]="sweetie@gmail.com";
	data[1][3]="sweetie*";
	
	data[2][0]="pratik";
	data[2][1]="solanki";
	data[2][2]="pratik54@gmail.com";
	data[2][3]="mummasboy*";
	
	/*data[3][0]="anvi";
	data[3][1]="kadam";
	data[3][2]="anush4@gmail.com";
	data[3][3]="anduuu"; */
	return data;
	
	
}



}