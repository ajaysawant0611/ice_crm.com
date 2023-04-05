package TestNgAnnotations;

import org.openqa.selenium.By;   //TestNgAnnotations.annotations
import org.testng.annotations.*;

import ice_hrm.com.utility.Baseclass;

public class annotations extends Baseclass {
	@Parameters({"username","password"})
  @Test
  public void login(String username,String password) {
		 enterText(By.id("username"), "admin");
		  enterText(By.id("password"), "2zuzfakn");
		 
		System.out.println("This is test1 for annotation test1 class");
		System.out.println("this is test1 for annotationtest1 cllass and username is:  " + username + "password is :  "+ password);
  }
	@Parameters({"browser","URL"})
	@BeforeClass
	public void beforeclass(String browser, String url) {
	launchBrowser("chrome");
	driver.get(url);
	System.out.println("annotationtest before class");
		System.out.println("this is sample before class ;" + url);
	}
	@AfterClass
	public void afterclass()
	{
		driver.close();
	
	}
	
}
