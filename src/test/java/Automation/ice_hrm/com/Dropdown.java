package Automation.ice_hrm.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException
	{

		
		
		System.setProperty("webdriver.chromedriver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(3000);
		
		WebElement dropdown=driver.findElement(By.id("multiselect1"));
		Select select=new Select(dropdown);
		List<WebElement>dropDownValues=select.getOptions();
		 for(int i=0; i<dropDownValues.size();i++)
		 {
			 WebElement element=dropDownValues.get(i);
			 String dropDownText=element.getText();
			 System.out.println(dropDownText);
		 }
		 Thread.sleep(7000);
		 WebElement multiSelect=driver.findElement(By.id("multiselect1"));
			Select select1=new Select(multiSelect);
			
			select.selectByVisibleText("Swift");
			select.selectByVisibleText("Audi");
			select.selectByVisibleText("Volvo");
			
			
			
			List<WebElement>dropDownValues1=select1.getAllSelectedOptions();
			
			 for(int i=0; i<dropDownValues1.size();i++)
			 {
				 WebElement element=dropDownValues.get(i);
				 String dropDownText1=element.getAttribute("element");
				 System.out.println(dropDownText1);
			 }
	//	JavascriptExecutor js=(JavascriptExecutor)driver;
		//  js.executeScript("window.ScrollBy(0,2000)","");
	
	}

}
