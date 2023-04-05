package Automation.ice_hrm.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingExample2 {
  public static void main(String[] args)
  {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.navigate().to("http://www.google.com/");
	  System.out.println("First Tav Title : " + driver.getTitle());
	  String firstTabId=driver.getWindowHandle();
	   //open new tab in same window and switch the control automatically
	  //driver.switch().newwindow(WindowType.TAB);
	  //open new window using same browser instance and switch the control automatically
	  driver.switchTo().newWindow(WindowType.WINDOW);
	  driver.navigate().to("https://www.amazon.com/");
	  System.out.println("second tab Title :"+ driver.getTitle());
	  driver.close();
	  driver.switchTo().window(firstTabId);//switch to back first tab
	  System.out.println("switched control back to first tab and title :"+driver.getTitle());
	  driver.close();
	  
	  
	  
	  
  }
}
