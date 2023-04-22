package Automation.ice_hrm.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class orangeAdminModule {
	public static void main(String [] args) throws Exception {
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
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"oxd-input-group__label-wrapper\"]/following::div[1]")).sendKeys("Fiona Grace");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class=\"oxd-autocomplete-wrapper\"]/div")).sendKeys("Fiona Grace");
	}
}
