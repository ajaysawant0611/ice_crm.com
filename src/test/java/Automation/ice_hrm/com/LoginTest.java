package Automation.ice_hrm.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LoginTest {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				//"D:\\Eclipse Application\\Eclipse-workspace\\ice_hrm.com\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:/cybersuccess.icehrm.com/");
		
		driver.manage().window().maximize();//application page max page size
		Thread.sleep(2000);
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("admin");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("2zuzfakn");
		WebElement LoginButton=driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		LoginButton.click();
		
		
		String homeText=driver.findElement(By.xpath("//header[@id='delegationDiv']/a")).getText();
		
		 System.out.println(homeText);
		 
		 if(homeText.equals("Home"))
		 {
			 System.out.println("Test case is passed");
		 }	 
		 else
	      {
		    System.out.println("failed to login to Aplication");
		  }
		Thread.sleep(2000);
		 WebElement icehrm= driver.findElement(By.xpath("//i[@class=\"caret\"]"));
		  icehrm.click();
		  WebElement signout= driver.findElement(By.xpath("//div[@class='pull-right']/a"));
		  signout.click();
		  String homeText1=driver.findElement( By.xpath("//div[@class=\"pb-9\"]/h3")).getText();
		  
		  System.out.println(homeText1);
		  if(homeText1.equals("IceHrm Login"))
			 {
				 System.out.println("successfully signout");
			 }	 
			 else
		      {
			    System.out.println("failed to signout");
			  }
		
		  WebElement username1=driver.findElement(By.id("username"));
			username1.sendKeys("admi");
			WebElement password1=driver.findElement(By.id("password"));
			password1.sendKeys("2zuzfakn");
			WebElement LoginButton1=driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
			LoginButton1.click(); 
			  if(homeText.equals("Home"))
			  {
				  System.out.println("Testcase is passed");
			  }
			  else
			  {
				  System.out.println("failed to login to application");
			  }
		// Thread.sleep(2000);
		 boolean test=driver.findElement(By.xpath("//div[@class='alert alert-danger']")).isEnabled();
	    System.out.println(test);
		 
	
		 
	}	
		
	}


