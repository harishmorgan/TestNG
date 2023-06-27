package com.parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	WebDriver driver;
@Test
@Parameters({"uid","pwd","url","browser"})
public void yahoologinTest(String uid, String pwd,String url,String browser) throws InterruptedException {
	if(browser.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	driver = new ChromeDriver();
	}
	else if(browser.equals("FIREFOX")) {
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//to enter user name 
	
	driver.findElement(By.xpath("//*[@name ='username']")).sendKeys(uid);
	Thread.sleep(3000);
	driver.findElement(By.name("password")).sendKeys(pwd);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	String title = driver.getTitle();
	Assert.assertEquals(title, "OrangeHRM");
	//to send user msg into XML reports and log section
			Reporter.log("Successful Login operation", true);
}
}

