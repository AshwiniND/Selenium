package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGSample {
	
	@BeforeSuite
	public void Setup() {
		System.out.println("Setting up browser");
	}

	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("Launching Browser");
	}
	
	@BeforeTest
	public void EnterURL() {
		System.out.println("Enter URL");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("login with user cred");
	}
	
	@Test
	public void GoogleTitleTest()
	{
		System.out.println("Google");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout");
	}
	
	@AfterTest
	public void CloseBrowser()
	{
		System.out.println("Closing chrome browser");
	
	}
	@AfterClass
	public void deleteCookies() {
		System.out.println("Deleting all cookies");
	}
	
	
	
}
