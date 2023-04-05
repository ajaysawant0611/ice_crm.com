package Automation.ice_hrm.com;


import java.time.LocalDateTime;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DropDownTest {
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.edge.driver","msedgedriver.exe");
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
					 int currentDay=LocalDateTime.now().getDayOfMonth();
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
					 }
					 					 
//gender--->			
					  Thread.sleep(2000);
					 WebElement gender=driver.findElement(By.id("rc_select_1"));
					 gender.click();
					
					 Thread.sleep(3000);
					 WebElement selectgender=driver.findElement(By.xpath("//div[@label='Male']/div"));
					 selectgender.click(); 
			
//status married or not --->
					 WebElement status=driver.findElement(By.id("rc_select_2"));//alasaka native
					 status.click();
					 Thread.sleep(4000);
					 
					 WebElement status1=driver.findElement(By.xpath("//div[@label=\'Single\']/div"));//single
					 status1.click();
					//div[@label="Single"]/div
					
					 					 
					 Thread.sleep(2000);
//slect ethnicity--->
					 WebElement empethnicity=driver.findElement(By.id("rc_select_3"));//alasaka native
					 empethnicity.click();
					 Thread.sleep(2000);
					 
					 WebElement empethnicity1=driver.findElement(By.xpath("//div[@label=\"Alaska Native\"]/div"));//alasaka nativ
					 empethnicity1.click();
					  Thread.sleep(3000);
				
//save-->					
					   String empsave=driver.findElement(By.xpath("//span[text()=\"Save\"]")).getText();
					 // WebElement empsave=driver.findElement(By.id("//span[text()=\"Save\"]"));//alasaka native
					 // empsave.click();
					   //find save button availane or not
					  if(empsave.equals("Save"))
						{
							System.out.println("test case passed");
							
						}
						else {
							throw new Exception("fail");
							}

						 
	}

	}