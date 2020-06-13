package ListenerTest_Demo;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Llinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://www.zlti.com");
List<WebElement>Links=		driver.findElements(By.tagName("a"));

System.out.println(Links.size());
for(int i=0;i<Links.size();i++) {
String url=	Links.get(i).getText();
System.out.println("total url s are :"+url);
if(url.contains("https://www.zlti.com/news")) {
	Links.get(i).click();
	
	
}
}
driver.close();

	}

}
