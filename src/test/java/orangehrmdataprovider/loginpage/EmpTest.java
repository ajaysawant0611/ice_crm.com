package orangehrmdataprovider.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EmpTest {
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
		driver.findElement(By.xpath("//li[@class=\"oxd-main-menu-item-wrapper\"][1]")).click();
		//click on admin 
		//click on add
		driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-plus oxd-button-icon\"]")).click();
		//click on add button
		driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys("Tom");
		//emp name		
		driver.findElement(By.xpath("//div[@class=\"oxd-input-group__label-wrapper\"]/following::input[1]")).sendKeys("Jerry");
		

}
}