package com.ice_hrm_automation.TestingExamples;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ice_hrm.com.utility.Baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterClass;

public class AddEmpOrangeHrm extends Baseclass{
	String firstName="Dom";
	 String middleName="S";
	 
	 String lastName="Torreto";
	 String empId="9399";
	 String nickname="Domnic";
	 
  @BeforeClass
  public void beforeClass() throws Exception ,NoSuchElementException{
	  
	  
	  System.out.println("This is the launch the browser method from @BeforeMethod");
	  launchBrowser("chrome");
	  driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	  enterText(By.name("username"), "Admin");
	  enterText(By.name("password"), "admin123");
	  //click on login button
	  click(By.xpath("//button[@type='submit']"));//click on login button
	  
	click(By.xpath("//span[text()='PIM']"));
	 // click(By.xpath(""));//click on employees
	  //click(By.xpath(""));//click on  admin employee
	  
	
	// driver.findElement(By.xpath("//button[@type='submit']"));    //div[@id="app"]/div[1]/div[1]/header/div[1]/div[1]/span/h6
	
  }
 @Test
public void test() {
	  System.out.println("This is a Test Method");
	  
	 click(By.xpath("//div[@class=\"oxd-topbar-body\"]/descendant::a[2]"));
	  
		 
	  //enter emp id
	  enterText(By.xpath("//label[text()='Employee Id']/following::input[1]"), empId);
	  //enter first name
	  enterText(By.xpath("//input[@name='firstName']"),firstName);
	  //enter middle name
	  enterText(By.name("middleName"),middleName);
	  //enter last name 
	  enterText(By.name("lastName"),lastName);
	 
	click(By.xpath("//button[@type=\"submit\"]"));
	
	//enter nickname
	//enterText(By.xpath("//label[@class=\"oxd-label\"]/following::div/input[1]"),nickname);
	//click(By.xpath("//button[@type=\"submit\"][1]"));
}
  @AfterClass
  public void afterClass() {
	  System.out.println("This is a AfterClass Method");
  }

}
