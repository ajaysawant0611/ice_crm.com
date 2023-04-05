package Automation.ice_hrm.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		     WebDriver driver= new ChromeDriver();
		     driver.get("https:/cybersuccess.icehrm.com/");
		    // driver.navigate().to("https://www.amazon.in/");
		     JavascriptExecutor js=(JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); //scroll bottom
		  //   WebElement usernameaText=driver.findElement(By.xpath("//input[@id='username']/preceding::label"));
		  //   Object value=js.executeScript("return document.getElementById('placeholder').value",usernameaText);
		 //   String text=(String)value;//convert object into string
		  //   System.out.println(text);//print the string value
		  
		     
		     
		     WebElement username=driver.findElement(By.id("username"));
		     js.executeScript("arguments[0].value='admin'",username);
		     WebElement password=driver.findElement(By.id("password"));
		     js.executeScript("arguments[0].value='2zuzfakn'",password);
		     
		 	WebElement LoginButton=driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		 	 js.executeScript("arguments[0].click();",LoginButton);
	
		     
		     
		     
		     
		     
	
	
	
	
	
	}


		
	}


