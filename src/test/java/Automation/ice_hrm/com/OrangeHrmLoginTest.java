package Automation.ice_hrm.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import ice_hrm.com.utility.Baseclass;

public class OrangeHrmLoginTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		  ChromeOptions co= new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver  driver = new ChromeDriver(co);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(5000);
		String dashboardText=driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		if(dashboardText.equals("Dashboard"))
		{
			System.out.println("successfully landed on the homepage of an application");
		}
		else
		{
			throw new Exception("failed to logine to application");
		}
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(4000);
		WebElement searchButton = driver.findElement(By.xpath("//button[@type='reset']/following-sibling::button"));
		if(searchButton.isDisplayed())
		{System.out.println("successfully able to navigate on PIM module");
		
		}
		else
		{
			System.out.println("unable to navigate on Pim module");
		}
	/*	WebElement selectAllcheckBox = driver.findElement(By.xpath("//di[@role='rowgroup'][1]/descendant::i[1]"));
		selectAllcheckBox.click();
		Thread.sleep(2000);
		if(selectAllcheckBox.isSelected())
		{
			System.out.println("select all check box is selcted");
		}
		else
		{
			System.out.println("select all checkbox is not selected");
			
		}  */
		WebElement selectoneCheckbox=driver.findElement(By.xpath("//input[@type='checkbox' and @value='0']/following-sibling::span/i"));
		selectoneCheckbox.click();
		
		if(selectoneCheckbox.isEnabled())
		{
			 System.out.println("select one check box");
		}
		else{
			System.out.println("no select check box");
		}
		boolean result=driver.findElement(By.xpath("//input[@type='checkbox' and @value='0']/following-sibling::span/i")).isEnabled();
		 
		System.out.println(result);
		

	}

	//private static void click() {
		// TODO Auto-generated method stub
		
	}


