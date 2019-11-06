package redbus;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbustesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium3\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String mainWindow=driver.getWindowHandle();
		System.out.println("the main window is"+mainWindow);
		String expectedTitle="Jobs-Recruitment-Jobsearch-Employment-Jobvacancies-Naukri.com";
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		if(actualTitle.contains(expectedTitle)) {
			System.out.println("main window is verified");		
		}else {
			System.out.println("this is not main window title ");	
		}
		Set<String>WinIDs=driver.getWindowHandles();
		Iterator<String>itr=WinIDs.iterator();
		while(itr.hasNext()) {
			String childwindow=itr.next();
			if(!mainWindow.equals(childwindow))
			{
				driver.switchTo().window(childwindow);
				System.out.println("the unique id of child window is:"+childwindow);
				System.out.println(driver.getTitle());			
			}
		}
		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
