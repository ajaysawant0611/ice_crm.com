package ice_hrm.com.utility;


import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.model.Log;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Baseclass {
	public static WebDriver driver;
	public ExtentTest log;
    
	public void launchBrowser(String browser) {
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			// System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver = new ChromeDriver(setChromeOptions());
			break;
		case "edge":
			// System.setProperty("webdriver.edge.driver","msedgedriver.exe");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver(setEdgeOptions());
			break;
		default:
			WebDriverManager.chromedriver().setup();
			// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver(setChromeOptions());
		}
	}

	// this method will perform sendKeys operations provided location(element)
	public void enterText(By by, String text) {
		try {
			// wait till the element is available for click operation
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfElementLocated(by));
			// perform click
			driver.findElement(by).sendKeys(text);
	
		} catch (Exception e) {
			e.printStackTrace();

		}
		System.out.println("inside the main");
	}
  
	// this method perform click operation on the given locator
	public void click(By by) {
		try {
			// wait till the element is available for click operation
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(by));
			 
			// perform click
			driver.findElement(by).click();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	public void click(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	    
	}
	
	
	
	
	
	public ChromeOptions setChromeOptions() {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("start-maximized");
        option.addArguments("--remote-allow-origins=*");
        option.addArguments("incognito");
        option.setHeadless(false);
        option.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-clocking"));
        Map<String, String> prefs = new HashMap<>();
        prefs.put("download.default.directory", "c:/newfolder/download/");
        option.setExperimentalOption("prefs", prefs);
        option.setAcceptInsecureCerts(true);
        return option;
	}
	public EdgeOptions setEdgeOptions() {
		 EdgeOptions option = new EdgeOptions();
	        option.addArguments("start-maximized");
	        option.addArguments("--remote-allow-origins=*");
	        option.addArguments("incognito");
	        option.setHeadless(false);
	        option.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-clocking"));
	        Map<String, String> prefs = new HashMap<>();
	        prefs.put("download.default.directory", "c:/newfolder/download/");
	        option.setExperimentalOption("prefs", prefs);
	        option.setAcceptInsecureCerts(true);
		return option;
		
	}

		
	
	
	
	
	public void  waitUntilElementIsClickable(By by) {
		
	}

}
