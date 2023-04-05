package TestNgAnnotations;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Parameters;

import ice_hrm.com.utility.Baseclass;

import org.openqa.selenium.By;
import org.testng.annotations.*;

public class annitation2 extends Baseclass{
	@Parameters({"username","password"})
	  @Test
	  public void login(String username,String password) {
		 enterText(By.name("username"), "Admin");
		  enterText(By.name("password"), "admin123");
		  
		   System.out.println("This is test1 for annotation test1 class");
			System.out.println("this is test1 for annotationtest1 cllass and username is:" +username + "password is :"+ password);
	  }
		@Parameters({"browser","URLOHRM"})
		@BeforeClass
		public void beforeclass1(String browser, String url) {
		launchBrowser("chrome");
		driver.get(url);
			System.out.println("annotationtest before class");
		System.out.println("this is sample before class :" + url);
			
	}
		@AfterClass
		public void afterclass()
		{
			driver.close();
		
		}
		
	}

