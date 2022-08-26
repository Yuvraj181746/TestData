package com.imgtech.testCases;

import java.io.IOException;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.imgtech.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest() throws IOException 
	{
		//driver.get(baseURL);
		
		logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(username);  
		logger.info("Entered Username");
		 
		lp.setPassword(password);
		logger.info("Entered Password");
		lp.clickLogin();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login Test passed");
		}  
		else
		{
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
 			logger.info("Login Test failed");
			
		}
	}
	

}
