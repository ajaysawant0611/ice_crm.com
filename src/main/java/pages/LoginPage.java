package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ice_hrm.com.utility.Baseclass;

public class LoginPage extends Baseclass {
	//delclare all the locators
	    By username = By.name("username");
	    By password = By.name("password");
	    By loginButton = By.xpath("//button[contains(text(), 'Log in')]");
	    By restPasswordLink = By.xpath("//a[contains(text(),'Reset Password')]");
	    public By errorMsg = By.xpath("//div[contains(@class, 'alert-danger')]");

	 /*   @FindBy(name="username")
	    public WebElement username;
	    
	    @FindBy(name="password")                                  //ice hrm
	    public WebElement password;
	    
	    @FindBy(xpath("//button[contains(text(), 'Log in')]"))
	    public WebElement loginButton;
	    public loginPage(WebDriver driver) {
	    	PageFactory.initElements(driver. this);
	    }  */
	    public void login(String username, String password){
	        enterText(this.username, username);
	        enterText(this.password, password);
	        click(loginButton);
	       
	    	
	  //  	this.username.sendkeys(username);
	  //  	this.password.sendkeys(password);
	  //  	this.loginButton.click();
	    }
	    //Reusable methods for login module
	
	}


