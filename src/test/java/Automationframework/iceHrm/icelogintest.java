package Automationframework.iceHrm;

import  org.testng.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import ice_hrm.com.utility.Baseclass;
import ice_hrm.com.utility.PropertyHandling;
import pages.LoginPage;

public class icelogintest extends Baseclass {

	PropertyHandling property;
    LoginPage loginPage;
    @BeforeClass
    public void start() {
        property = new PropertyHandling();
        launchBrowser(property.getProperty("browser"));
        driver.get(property.getProperty("icehrmUrl"));
        loginPage = new LoginPage();
    }
    @Test(dataProvider = "getLoginData")
    public void verifyLogin(String username, String password, String errorMsg) {
        loginPage.login(username, password);
        if (!username.isEmpty() && !password.isEmpty()) {
            String errorMessage = driver.findElement(loginPage.errorMsg).getText();
            Assert.assertEquals(errorMessage, errorMsg);
        }
   }
    @DataProvider
    public Object[][] getLoginData() {
        Object[][] data = new Object[][]{
                {"admin123", "admin", "Login failed"},
                {"admin", "admin124", "Login failed"},
                {"admin123", "2zuzfakn", "Login failed"},
                {"", "", ""},
                {"", "2zuzfakn", ""},
                {"admin", "", ""}
        };
        return data;
    }
}
	
	

