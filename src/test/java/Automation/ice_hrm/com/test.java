package Automation.ice_hrm.com;

import java.time.LocalDateTime;                    //pending assignment in date picker
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		//"D:\\Eclipse Application\\Eclipse-workspace\\ice_hrm.com\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       Thread.sleep(2000);

       driver.get("https:/cybersuccess.icehrm.com/");

//driver.manage().window().maximize();//application page max page size
        Thread.sleep(5000);

       	WebElement username=driver.findElement(By.id("username"));
       	username.sendKeys("admin");
       	WebElement password=driver.findElement(By.id("password"));
       	password.sendKeys("2zuzfakn");
       	WebElement LoginButton=driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
       	LoginButton.click();


       	String homeText=driver.findElement(By.xpath("//header[@id='delegationDiv']/a")).getText();

       	System.out.println(homeText);
 
       	if(homeText.equals("Home"))
       	{
       		System.out.println("Test case is passed");
       	}	 
       	else
       	{
       		System.out.println("failed to login to Aplication");
       	}
	
       	WebElement employee=driver.findElement(By.xpath("//li[@ref=\"admin_Employees\"]/a"));
       	employee.click();
 
       	WebElement mployee=driver.findElement(By.xpath("//li[@class=\"treeview active\"]/following::ul/li[1]"));
       	mployee.click();
       	//open employee page
       	Thread.sleep(5000);

 //-->fill in the details 
             WebElement addnew=driver.findElement(By.xpath("//div[@class='ant-space-item']/button[1]"));
             addnew.click(); 
 
             WebElement empId=driver.findElement(By.id("employee_id"));
             empId.sendKeys("9399");
 
             WebElement empname=driver.findElement(By.id("first_name"));
             empname.sendKeys("James");
		
		     WebElement middlename=driver.findElement(By.id("middle_name"));
		     middlename.sendKeys("Jason");
			
			 WebElement emplastname=driver.findElement(By.id("last_name"));
			 emplastname.sendKeys("Gosling");
					Thread.sleep(1000);
					
					
				Thread.sleep(3000);
					
//nationality--->					
				   driver.findElement(By.id("rc_select_0")).click();
				 
					Thread.sleep(1000);
					 
					WebElement selectnationality=driver.findElement(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div[4]/div"));
					selectnationality.click();                                //div[@label="Indian"]/div   //div[@class='rc-virtual-list-holder-inner']/div[4]/div"
										
					Thread.sleep(4000);
		
//birth date--->	
			/*		 int currentDay=LocalDateTime.now().getDayOfMonth();
					 //LocalDateTime.now().getDayOfweek();
					 //LocalDateTime.now().getMonthValue();
					 //LocalDateTime.now().getDayOfMonth()
					 driver.findElement(By.id("birthday")).click();
					 //click on calleder
					 //get all current month date
					 List<WebElement>days=driver.findElements(By.xpath("//td[contains(@class ,'nt-picker-cell-in-view')]/div"));
					 //itrate through the day of month
					 for(WebElement element:days)
					 {
						  String day=element.getText();
						  String today=String.valueOf(currentDay);//convert current day int value into string
						  if(day.equals(today))
						  {
							  element.click();
						  }
					 }*/
				
					String year="1995";
					String mon="Feb";
				    String day="28";
					//int pastyear=LocalDateTime.now().getDayOfYear();
					 driver.findElement(By.id("birthday")).click();
					 while(true)
					 {
						 String monthyear =driver.findElement(By.xpath("//button[@class=\"ant-picker-year-btn\"]")).getText();
						//button[@class=\"ant-picker-year-btn\"] year path
						 String month=driver.findElement(By.xpath("//button[@class='ant-picker-month-btn']")).getText();
					 if(monthyear.equalsIgnoreCase(year)&&month.equals(mon))
					 break;
					 else
					 {
						 driver.findElement(By.xpath("//div[@class=\"ant-picker-header\"]/button[1]")).click();						 
					 }
					 }					
					 List<WebElement>days=driver.findElements(By.xpath("//td[contains(@class ,'nt-picker-cell-in-view')]/div"));
					 //itrate through the day of month
					 for(WebElement element:days)
					 {
						  String currentday=element.getText();
						  String today=String.valueOf(currentday);//convert current day int value into string
						  if(currentday.equals(day))
						  {
							  element.click();
						  }
					 
					 }
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
				/*	 
					 List<WebElement> currentday=driver.findElements(By.xpath("//td[contains(@class,'ant-picker-cell ant-picker-cell-in-view')]"));
					 for(WebElement days=currentday)
					 {
						 WebElement da=currentday.get(days);
						 
					 }
					  if(currentday.equals(day))
					  {
						  */
					 
	///pending assignment in date picker  
					 
					 }
}
