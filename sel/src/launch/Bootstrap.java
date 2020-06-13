package launch;

import java.io.PrintStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("menu1")).click();
		List<WebElement> ListDD=driver.findElements(By.xpath("//div[@class='dropdown-menu test']//a"));
		System.out.println(ListDD.size());
		for(int i=0;i<ListDD.size();i++) {
		WebElement ele=	ListDD.get(i);
	
	String innerHtml=	ele.getAttribute("innerHtml");
	System.out.println("value of dropdown is:"+innerHtml);
			if(innerHtml.contentEquals("css")) {
				ele.click();
			}
		}
	

	}

}
