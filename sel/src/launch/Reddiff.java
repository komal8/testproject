package launch;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Reddiff {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		/*String str=driver.getCurrentUrl();
		System.out.println(str);
		String Mainwindow=driver.getWindowHandle();
		System.out.println(Mainwindow);
		Set<String>WinIds=driver.getWindowHandles();
	int count=	WinIds.size();
	System.out.println(count);
		Iterator<String>itr=WinIds.iterator();
		while(itr.hasNext()) {
			String childwindow=itr.next();
			if(!Mainwindow.equals(childwindow)) {
				driver.switchTo().window(childwindow);
				System.out.println("the unique id of child window is:"+childwindow);
				System.out.println(driver.getTitle());
			}
			driver.switchTo().window(Mainwindow);
			System.out.println(driver.getTitle());
			
		}*/
		String expectedtitle="Wikipedia";
		//System.out.println(expectedtitle);
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		if(actualtitle.equals(expectedtitle)) {
			System.out.println("correct");
		} else {
			System.out.println("incorrect");
		} 
		TakesScreenshot ts=(TakesScreenshot)driver;
		File scrfile=ts.getScreenshotAs(OutputType.FILE);
		File destfile=new File(".//Screenshots//wiki2.png");
				try {
					FileHandler.copy(scrfile, destfile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 

	}

}
