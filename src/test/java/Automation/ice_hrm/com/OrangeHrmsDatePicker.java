package Automation.ice_hrm.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmsDatePicker {
      
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
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
	

	driver.findElement(By.xpath("//li[@class='oxd-main-menu-item-wrapper'][3]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='yyyy-mm-dd'][1]")).click();
	sendkeys(2023-02-02);
}

	private static void sendkeys(int i) {
		// TODO Auto-generated method stub
		
	}
}