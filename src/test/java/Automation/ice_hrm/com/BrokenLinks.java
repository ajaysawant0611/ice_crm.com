package Automation.ice_hrm.com;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrokenLinks {


	public static void main(String[] args) throws Exception {
	
	// TODO Auto-generated method stub
    System.setProperty("webdriver.edge.driver","msedgedriver.exe");
  WebDriver driver=new EdgeDriver(); 
    //  ChromeDriver driver=new ChromeDriver();
    driver.navigate().to("https://www.amazon.in");
    
    List<WebElement> links=driver.findElements(By.tagName("a"));
    
    for(int i=0; i<=links.size();i++)
    {
    	 
    	WebElement element =links.get(i);
    	String url=element.getAttribute("href");
    	if(url!=null && !url.equals("javascript: void(0)\r\n")) {
  	 //   System.out.println(url);
   try 
   {
    
	   
	      URL url11=new URL(url);
         URLConnection ur=url11.openConnection();
         HttpURLConnection link=(HttpURLConnection)ur;
         link.connect();
         int statusCode=link.getResponseCode();
          if(statusCode>=300) {
          System.out.println(statusCode);}
          link.disconnect();
   		}//catch(MalformedURLException me) {
   
   
    catch(Exception e) {}
    }
	}
    driver.close();
	}
}
	

    	
