package Automation.ice_hrm.com;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Set;
import java.lang.IndexOutOfBoundsException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImgs {
	public static void main(String[] args) throws  Exception {
		
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.navigate().to("https://www.amazon.in");
	    
	    List<WebElement> links=driver.findElements(By.tagName("img"));
	    
	    for(int i=0; i<=links.size();i++)
	    {
	    	 
	    	WebElement element =links.get(i);
	    	String url=element.getAttribute("src");
	    	if(url!=null && !url.equals("javascript: void(0)")) {
	  	    System.out.println(url);
	   try 
	   {
	    
		   
		      URL url11=new URL(url);
	         URLConnection ur=url11.openConnection();
	         HttpURLConnection link=(HttpURLConnection)ur;
	         link.connect();
	         int statusCode=link.getResponseCode();
	          if(statusCode>=300) {
	          System.out.println("Broken img :"+statusCode + "url :" + url);}
	          link.disconnect();
	   		}//catch(MalformedURLException me) {
	    
	   
	  catch(Exception e) {}
	    }
		}
	    driver.close();
		}
		
}	

	    	



