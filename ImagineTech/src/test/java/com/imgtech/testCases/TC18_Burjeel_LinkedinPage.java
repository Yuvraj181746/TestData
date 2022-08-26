package com.imgtech.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.imgtech.pageObjects.BurjeelHomePage;

public class TC18_Burjeel_LinkedinPage extends BaseClass{
	@Test
	public void linkedinOption() throws IOException
	{
		logger.info("URL is opened");
		
		
		BurjeelHomePage hp=new BurjeelHomePage(driver);
		
		 
		hp.linkedinPageClick();		
		System.out.println(driver.getCurrentUrl());
		
		if(driver.getCurrentUrl().equals("https://in.linkedin.com/company/burjeel-hospital"))
		{
			Assert.assertTrue(true);
			logger.info("Linkedin page Option Test passed");
		}  
		else
		{
			captureScreen(driver, "TC18_Burjeel_LinkedinPage");
			Assert.assertTrue(false);
 			logger.info("Linkedin page Option Test failed");
			
		}

		
	}


}
