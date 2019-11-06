package crossbarTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossbarTestng {
	static WebDriver driver;
	public static void brrName(String browserName,String Url) {
		if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\selenium3\\geckodriver-v0.25.0-win64\\geckodriver.exe");

			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium3\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();	
			}
		else if(browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "D:\\selenium3\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		} 
		else {
			System.out.println("driver not able to found");
		}
		driver.get("Url");
		driver.manage().window().maximize();
		driver.quit();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		brrName("Firefox","http://facebook.com");
		brrName("chrome","http://google.com");
		brrName("ie","http://gmail.com"); 
	
		}
	}


