package Automation.ice_hrm.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class social {
	

	public static void main(String[] args) throws Exception {
		
	
	 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     
     driver.navigate().to("https://www.amazon.in/");
     //  Thread.sleep(1000);
     String dashboardText=driver.findElement(By.xpath("//a[text()='Sell']")).getText();
       
		if(dashboardText.equals("Sell"))
		{
			System.out.println("successfully landed on the homepage of an application");
		}
		else
		{
			throw new Exception("failed to logine to application");
		}
	
       Thread.sleep(2000);
   
     WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
     
     Select select=new Select(dropdown);
     select.selectByIndex(16);
     Thread.sleep(1000);
  

     WebElement dropdown1= driver.findElement(By.xpath("//input[@id=\'twotabsearchtextbox\']"));
     dropdown1.sendKeys("dell laptop");
    
	if(dropdown1.isEnabled())
		{
			System.out.println("successfully search dell laptop");
		}
		else
		{
			System.out.println("not search dell laptop");
		}
	
        
	Thread.sleep(2000);
     
    WebElement dropdown3= driver.findElement(By.xpath("//div[@aria-label='dell laptop']"));
     dropdown3.click();
     Thread.sleep(5000);
     String Text=driver.findElement(By.xpath("//a[text()='Sell']")).getText();
		if(Text.equals("Sell"))
		{
			System.out.println("successfully landed on the electronic padge");
		}
		else
		{
			throw new Exception("failed to opeen page");
		}
     
    String homeText=driver.findElement(By.xpath("//div[@class=\"sg-col-inner\"]/child::div")).getText();
    
	 System.out.println(homeText);
	
	 
	  Thread.sleep(5000);
	  
    boolean result=driver.findElement(By.xpath("//span[text()=\"Delivery Day\"]")).isEnabled();
	 
	System.out.println(result);
	    
	
	
	 String homeText1=driver.findElement(By.xpath("//span[text()=\"Delivery Day\"]")).getText();
	    //System.out.println(homeText1);
	 if(homeText1.equals("Delivery Day"))
	 {
		 System.out.println("Test case is passed");
	 }	 
	 else
    {
	    throw new Exception("Test case is failed");
	  }
	}
}
	
	
