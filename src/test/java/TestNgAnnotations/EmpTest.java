package TestNgAnnotations;



import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ice_hrm.com.utility.Baseclass;
import ice_hrm.com.utility.PropertyHandling;

public class EmpTest extends Baseclass {
	PropertyHandling property;
	@BeforeClass
	public void before()
	{
		property=new PropertyHandling();
		
	}
  @Test
  public void ligin() {
	  String url=property.getProperty("orangeHrmUrl");
	  launchBrowser("edge");
	  driver.navigate().to(url);
	String username=property.getProperty("orangeHrmUsername");
	enterText(By.name("username"),username);
	String password=property.getProperty("orangeHrmPassword");
	enterText(By.name("password"),password);
	click(By.xpath("//button[@type='submit']"));
  }
 


}