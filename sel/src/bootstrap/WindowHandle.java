package bootstrap;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com");
		Thread.sleep(1000);
	String MainWindow=	driver.getWindowHandle();
	System.out.println(MainWindow);
Set<String>Wids=driver.getWindowHandles();
int totalChild=Wids.size();
System.out.println(totalChild);
Iterator<String>itr=Wids.iterator();
while(itr.hasNext()) {
String ChildW=	itr.next();
if(!MainWindow.equals(ChildW)) {
	driver.switchTo().window(ChildW);
	System.out.println("childwindows are:"+ChildW);
System.out.println(driver.getTitle());	
}
}
driver.switchTo().window(MainWindow);
System.out.println(driver.getTitle());
TakesScreenshot ts=(TakesScreenshot)driver;
File src=ts.getScreenshotAs(OutputType.FILE);
File dest=new File(".//Report//pic.png");
try {
	FileHandler.copy(src, dest);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.quit();

	}

}
