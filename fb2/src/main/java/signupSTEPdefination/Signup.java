package signupSTEPdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Signup {
	WebDriver driver;
	@Given("^user should be on facebook signup page$")
	public void user_should_be_on_facebook_signup_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (6)\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	
	}

	@When("^Enter valid firstname and Valid lastname$")
	public void enter_valid_firstname_and_Valid_lastname() throws Throwable {
		driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("komal");
		driver.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys("kadam");
	   
	}

	@When("^Enter mobile number and password$")
	public void enter_mobile_number_and_password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys("9112348023");
		driver.findElement(By.xpath("//input[@id='u_0_w']")).sendKeys("komal@823");
	  
	}

	@Then("^click on birthday$")
	public void click_on_birthday() throws Throwable {
		WebElement Day=driver.findElement(By.name("birthday_day"));
		Select select=new Select(Day);
		select.selectByIndex(8);
		WebElement month=driver.findElement(By.name("birthday_month"));
		Select select1=new Select(month);
		select1.selectByVisibleText("Jun");
		WebElement year=driver.findElement(By.id("year"));
		Select select2=new Select(year);
		select2.selectByValue("1993");
	 
	}

	@Then("^click on gender$")
	public void click_on_gender() throws Throwable {
		driver.findElement(By.className("_8esa")).click();
		
	    
	}

	@Then("^user should be able to signup successfully$")
	public void user_should_be_able_to_signup_successfully() throws Throwable {
	    driver.findElement(By.name("websubmit")).click(); 
	    String title=driver.getTitle();
	   Assert.assertFalse(title.contains("crm"));
	}



}
