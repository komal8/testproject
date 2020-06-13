package dempProperties1;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Handlewindow {
	public static void main(String[] args) {		
		try {		
File fs=new File(".//property//config.properties");
FileInputStream fins=new FileInputStream(fs);
Properties p=new Properties();
	p.load(fins);
System.setProperty("webdriver.chrome.driver","C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.facebook.com");
driver.findElement(By.name(p.getProperty("fname"))).sendKeys("komal");;
driver.findElement(By.name(p.getProperty("lname"))).sendKeys("kadam");
driver.findElement(By.name(p.getProperty("email"))).sendKeys("kadamkomal37@gmail.com");
driver.findElement(By.name(p.getProperty("password"))).sendKeys("happy");

}
		catch(Exception e)
		{
			e.printStackTrace();			
		}
	}
}


