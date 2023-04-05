package com.ice_hrm_automation.TestingExamples;

import org.testng.annotations.Test;

import ice_hrm.com.utility.Baseclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LoginTest extends Baseclass {
  
 String firstName="Ajay";
 String middleName="S";
 
 String lastName="Sawant";
 String empId="9399";
 String nationality="American";
 
 String year="1995";
 String mon="Nov";
 String day="6";
 
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("This is the launch the browser method from @BeforeMethod");
	  launchBrowser("edge");
	  driver.navigate().to("https:/cybersuccess.icehrm.com/");
	  enterText(By.id("username"), "admin");
	  enterText(By.id("password"), "2zuzfakn");
	  //click on login button
	  click(By.xpath("//button[contains(text(),'Log in')]"));//click on login button
	  click(By.xpath("//span[text()='Employees']"));//click on employees
	  click(By.xpath("//ul[@id=\"admin_Employees\"]/li[1]/a"));//click on  admin employee
  }
  @Test
  public void addEmp() throws InterruptedException 
  {
	  System.out.println("This createEmp method from @Test");
	 
	  //click on add button
	  click(By.xpath("//div[@id='EmployeeTable']/descendant::span[contains(text() ,' Add New')]"));
	  
	 
	  //enter emp id
	  enterText(By.xpath("//input[@id=\"employee_id\"]"), empId);
	  //enter first name
	  enterText(By.xpath("//input[@id='first_name']"),firstName);
	  //enter middle name
	  enterText(By.xpath("//input[@id='middle_name']"),middleName);
	  //enter last name 
	  enterText(By.xpath("//input[@id='last_name']"),lastName);
	 
//nationality add
	  
	/*  click(By.id("rc_select_0"));
		// click(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div[4]/div"));
		 //click(By.xpath("//span[@title=\"American\"]"));
		 click(By.xpath("//span[@class=\"ant-select-selection-item\"]"));
		*/
	  
 
WebElement element=driver.findElement(By.xpath("//input[@id='rc_select_0']"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].value='Indian'", element);

//birthdate

//click(By.xpath("//td[@title=\"2023-03-11\"]"));
//String year="1995";
//String mon="Feb";
//String day="28";
//int pastyear=LocalDateTime.now().getDayOfYear();
// driver.findElement(By.id("birthday")).click();
 click(By.id("birthday"));
/* while(true)
 {
	 String monthyear =driver.findElement(By.xpath("//button[@class=\"ant-picker-year-btn\"]")).getText();
	//button[@class=\"ant-picker-year-btn\"] year path
	 String month=driver.findElement(By.xpath("//button[@class=\"ant-picker-month-btn\"]")).getText();
        if(monthyear.equalsIgnoreCase(year)&& month.equals(mon))
	 
       break;
   else
   {
	 driver.findElement(By.xpath("//div[@class=\"ant-picker-header\"]/button[1]")).click();						 
 }
        
 }
 
 
 
 List<WebElement>days=driver.findElements(By.xpath("//td[contains(@class ,'nt-picker-cell-in-view')]/div"));
 //itrate through the day of month
 for(WebElement element1 :days)
 {
	  String currentday=element1.getText();
	  String today=String.valueOf(currentday);//convert current day int value into string
	  if(currentday.equals(day))
	  {
		  element1.click();
	  }
 
 }    */
 
 while(true)
 {
	 String monthyear =driver.findElement(By.xpath("//div[@class=\"ant-picker-header-view\"]/button[2]")).getText();
	//button[@class=\"ant-picker-year-btn\"] year path
	// String month=driver.findElement(By.xpath("//button[@class=\"ant-picker-month-btn\"]")).getText();
        if(monthyear.equalsIgnoreCase(year))
	 
       break;
   else
   {
	 driver.findElement(By.xpath("//div[@class=\"ant-picker-header\"]/button[1]")).click();						 
 }
        
 }
 while(true)
 {
	 String month=driver.findElement(By.xpath("//div[@class=\"ant-picker-header-view\"]/button[1]")).getText();
	 if(month.equalsIgnoreCase(mon))
		 break;
	 else
	 {
		 driver.findElement(By.xpath("//div[@class=\"ant-picker-header-view\"]/following::button[1]")).click();
	 }
 }
//div[@class="ant-picker-header-view"]/following::button/span
 
 
 List<WebElement>days=driver.findElements(By.xpath("//div[@class=\"ant-picker-cell-inner\"]/following::td[8]"));
 //itrate through the day of month
 for(WebElement element1 :days)
 {
	  String selectday=element1.getText();
	  String today=String.valueOf(selectday);//convert current day int value into string
	  if(selectday.equals(day))
	  {
		  element1.click();
	  }
 
 }       
  
 

	  

//gender-->
	  click(By.id("rc_select_1"));
	 click(By.xpath("//div[@label='Male']/div"));	
	 
//marital status-->	
	 click(By.id("rc_select_2"));
	 click(By.xpath("//div[@label=\"Single\"]/div"));
//ethnicity-->
	 
	 click(By.id("rc_select_3"));
	// click(By.xpath("//div[@label=\\\"Alaska Native\\\"]/div"));
	 
	 click(By.xpath("//div[contains(text(),'Native Hawaiian')]"));
	 		

//click on save
	 click(By.xpath("//span[text()=\"Save\"]"));
	  //String empsave=driver.findElement(By.xpath("//span[text()=\"Save\"]")).getText();
 //nationality
	 
	
  }




/* @Test
  public void verifyEmp()
  {
	  System.out.println("This method verify Emp from @Test");
  }
*/
  @AfterMethod
   public void tearDown()
   {
	  System.out.println("This method tear down from @AfterMethod");
   }
	  
} 
  

 
	


	
	



