package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDDemo {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	driver.findElement(By.id("u_0_m")).sendKeys("komal");
	driver.findElement(By.id("u_0_o")).sendKeys("kadam");
	driver.findElement(By.id("u_0_r")).sendKeys("7588025330");
	driver.findElement(By.name("reg_passwd__")).sendKeys("kadam@8");
	WebElement date=driver.findElement(By.xpath("//*[@id='day']"));
	Select select=new Select(date);
	select.selectByIndex(9);
	WebElement month=driver.findElement(By.xpath("//*[@id='month']"));
	Select select1=new Select(month);
	select1.selectByVisibleText("Jun");
	WebElement year=driver.findElement(By.xpath("//*[@id='year']"));
	Select select2=new Select(year);
	select2.selectByValue("1993");
	driver.findElement(By.xpath("//*[@id='u_0_6']")).click();
	String ExpectedTitle="Facebook – log in or sign up";
	System.out.println(ExpectedTitle);
	String ActualTitle=driver.getTitle();
	System.out.println(ActualTitle);
	if(ActualTitle.equals(ExpectedTitle)) {
		System.out.println("verified");
		driver.findElement(By.xpath("//*[@id='u_0_13']")).click();
	}
	else {
		System.out.println("unidentified");
		
	}
	
	
	

	}

}
