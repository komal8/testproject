package sel4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertUtility {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get( "https://www.facebook.com/");
		//driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		//Alert alert=driver.switchTo().alert();
		//driver.switchTo().alert().accept();
WebElement img=driver.findElement(By.xpath(" //div[@class='clearfix']//div[@class='lfloat _ohe']"));
System.out.println("image is displayed:"+img.isDisplayed());
WebElement Fradio=driver.findElement(By.xpath(" //label[contains(text(),'Female')]"));
System.out.println("female btn is selected:"+Fradio.isSelected());
		WebElement Mradio=driver.findElement(By.xpath("//label[contains(text(),'Male')]"));		
System.out.println("male btn is enabled:"+Mradio.isEnabled());
	}
	
}
