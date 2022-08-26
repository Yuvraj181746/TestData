package com.imgtech.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.imgtech.pageObjects.BurjeelHomePage;

public class TC19_Burjeel_TwitterPage extends BaseClass{
	
	@Test
	public void instagramOption() throws IOException
	{
		logger.info("URL is opened");
		
		
		BurjeelHomePage hp=new BurjeelHomePage(driver);
		
		 
		hp.instagramPageClick();		
		System.out.println(driver.getCurrentUrl());
		
		if(driver.getCurrentUrl().equals("https://www.instagram.com/burjeelofficial/?hl=en"))
		{
			Assert.assertTrue(true);
			logger.info("Instgram page Option Test passed");
		}  
		else
		{
			captureScreen(driver, "TC19_Burjeel_TwitterPage");
			Assert.assertTrue(false);
 			logger.info("Instagram page Option Test failed");
			
		}

		
	}

}
