package com.imgtech.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.imgtech.pageObjects.BurjeelHomePage;

public class TC10_Burjeel_InsurancePartnersOptionTest extends BaseClass {
	@Test
	public void InsurancePartners() throws IOException
	{
		logger.info("URL is opened");
		
		
		BurjeelHomePage hp=new BurjeelHomePage(driver);
		
		 
		hp.InsurancePartnersClick();		
		System.out.println(driver.getCurrentUrl());
		
		if(driver.getCurrentUrl().equals("https://burjeel.com/insurance/"))
		{
			Assert.assertTrue(true);
			logger.info("Insurance Partners Option Test passed");
		}  
		else
		{
			captureScreen(driver, "TC10_Burjeel_InsurancePartnersOptionTest");
			Assert.assertTrue(false);
 			logger.info("Insurance Partners Option Test failed");
			
		}

		
	}

}
