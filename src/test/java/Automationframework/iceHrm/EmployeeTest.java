package Automationframework.iceHrm;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import ice_hrm.com.utility.Baseclass;
import ice_hrm.com.utility.PropertyHandling;
import pages.IceEmployeePage;
import pages.LoginPage;



public class EmployeeTest extends Baseclass {

	PropertyHandling property;
    LoginPage loginPage;
    IceEmployeePage employeePage;
	
    
	

    @BeforeClass
    public void beforeClass() {
        property = new PropertyHandling();
        launchBrowser(property.getProperty("browser"));
        driver.get(property.getProperty("icehrmUrl"));
        loginPage = new LoginPage();
      IceEmployeePage  employeePage = new IceEmployeePage();
        String username = property.getProperty("icehrmUsername");
        String password = property.getProperty("icehrmPassword");
        loginPage.login(username, password);
    }

    @Test
    public void verifySearchEmp() throws InterruptedException {
        click(employeePage.employeeMenu);
        click(employeePage.empSubMenu);
        waitUntilElementIsClickable(employeePage.searchButton);
        List<String> allEmpFNames = new ArrayList<>();
        
        Thread.sleep(5000);
        List<WebElement> allEmpDetails = driver.findElements(employeePage.allEmpInfo);
        
        for (WebElement element : allEmpDetails) {
            String firstName = element.getText();
            allEmpFNames.add(firstName);
           // enterText(employeePage.searchBox,firstName);
           System.out.println(element.getText());
        }
        String lastEmpName = allEmpFNames.get(allEmpDetails.size()-4);
        enterText(employeePage.searchBox, lastEmpName);
        System.out.println(lastEmpName);
        Thread.sleep(5000);
        click(employeePage.searchButton);
        
        List<WebElement> searchEmpDetails = driver.findElements(employeePage.allEmpInfo);
       for (WebElement element : searchEmpDetails) {
            String firstName = element.getText();
            
           // Assert.assertEquals(firstName , lastEmpName);
        }
    }


		// TODO Auto-generated method stub
		
	}
	

/*	@AfterClass
    public void afterClass() {
        driver.close(); 
    }
*/


