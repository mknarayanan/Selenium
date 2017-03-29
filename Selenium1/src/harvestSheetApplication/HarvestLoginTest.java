package harvestSheetApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HarvestLoginTest {
	//
 WebDriver driver = new FirefoxDriver();
  @Test
  public void harvestLogin()  {
	  

	  driver.manage().window().maximize();
	  driver.get("http://10.4.13.11:8005/Harvest_Upload/Login.jsp");
	  WebElement un = driver.findElement(By.name("username"));
	  un.sendKeys("ASAP");
	  WebElement pass = driver.findElement(By.name("password"));
	  pass.sendKeys("ASAP");
	  driver.findElement(By.xpath("html/body/div[2]/div/form/button")).click();
	  WebElement ordernum =driver.findElement(By.name("id"));
	  ordernum.sendKeys("1234");
	  driver.findElement(By.xpath("html/body/div[1]/div/form[1]/button")).click();
 
}
	  
	  
}
