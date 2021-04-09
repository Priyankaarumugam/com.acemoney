package com.acemoney;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class bacsics1 
{
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
	public void verifySignup()
	{
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		
	}
	
	@Test
	public void verifyfirstname() 
	{
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Priyanka");

	}
	
	@Test
    public void verifySurname()
    {
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Arumugam");
	}
	
	@AfterMethod
    public void Teardown()
    {
    	driver.close();
    }



}
