package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	static WebDriver driver;
	
	public static WebDriver StartBrowser(String browsername,String url){
		/*
		 * Select which browser will start
		 */
		if (browsername.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();		
	        }
		
		else if(browsername.equalsIgnoreCase("chrome")){
			/*
			 * Below line requires only for chrome. Not required for firefox 
			 */
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\eclipse\\ChromeDriver\\ChromeDriver.exe");
			driver = new ChromeDriver();			
		}		
		/*
		 * Maximize and pass URL
		 */
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		
	  }
	}

