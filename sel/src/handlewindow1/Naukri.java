package handlewindow1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium3\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.naukri.com");
		String mainWindow=driver.getWindowHandle();
		Set<String>Wids=driver.getWindowHandles();
		int Windowcount=Wids.size();
	System.out.println("number of windows opened are:"+Windowcount);
	for(String wids:Wids) {
		System.out.println(" windows ids are:"+wids);
		if(!mainWindow.equals(wids)) {
			driver.switchTo().window(wids);
			driver.manage().window().maximize();
			driver.close();
		}
		
	}
	
	}

}
