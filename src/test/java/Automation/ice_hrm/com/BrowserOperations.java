package Automation.ice_hrm.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOperations {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver","chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     
     driver.navigate().to("https://www.amazon.in/");
     
     driver.findElement(By.xpath("//div[@id='nav-xshop']/a[3]")).click();
     
     driver.navigate().refresh();
     driver.navigate().back();
     driver.navigate().forward();
	}

}
