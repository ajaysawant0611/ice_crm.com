package Automation.ice_hrm.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		//"D:\\Eclipse Application\\Eclipse-workspace\\ice_hrm.com\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       Thread.sleep(2000);
       Actions actions=new Actions(driver);
       driver.get("http://realstateautomation.agilecrm.com");
       driver.findElement(By.name("email")).sendKeys("automation@yopmail.com");
       driver.findElement(By.name("password")).sendKeys("WGHEZSBV");
       driver.findElement(By.xpath("//input[@id=\"subdomain\"]")).sendKeys("cybersucces");
       driver.findElement(By.xpath("//input[@placeholder=\"Full Name\"]")).sendKeys("@agilecrmssdfg");
       actions.contextClick(driver.findElement(By.xpath("//span[@id=\"recaptcha-anchor\"]"))).build().perform();
       
       Thread.sleep(5000);
       //input[@placeholder="Full Name"]
       driver.findElement(By.xpath("//input[@id=\"submit-test-form\"]")).click();
       Thread.sleep(2000);

     
	}

}
