package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class TestGroups {
	
	
	@Test(groups="smoke")
	public void groupaGoogle(){
		
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://www.google.co.in/?gfe_rd=cr&ei=XpS1WPmEMuby8Aft-KjgDg&gws_rd=ssl");
		  driver.close();
 
	}

	@Test(groups="sanity")
	public void groupbgmail(){
		
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
		  driver.close();
	}

	@Test(groups="functional", dependsOnGroups="smoke")
	public void groupciob(){
		
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://www.iob.in/default.aspx");
		  driver.close();
		  
	}

	
}
