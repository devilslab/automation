package Guru99.Automation;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

public class login {
	WebDriver driver;
	
	  @Test
	  public  void f() {
		  
		 
		  driver.get("http://www.demo.guru99.com/V4/");
		  Reporter.log("Guru99 opened");
		  Assert.assertEquals("Guru99 Bank Home Page",driver.getTitle(),"Mismatch");
		  Reporter.log("title matched");;
		  System.out.println(driver.getTitle());
		  Reporter.log("Title printed");
		  
		  
	  }
	  
	  @BeforeTest
	  public void beforetest()
	  {
		  System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		  
		  driver= new FirefoxDriver();
  
	  }
	  
	  
	  @AfterTest
	  public void aftertest()
	  {
		  
		  driver.quit();
		  
	  
	  }
	  
	}

