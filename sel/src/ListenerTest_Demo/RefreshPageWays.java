package ListenerTest_Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshPageWays {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		/*driver.get("http://demo.guru99.com/selenium/guru99home/");
driver.navigate().refresh();*/
		driver.get("https://www.guru99.com");
		//driver.get(driver.getCurrentUrl());
		driver.navigate().to(driver.getCurrentUrl());
//driver.close();
	}

}
