package action;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com");
String MainWindow=		driver.getWindowHandle();
Set<String>Wids=driver.getWindowHandles();
Iterator<String>itr=Wids.iterator();
while(itr.hasNext()) {
	String ChildWindow=itr.next();
	if(!MainWindow.equals(MainWindow)) {
		driver.switchTo().window(ChildWindow);
		driver.close();
	}
}
driver.switchTo().window(MainWindow);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);



	}

}
