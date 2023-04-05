package Automation.ice_hrm.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClassExample {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		//"D:\\Eclipse Application\\Eclipse-workspace\\ice_hrm.com\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https:/cybersuccess.icehrm.com/");

        driver.manage().window().maximize();//application page max page size
  
        Actions actions=new Actions(driver);
        actions.contextClick(driver.findElement(By.xpath("//a[text()='Reset Password']"))).build().perform();
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        robot.mouseMove(999,500);
        
	}

}
