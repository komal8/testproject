package handlewebtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
List<WebElement>col_List=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
int totalcols=col_List.size();
System.out.println("total no.of column are:"+totalcols);
List<WebElement>row_List=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
int totalrows=row_List.size();
System.out.println("total no.of row are:"+totalrows);
for(int i=0;i<totalcols;i++) {
  for(int j=0;j<totalrows;j++){ 
	String tableHeader=row_List.get(i).getText();
	System.out.println(tableHeader);
	if(row_List.get(i).getText().equals("Mexico")){
		row_List.get(i).click();
		
	}
}
	}
	}
}
