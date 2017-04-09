/**
 * 
 */
package com.wordpress.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utility.BrowserFactory;

import com.wordpress.pages.LoginPage;

/**
 * @author Sohel
 */
public class VerifyWordpressLogin {
	
	@Test
	public void VerifyValidLogin(){
	  WebDriver driver = BrowserFactory.StartBrowser("chrome", "http://demosite.center/wordpress/wp-login.php");
	  /*
	   * Changed for page factory
	   */
	  LoginPage Login = PageFactory.initElements(driver,LoginPage.class);	
		/*
		 * Passing parameters to login page
		 */
		Login.logintowordpress("admin", "demo123");
		driver.quit();
		
	}

}
