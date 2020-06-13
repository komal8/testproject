package sel4;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Pytm {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Searchfield=driver.findElement(By.xpath("//input[@type='search']"));
	WebElement Loginbtn=driver.findElement(By.xpath(" //div[@class='_3ac-']"));
	
	File src=	Searchfield.getScreenshotAs(OutputType.FILE);
	try {
	FileHandler.copy(src, new File(".//Screenshots//searchtab.png"));	
		

	}
catch(IOException e) {
	
}
	File src1=Loginbtn.getScreenshotAs(OutputType.FILE);
try	{
		FileHandler.copy(src1, new File(".//Screenshots//logtab.png"));
	}
catch(IOException e) {
	
}
	}
	}
	


	


