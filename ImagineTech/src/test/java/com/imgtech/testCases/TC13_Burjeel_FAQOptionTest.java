package com.imgtech.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.imgtech.pageObjects.BurjeelHomePage;

public class TC13_Burjeel_FAQOptionTest extends BaseClass{

	@Test
		public void FAQ() throws IOException
		{
			logger.info("URL is opened");
			
			
			BurjeelHomePage hp=new BurjeelHomePage(driver);
			
			 
			hp.FAQClick();
			System.out.println(driver.getCurrentUrl());
			
			if(driver.getCurrentUrl().equals("https://burjeel.com/faq/"))
			{
				Assert.assertTrue(true);
				logger.info("FAQ Option Test passed");
			}  
			else
			{
				captureScreen(driver, "https://burjeel.com/faq/");
				Assert.assertTrue(false);
	 			logger.info("FAQ Option Test failed");
				
			}

			
		}


}
