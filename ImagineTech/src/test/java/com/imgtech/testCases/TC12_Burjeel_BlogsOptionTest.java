package com.imgtech.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.imgtech.pageObjects.BurjeelHomePage;

public class TC12_Burjeel_BlogsOptionTest extends BaseClass {


	 @Test
		public void blogs() throws IOException
		{
			logger.info("URL is opened");
			
			
			BurjeelHomePage hp=new BurjeelHomePage(driver);
			
			 
			hp.blogsClick();
			System.out.println(driver.getCurrentUrl());
			
			if(driver.getCurrentUrl().equals("https://burjeel.com/health-tap/#blogs"))
			{
				Assert.assertTrue(true);
				logger.info("Blogs Option Test passed");
			}  
			else
			{
				captureScreen(driver, "TC12_Burjeel_BlogsOptionTest");
				Assert.assertTrue(false);
	 			logger.info("Blogs Option Test failed");
				
			}

			
		}

}
