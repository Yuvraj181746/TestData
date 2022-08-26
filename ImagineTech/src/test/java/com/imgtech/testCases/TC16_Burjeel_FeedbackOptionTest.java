package com.imgtech.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.imgtech.pageObjects.BurjeelHomePage;

public class TC16_Burjeel_FeedbackOptionTest extends BaseClass {

	@Test
	public void feedbackOption() throws IOException
	{
		logger.info("URL is opened");
		
		
		BurjeelHomePage hp=new BurjeelHomePage(driver);
		
		 
		hp.feedbackClick();		
		System.out.println(driver.getCurrentUrl());
		
		if(driver.getCurrentUrl().equals("https://burjeel.com/feedback/"))
		{
			Assert.assertTrue(true);
			logger.info("Feedback Option Test passed");
		}  
		else
		{
			captureScreen(driver, "TC16_Burjeel_FeedbackOptionTest");
			Assert.assertTrue(false);
 			logger.info("Feedback Option Test failed");
			
		}

		
	}
}
