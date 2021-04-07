package com.acemoney;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basics {
	
	@BeforeTest
	public void setUp()
	{
		
	}
	
	@Test
	public void verifyTitle()
	{
		System.out.println("Test1");
	}
	
	@AfterTest
	public void tearDown()
	{
		
	}
	

}
