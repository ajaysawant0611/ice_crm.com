package Automation.ice_hrm.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args) throws Exception
		{
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			//"D:\\Eclipse Application\\Eclipse-workspace\\ice_hrm.com\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       Thread.sleep(2000);

	       driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	     
	       WebElement dra=driver.findElement(By.xpath("//div[@id=\"box6\"]"));
	         
	         WebElement dro=driver.findElement(By.xpath("//div[@id=\"box106\"]"));
	         Actions actions=new Actions(driver);
	         actions.dragAndDrop(dra, dro).build().perform();
	         
	         Thread.sleep(1000);
	         WebElement d=driver.findElement(By.xpath("//div[@id='box3']"));
	         WebElement dd=driver.findElement(By.xpath("//div[@id=\"box103\"]"));
	         Actions action=new Actions(driver);
	         action.dragAndDrop(d, dd).build().perform();
	         
	         //  
	         Thread.sleep(1000);
	         WebElement d1=driver.findElement(By.xpath("//div[@id=\"box4\"]"));
	         WebElement dd1=driver.findElement(By.xpath("//div[@id=\"box104\"]"));
	         Actions action1=new Actions(driver);
	         action1.dragAndDrop(d1, dd1).build().perform();
	         
	         //  
	         Thread.sleep(1000);
	         WebElement d2=driver.findElement(By.xpath("//div[@id=\"box1\"]"));
	         WebElement dd2=driver.findElement(By.xpath("//div[@id=\"box101\"]"));
	         Actions action2=new Actions(driver);
	         action2.dragAndDrop(d2, dd2).build().perform();
	         
	         //  
	         Thread.sleep(1000);
	         WebElement d3=driver.findElement(By.xpath("//div[@id=\"box5\"]"));
	         WebElement dd3=driver.findElement(By.xpath("//div[@id=\"box105\"]"));
	         Actions action3=new Actions(driver);
	         action3.dragAndDrop(d3, dd3).build().perform();
	         
	         //  
	         Thread.sleep(1000);
	         WebElement d4=driver.findElement(By.xpath("//div[@id=\"box2\"]"));
	         WebElement dd4=driver.findElement(By.xpath("//div[@id=\"box102\"]"));
	         Actions action4=new Actions(driver);
	         action4.dragAndDrop(d4,dd4).build().perform();
	         
	         //  
	         Thread.sleep(1000);
	         WebElement d5=driver.findElement(By.xpath("//div[@id=\"box7\"]"));
	         WebElement dd5=driver.findElement(By.xpath("//div[@id=\"box107\"]"));
	         Actions action5=new Actions(driver);
	         action5.dragAndDrop(d5, dd5).build().perform();
	         
	         
	         
	}

}
