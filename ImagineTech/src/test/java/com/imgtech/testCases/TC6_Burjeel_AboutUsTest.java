package com.imgtech.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.imgtech.pageObjects.BurjeelHomePage;

public class TC6_Burjeel_AboutUsTest extends BaseClass {

	@Test
	public void aboutUsOption() throws IOException
	{
		logger.info("URL is opened");
		 
		BurjeelHomePage hp=new BurjeelHomePage(driver);
		 
		hp.aboutUsClick();
		
		System.out.println(driver.getCurrentUrl());
		
		if(driver.getCurrentUrl().equals("https://burjeel.com/about-us/"))
		{
			Assert.assertTrue(true);
			logger.info("About Us  Test passed");
		}  
		else
		{
			captureScreen(driver,"TC6_Burjeel_AboutUsTest");
			Assert.assertTrue(false);
 			logger.info("About us Test failed");
			
		}
	}
	
}
