package Automation.ice_hrm.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edge {
	public static void main(String[] args)
	{
 System.getProperty("webdriver.edge.driver","chromedriver.exe");
 WebDriver driver=new EdgeDriver();

 driver.navigate().to("https:/cybersuccess.icehrm.com/");
 driver.manage().window().maximize();
 
 driver.findElement(By.xpath("//div[@id='nav-xshop']/a[3]")).click();
 
 driver.navigate().refresh();
 
 driver.navigate().back();

 driver.navigate().forward();
 
  
  
	} 
  
}
