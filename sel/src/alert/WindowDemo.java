package alert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("http://www.naukri.com");
	List<WebElement>links=	driver.findElements(By.tagName("a"));
	int Totallink=links.size();
	System.out.println(Totallink);
	Thread.sleep(1000);
	for(int i=0;i<Totallink;i++) {
		String text=links.get(i).getText();
		System.out.println("the link are:"+text);
	}

	}

}
