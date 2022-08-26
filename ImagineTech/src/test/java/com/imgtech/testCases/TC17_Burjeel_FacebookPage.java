package com.imgtech.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.imgtech.pageObjects.BurjeelHomePage;

public class TC17_Burjeel_FacebookPage extends BaseClass{
	@Test
	public void facebookPageOption() throws IOException
	{
		logger.info("URL is opened");
		
		
		BurjeelHomePage hp=new BurjeelHomePage(driver);
		 
		hp.facebookPageClick();		
		System.out.println(driver.getCurrentUrl());
		
		if(driver.getCurrentUrl().equals("https://www.facebook.com/BurjeelHospital/"))
		{
			Assert.assertTrue(true);
			logger.info("Facebook page Option Test passed");
		}  
		else
		{
			captureScreen(driver, "TC17_Burjeel_FacebookPage");
			Assert.assertTrue(false);
 			logger.info("Facebook page Option Test failed");
			
		}

		
	}

}
