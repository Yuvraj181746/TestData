package com.imgtech.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.imgtech.pageObjects.BurjeelHomePage;

public class TC15_Burjeel_COntactUSOptionTest extends BaseClass{
	
	@Test
	public void contactUSOption() throws IOException
	{
		logger.info("URL is opened");
		
		
		BurjeelHomePage hp=new BurjeelHomePage(driver);
		
		 
		hp.contactUSClick();		
		System.out.println(driver.getCurrentUrl());
		
		if(driver.getCurrentUrl().equals("https://burjeel.com/contact-us/"))
		{
			Assert.assertTrue(true);
			logger.info("Contact us Option Test passed");
		}  
		else
		{
			captureScreen(driver, "TC15_Burjeel_COntactUSOptionTest");
			Assert.assertTrue(false);
 			logger.info("Contact us Option Test failed");
			
		}

		
	}

}
