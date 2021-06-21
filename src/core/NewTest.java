package core;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	String Title = "Facebook";
	WebDriver driver;
  @Test(enabled = false)
  public void Logindetails() {
	  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.name("Submit")).click();
	  System.out.println("Test case pass with valid data");
	  
  }
  @Test
  public void Logindetails1() {
	  driver.findElement(By.name("txtUsername")).sendKeys("Admin1");
	  driver.findElement(By.name("txtPassword")).sendKeys("admin1234");
	  driver.findElement(By.name("Submit")).click();
	  System.out.println("Test case pass with invalid data");
	  
  }
 

  @BeforeMethod
  public void Setup() {
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	driver = new ChromeDriver();
	String url = "https://opensource-demo.orangehrmlive.com/";
	driver.get(url);
	driver.manage().window().maximize();
  }

  @AfterMethod
  public void teardown() {
	  System.out.println("quite the browser");
	  driver.quit();
  }

}
