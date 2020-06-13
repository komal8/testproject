package ListenerTest_Demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://www.zlti.com");
List<WebElement>Links=		driver.findElements(By.tagName("a"));
System.out.println("total :"+Links.size());
Iterator<WebElement>itr=Links.iterator();
while(itr.hasNext()) {
	String url=itr.next().getAttribute("href");
	System.out.println("Url s are :"+url);
	if(url==null || url.isEmpty()) {
		System.out.println("url is not configured broken");
		continue;
	}
	if(!url.startsWith("http://www.zlti.com"))
	{
		System.out.println("url is belong to other domain");
		continue;
	}
	 try {
         HttpURLConnection huc = (HttpURLConnection)(new URL(url).openConnection());
         
         huc.setRequestMethod("HEAD");
         
         huc.connect();
         
         int respCode = huc.getResponseCode();
         
         if(respCode >= 400){
             System.out.println(url+" is a broken link");
         }
         else{
             System.out.println(url+" is a valid link");
         }
             
     } catch (MalformedURLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
     } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
     }
	driver.close();
}


	}

}
