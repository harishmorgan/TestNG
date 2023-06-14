package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	// Annotations are used to specify the sequence of methods execution without
	// using main methods

	@BeforeSuite //1

	public void setUp() {
		System.out.println("set up system property for chrome Browser");
	}

	@BeforeClass//3

	public void login() {
		System.out.println("login method");
	}

	@BeforeMethod//4

	public void enterURL() {
		System.out.println("enter URL");
	}

	@BeforeTest//2

	public void  launchBrowser() {
		System.out.println("Launch chrome Browser");
		
	}

	@Test//5

	public void verifyTitle() {
		System.out.println("Google Title Test");
	}
	
	@Test//

	public void searchText() {
		System.out.println("searching for text....");
	}

	
	@Test//

	public void googleLogoText() {
		System.out.println("..googleLogoText....");
	}

	@AfterMethod//6

	public void logOut() {
		System.out.println("Logout from the app");
	}

	@AfterTest//8

	public void deleteAllCookies() {
		System.out.println("deleteAllCookies");
	}

	@AfterClass//7

	public void closeBrowser() {
		System.out.println("closeBrowser");
	}

	@AfterSuite//9
	public void generateTestReport() {
		System.out.println("generateTestReport");
	}
	
	//output 
	
	/* 
set up system property for chrome Browser
Launch chrome Browser
login method
enter URL
..googleLogoText....
Logout from the app
enter URL
searching for text....
Logout from the app
enter URL
Google Title Test
Logout from the app
closeBrowser
deleteAllCookies
PASSED: searchText
PASSED: googleLogoText
PASSED: verifyTitle
 */
	
	/* Execution Flow will be 
	 * @BeforeSuite
	 * @BeforeTest
	 * @BeforeClass
	 * @BeforeMethod
	 * @Test1
	 * @AfterMethod
	 * @BeforeMethod
	 * @Test2
	 * @AfterMethod
	 * @BeforeMethod
	 * @Test3
	 * @AfterMethod
	 * @AfterClass
	 * @AfterTest
	 * 
	 * */
	
}
