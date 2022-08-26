package com.imgtech.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.imgtech.pageObjects.BurjeelHomePage;

public class TC20_Burjeel_InstagramPage extends BaseClass {
	@Test
	public void twitterOption() throws IOException
	{
		logger.info("URL is opened");
		
		
		BurjeelHomePage hp=new BurjeelHomePage(driver);
		
		 
		hp.twitterPageClick();		
		System.out.println(driver.getCurrentUrl());
		
		if(driver.getCurrentUrl().equals("https://twitter.com/burjeelhospital?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor"))
		{
			Assert.assertTrue(true);
			logger.info("Twitter page Option Test passed");
		}  
		else
		{
			captureScreen(driver, "TC20_Burjeel_InstagramPage");
			Assert.assertTrue(false);
 			logger.info("Twitter page Option Test failed");
			
		}

		
	}


}
