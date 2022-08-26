package com.imgtech.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.imgtech.pageObjects.BurjeelHomePage;

public class TC9_Burjeel_AchievementsOptionTest extends BaseClass {

	@Test
	public void achievements() throws IOException
	{
		logger.info("URL is opened");
		
		
		BurjeelHomePage hp=new BurjeelHomePage(driver);
		
		 
		hp.achievementsClick();		
		System.out.println(driver.getCurrentUrl());
		
		if(driver.getCurrentUrl().equals("https://burjeel.com/achievement/"))
		{
			Assert.assertTrue(true);
			logger.info("Achievements Option Test passed");
		}  
		else
		{
			captureScreen(driver,"TC9_Burjeel_AchievementsOptionTest");
			Assert.assertTrue(false);
 			logger.info("Achievements Option Test failed");
			
		}

		
	}
}
