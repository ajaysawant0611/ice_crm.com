package Automation.ice_hrm.com;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowHandling {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver ", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.amazon.in/");
	
		
		//Thread.sleep(1000);
		
       String parentWindowId=driver.getWindowHandle(); //return the id of current window
       
        System.out.println("first tab Id" + parentWindowId);
        
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@id='navSwmHoliday']/a")).click();        
       
        Set<String> allIds=driver.getWindowHandles();
        
        System.out.println("print all window ids");
     
        for(String id: allIds)
        {
        	 if(!id.equals(parentWindowId))
        	 {
        	System.out.println("second tab id  :"+id);
      
             driver.switchTo().window(id);
             System.out.println("controll switch to first tab to secont tab");
             String secondTabTitle=driver.getTitle();
             System.out.println("second tab title: "+ secondTabTitle);
            
             List<WebElement> links=driver.findElements(By.tagName("a"));
             
             for(int i=0; i<=links.size(); i++)
             {
             	 
             	WebElement element =links.get(i);
             	String url=element.getAttribute("href");
             	if(url!=null && !url.equals("javascript: void(0)\r\n")) {
           	    System.out.println(url);  }             
             }
             
             driver.close();
        	 }
	      }
        driver.switchTo().window(parentWindowId);
        String firstTabTitle=driver.getTitle();
        System.out.println("Control switched from second tab to first tab");
        System.out.println("First Tab Title : "+ firstTabTitle);
        
	
	

      //  driver.close();   

     //   Thread.sleep(2000); //print all link start --->
    //   driver.navigate().back();
    

      
      
        
    driver.quit();
    }
    }
	
	


