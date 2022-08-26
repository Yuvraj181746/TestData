package com.imgtech.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.imgtech.pageObjects.BurjeelHomePage;

public class TC7_Burjeel_PatientStoriesTest extends BaseClass {
	
	@Test
	public void patientStoriesOption() throws IOException
	{
		logger.info("URL is opened");
		
		
		BurjeelHomePage hp=new BurjeelHomePage(driver);
		
		 
		hp.PatientStoriesClick();		
		System.out.println(driver.getCurrentUrl());
		
		if(driver.getCurrentUrl().equals("https://burjeel.com/testimonials/"))
		{
			Assert.assertTrue(true);
			logger.info("Patient stories Test passed");
		}  
		else
		{
			captureScreen(driver, "TC7_Burjeel_PatientStoriesTest");
			Assert.assertTrue(false);
 			logger.info("Patient stories Test failed");
			
		}

		
	}

}
