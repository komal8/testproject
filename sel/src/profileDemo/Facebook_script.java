package profileDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_script {
	public static Properties prop;
	public static WebDriver driver;
	static {
		File fs=new File(".\\config1\\config1.properties");
		
		try {
			FileInputStream fis = new FileInputStream(fs);
			prop=new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get(prop.getProperty("Url"));
driver.findElement(By.name(prop.getProperty("First_name"))).sendKeys("komal");
driver.findElement(By.name(prop.getProperty("Last_name"))).sendKeys("kadam");
driver.findElement(By.name(prop.getProperty("Email_id"))).sendKeys("kadam.komal8@gmail.com");
driver.findElement(By.name(prop.getProperty("pass_name"))).sendKeys("komu893");
	}

}
