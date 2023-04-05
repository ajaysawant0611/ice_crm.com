package com.ice_hrm_automation.TestingExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ice_hrm.com.utility.Baseclass;

public class IceHrmTest extends Baseclass {
	private static final String WebElement = null;




	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class method");
		 launchBrowser("chrom");
		  driver.navigate().to("https:/cybersuccess.icehrm.com/");
		
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class");
		driver.close();
	}
	
  @Test
  public void verfyLoginWirhValidCredential() {
	  System.out.println("verfy login in valid credential");
	  enterText(By.id("username"), "admin");
	  enterText(By.id("password"), "2zuzfakn");
	  //click on login button
	  click(By.xpath("//button[contains(text(),'Log in')]"));//click on login button
	  
	  
	 	String homeText=driver.findElement(By.xpath("//header[@id='delegationDiv']/a")).getText();

       	System.out.println(homeText);
 
       	if(homeText.equals("Home"))
       	{
       		System.out.println("Pass :Login The Application");
       	}	 
       	else
       	{
       		System.out.println("Failed : To login to Aplication");
       	}
       	click(By.xpath("//li[@class=\"dropdown user user-menu\"]/a"));
	    click(By.xpath("//div[@class=\"pull-right\"]/a"));
  }
    @Test
    public void verifyLoginWithInvalidUsername()
    {
    	System.out.println("verify login with Invalid username and valid password");
    	  enterText(By.id("username"), "admi");
    	  enterText(By.id("password"), "2zuzfakn");
    	  //click on login button
    	  click(By.xpath("//button[contains(text(),'Log in')]"));//click on login button
    	  String errorMsg=driver.findElement(By.xpath("//div[@class=\"alert alert-danger\"]")).getText();
    	   if(errorMsg.equals("Login failed"))
    	   {
    		   System.out.println("Pass : The Test Case for invalid username and valid password");
    	   }
    	   else
    	   {
    		   System.out.println("Faill : The Test Case for invalid username and valid password");
    	   }
    	  
    	 }
   @Test
   public void verifyLoginWithInvalidpassword()
   {
	   System.out.println("verify Ligin with Invalid passoword and valid usename Test Case");
	  
 	  enterText(By.id("username"), "admin");
 	  enterText(By.id("password"), "2zuzfak");
 	  //click on login button
 	  click(By.xpath("//button[contains(text(),'Log in')]"));//click on login button
 	  String errorMsg=driver.findElement(By.xpath("//div[@class=\"alert alert-danger\"]")).getText();
 	   if(errorMsg.equals("Login failed"))
 	   {
 		   System.out.println("pass : The Test Case for invalid username and valid password");
 	   }
 	   else
 	   {
 		   System.out.println("Faill : The Test Case for invalid username and valid password");
 	   }
   }
   @Test
   public void verifyLoginwihtbothInvalidusenameandpass()
   {
	   System.out.println("verify Both Invalid username and Invalid password Test Case");
	  
 	  enterText(By.id("username"), "xyz");
 	  enterText(By.id("password"), "cyber12");
 	  //click on login button
 	  click(By.xpath("//button[contains(text(),'Log in')]"));//click on login button
 	  String errorMsg=driver.findElement(By.xpath("//div[@class=\"alert alert-danger\"]")).getText();
 	   if(errorMsg.equals("Login failed"))
 	   {
 		   System.out.println("pass : The Test Case For Invalid username and Invalid password");
 	   }
 	   else
 	   {
 		   System.out.println("Faill : The Test Case for Invalid username and Invalid password");
 	   }
   }
   
   @Test
   public void verifyLoginwihtwithoutusernemeandpass()
   {
	   System.out.println("verify Both  Blank  username and password Test Case");
	  
 	  enterText(By.id("username"), "");
 	  enterText(By.id("password"), "");
 	  //click on login button
 	  click(By.xpath("//button[contains(text(),'Log in')]"));//click on login button
 	  String errorMsg=driver.findElement(By.xpath("//div[@class=\"alert alert-danger\"]")).getText();
 	   if(errorMsg.equals("Login failed"))
 	   {
 		   System.out.println("pass : The Test Case for Blank username and password");
 	   }
 	   else
 	   {
 		   System.out.println("Faill : The Test Case for Blank username and  password");
 	   }
   }
  
 
   
   
   @Test
   public void verifySocialMediaLnklinkdn()
   {
	   System.out.println("verify social media link page open or not");
	 //h1[@class="main__subtitle main__subtitle--is-cold-join  main__subtitle--mod-A"]
	   click(By.xpath("//div[@class=\"pt-5 px-3\"]/a[1]"));
	   Actions actions=new Actions(driver);
	   actions.click();
	//  click(By.xpath("//*[@id=\"organization_guest_contextual-sign-in\"]/div/section/button"));
	   
	/*   String errorMsgs=driver.findElement(By.xpath("//span[@class=\"line-clamp-2\"]")).getText();
 	   if(errorMsgs.equals("Powerful But A Simple Way to Manage Your Company and People"))
 	   {
 		   System.out.println("pass : Social Media link Linkdn open successfully");
 	   }
 	   else
 	   {
 		   System.out.println("Faill : Social Media link Linkdn  not open successfully");
 	   }
   }*/
   }

	


	
}

  



