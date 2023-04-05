package Automation.ice_hrm.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Connection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		//"D:\\Eclipse Application\\Eclipse-workspace\\ice_hrm.com\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       Thread.sleep(2000);

       driver.get("https:amazon.in.com/");

//driver.manage().window().maximize();//application page max page size
      /*  Thread.sleep(5000);

       	WebElement username=driver.findElement(By.id("username"));
       	username.sendKeys("admin");
       	WebElement password=driver.findElement(By.id("password"));
       	password.sendKeys("2zuzfakn");
       	WebElement LoginButton=driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
       	LoginButton.click();

*/
	}

}
