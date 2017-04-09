/**
 * 
 */
package com.wordpress.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Sohel
 */
public class LoginPage {
	WebDriver driver;
	
	/*
	 * Following POM, all the elements of Login Page will be listed here
	 * Identify element to pass value to them, to login into system
	 * Using page factory
	 */
	
	@FindBy(id="user_login") WebElement Username;
	@FindBy(xpath=".//*[@id='user_pass']") WebElement Password;
    @FindBy(name="wp-submit") WebElement LoginButton;
	 	 
	public LoginPage(WebDriver driver)
	{
	this.driver=driver;
	}
	/*
	 * Get values to login into system,also add click functionality to login
	 */
	public void logintowordpress(String Userid,String Pass)
	{ 
	Username.sendKeys(Userid);
	Password.sendKeys(Pass);
	LoginButton.click();
	}
	 
}
