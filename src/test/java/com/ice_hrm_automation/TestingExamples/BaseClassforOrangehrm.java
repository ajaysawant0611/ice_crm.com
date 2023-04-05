package com.ice_hrm_automation.TestingExamples;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BaseClassforOrangehrm {
	 public WebDriver driver;
	  
	  public void launchBrowser(String browser)
	  {
		  switch(browser)
		  {
		  case "chrome":
			  ChromeOptions co= new ChromeOptions();
			  co.addArguments("--remote-allow-origins=*");
			  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			  driver = new ChromeDriver(co);
			break;
		  case "edge":
			  System.setProperty("webdriver.edge.driver","msedgedriver.exe");
			  driver =new EdgeDriver();
			  break;
		 default:
			 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			 driver =new ChromeDriver();
		  }
	  }
	  //this method will perform sendKeys operations provided location(element)
	  public void enterText(By by,String text) {
		try {
			//wait till the element is available for click operation
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfElementLocated(by));
			//perform click
			driver.findElement(by).sendKeys(text);
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
	  }
	  //this method perform click operation on the given locator
	  public void click(By by)
	  {
		  try {
			  //wait till the element is available for click operation
			  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			  wait.until(ExpectedConditions.elementToBeClickable(by));
			  //perform click
			  driver.findElement(by).click();
			  
		  }
		  catch(Exception e){
			  e.printStackTrace();
			  
		  }
		  
		  
			   
		  
		  
			  
		  
	  }


		 }
	 

