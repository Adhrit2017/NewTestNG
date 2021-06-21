package core;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Ifelsedemo {
	WebDriver driver;
	//String browser= "chrome";
	
  @Parameters({"browser"})	
  @Test
  public void f(String browser) {
	  if(browser.equals("chrome")) {
		  System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		  driver = new ChromeDriver();
	  }else if(browser.equals("firefox")) {
		  System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
			driver = new FirefoxDriver();
	  }
	  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	  System.out.println("Sucessfully open browser");
	  //driver.quit();
  }
//  @BeforeMethod
//  public void beforeMethod() {
//	  System.out.println("Begining");
//  }
//
//  @AfterMethod
//  public void afterMethod() {
//	  
//	  System.out.println("End");
//  }
  

}
