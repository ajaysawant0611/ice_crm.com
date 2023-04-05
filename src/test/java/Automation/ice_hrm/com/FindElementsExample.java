package Automation.ice_hrm.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementsExample {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chromedriver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	WebElement searchDropDown=driver.findElement(By.id("searchDropdownBox"));
	Select select=new Select(searchDropDown);
	select.selectByIndex(16);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("washingmachine");
	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(2000);
	int totalresult;
	//get the all search result 
	List<WebElement>washingMachineResult=driver.findElements(By.xpath("//div[starts-with(@data-cel-widget,'search_result_')]/descendant::h2//span"));
	//get the total size of the mobile and result(array)
	totalresult=washingMachineResult.size();
	System.out.println("Total Result: "+ totalresult ); // get all total result in mobiles
	
	  for(int i=3; i <=totalresult; i++)//contenue cycle to end of the condition
	  {
	    try
	     {
		     String namexpath="//div[starts-with(@data-cel-widget,'search_result_')][" +i+ "]/descendant::h2//span";
		     System.out.println(namexpath);
		     String pricexpath="//div[starts-with(@data-cel-widget,'search_result_')][" +i+ "]/descendant::span[@class=\"a-price-whole\"]";
		        
		     String machinename=driver.findElement(By.xpath(namexpath)).getText();
		     //find the name of washing machine available 
		     String machineprice=driver.findElement(By.xpath(pricexpath)).getText().replace(",","");
		    //find the machine price in all available machines
		    
		     int price = Integer.parseInt(machineprice);  //integer paseInt()method is convert string data to integer type
		      // if(price>=15000)  //if condition -is all diplay machine availlabe  above 15000 cost 
		    			   
		    	   System.out.println("MachinePrice: "+ price + "Name : "+ machinename);
		           //print the all machine name and print the machine price only  greater than 15000 rs. 
	       }
	         catch (NoSuchElementException e)  
	       {
	        	 //it is a handle exception in run this program for eg run time advertisement in anywhere this is handle and continue loop after end of the program
	         //System.out.println(e.getMessage());  
	        } 	
	      }	
        }
	  }


