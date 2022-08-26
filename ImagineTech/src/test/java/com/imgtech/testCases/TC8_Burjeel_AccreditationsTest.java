package com.imgtech.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.imgtech.pageObjects.BurjeelHomePage;

public class TC8_Burjeel_AccreditationsTest  extends BaseClass{
	@Test
	public void accreditations() throws IOException
	{
		logger.info("URL is opened");
		
		
		BurjeelHomePage hp=new BurjeelHomePage(driver);
		
		 
		hp.accreditationsClick();		
		System.out.println(driver.getCurrentUrl());
		
		if(driver.getCurrentUrl().equals("https://burjeel.com/accreditation/"))
		{
			Assert.assertTrue(true);
			logger.info("Accreditations Test passed");
		}  
		else
		{
			captureScreen(driver, "TC8_Burjeel_AccreditationsTest");
			Assert.assertTrue(false);
 			logger.info("Accreditations Test failed");
			
		}

		
	}

}
