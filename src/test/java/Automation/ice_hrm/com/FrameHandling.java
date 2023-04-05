package Automation.ice_hrm.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
   public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.navigate().to("https://omayo.blogspot.com/");
	   String input="selenium"; //text to need to enterd in search box
	   driver.switchTo().frame(driver.findElement(By.id("")));//locate the iframe and switch the control
	   driver.findElement(By.id("b-wuery")).sendKeys(input);//enter the selenium text in seaech box
	   driver.findElement(By.id("b-query-icon")).click();
	   driver.switchTo().defaultContent();//switch to control back to default (In The HTML)
	   String output=driver.findElement(By.xpath("//div[@class='status-msg-body']/b")).getText();
	   if(output.equals(input)) {
		   System.out.println("successfully able to verify selenium text in the search result");
		   
	   }
	   else
	   {
		   System.out.println("unable to verify selenium text in the search result");
	   }
	   
   }
}
