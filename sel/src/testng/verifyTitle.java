package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class verifyTitle {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void verifypageTitle(String browserName) {
		if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\selenium3\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		 driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium3\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
			else if(browserName.equalsIgnoreCase("IE"))
			{
				System.setProperty("webdriver.ie.driver", "D:\\selenium3\\IEDriverServer.exe");
				driver=new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.get("http://www.facebook.com");
			System.out.println(driver.getTitle());	
			driver.close();
		
	}
	}

