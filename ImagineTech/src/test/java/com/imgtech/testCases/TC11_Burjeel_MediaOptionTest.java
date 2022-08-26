package com.imgtech.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.imgtech.pageObjects.BurjeelHomePage;

public class TC11_Burjeel_MediaOptionTest extends BaseClass {

 @Test
	public void media() throws IOException
	{
		logger.info("URL is opened");
		
		
		BurjeelHomePage hp=new BurjeelHomePage(driver);
		
		 
		hp.mediaClick();		
		System.out.println(driver.getCurrentUrl());
		
		if(driver.getCurrentUrl().equals( "https://burjeel.com/news/"))
		{
			Assert.assertTrue(true);
			logger.info("Media Option Test passed");
		}  
		else
		{
			captureScreen(driver, "TC11_Burjeel_MediaOptionTest");
			Assert.assertTrue(false);
 			logger.info("Media Option Test failed");
			
		}

		
	}


}
