package Automation.ice_hrm.com;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

//import java.util.NoSuchElementException;
import org.openqa.selenium.NoSuchElementException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class DropDownOpration {
	public void fluentWait(WebDriver driver, By by) {
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
				wait.until((d)-> {
				
					System.out.println("veryfing the element availabe or not");
					return d.findElement(by);

				});
	}	
	   
				
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chromedriver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	DropDownOpration obj=new DropDownOpration();
	obj.fluentWait(driver,By.id("searchDropdownBox"));
//	Thread.sleep(3000);
	WebElement searchDropDown=driver.findElement(By.id("searchDropdownBox"));
	Select select=new Select(searchDropDown);
	select.selectByIndex(16);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(2000);
	int totalresult;
	//get the all search result 
	List<WebElement>mobileresult=driver.findElements(By.xpath("//div[starts-with(@data-cel-widget,'search_result_')]/descendant::h2//span"));
	//get the total size of the mobile and result(array)
	totalresult=mobileresult.size();
	System.out.println("Total Result: "+ totalresult ); // get all total result in mobiles
	
	  for(int i=3; i <=totalresult; i++)
	  {
	    try
	     {
		     String namexpath="//div[starts-with(@data-cel-widget,'search_result_')][" +i+ "]/descendant::h2//span";
		     System.out.println(namexpath);
		     String pricexpath="//div[starts-with(@data-cel-widget,'search_result_')][" +i+ "]/descendant::span[@class=\"a-price-whole\"]";
		  //   System.out.println(pricexpath);
		     
		     String mobilename=driver.findElement(By.xpath(namexpath)).getText();
		     String mobileprice=driver.findElement(By.xpath(pricexpath)).getText();
		     System.out.println("Price: "+ mobileprice + "Name : "+ mobilename);
	     }
	    catch (NoSuchElementException e)
	    {
	         //System.out.println(e.getMessage());  
	     } 
	  
	  }	
}
}
//div[starts-with(@data-cel-widget,'search_result_')]/descendant::h2//span  //all path by result
//div[starts-with(@data-cel-widget,'search_result_')]/descendant::span[@class="a-price-whole"]  price x path