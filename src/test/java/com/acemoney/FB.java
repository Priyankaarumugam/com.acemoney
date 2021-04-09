package com.acemoney;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FB {
	
WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.fb.com");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
	}
	
	
	@Test
	public void verifyTitle()
	{
		Assert.assertEquals(driver.getTitle(), "Facebook");
	}

	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
