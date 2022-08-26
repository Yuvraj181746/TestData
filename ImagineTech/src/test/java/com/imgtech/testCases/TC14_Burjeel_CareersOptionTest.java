package com.imgtech.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.imgtech.pageObjects.BurjeelHomePage;

public class TC14_Burjeel_CareersOptionTest extends BaseClass
{
	@Test
	public void CareersOption() throws IOException
	{
		logger.info("URL is opened");
		
		
		BurjeelHomePage hp=new BurjeelHomePage(driver);
		
		 
		hp.careersClick();		
		System.out.println(driver.getCurrentUrl());
		
		if(driver.getCurrentUrl().equals("https://burjeel.com/careers/"))
		{
			Assert.assertTrue(true);
			logger.info("Careers Option Test passed");
		}  
		else
		{
			captureScreen(driver, "TC14_Burjeel_CareersOptionTest");
			Assert.assertTrue(false);
 			logger.info("Careers Option Test failed");
			
		}

		
	}

}
