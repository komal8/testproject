package bootstrap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleCheck {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		String ExpectedTitle="Gmail";
		if(actualTitle.equals(ExpectedTitle)) {
			System.out.println("we are on correct page");
		}
		else {
			System.out.println("we are on incorrect page");
		}
	}

}
