package testPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Snapshot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
  WebDriver driver = new FirefoxDriver();
  
  driver.get("https://www.google.co.in/?gfe_rd=cr&ei=UK-lWLyoLueK8Qe35IeoCQ");
		
 File srcf = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 driver.close();
try{

FileUtils.copyFile(srcf, new File("D:/Sel/Selenium/error.jpg"));
}
catch(IOException e){}	
		
}
	
	
}


