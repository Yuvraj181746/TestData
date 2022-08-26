package com.imgtech.testCases;

import java.io.IOException;

import org.testng.Assert;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;
import com.imgtech.pageObjects.BurjeelHomePage;

public class TC21_Burjeel_YoutubeChannel extends BaseClass {

	public void youtubeOption() throws IOException
	{
		logger.info("URL is opened");
		
		
		BurjeelHomePage hp=new BurjeelHomePage(driver);
		
		 
		hp.youtubeChannelClick();		
		System.out.println(driver.getCurrentUrl());
		
		if(driver.getCurrentUrl().equals("https://twitter.com/burjeelhospital?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor"))
		{
			Assert.assertTrue(true);
			logger.info("Youtube Option Test passed");
		}  
		else
		{
			captureScreen(driver, "TC21_Burjeel_YoutubeChannel");
			Assert.assertTrue(false);
 			logger.info("Youtube Option Test failed");
			
		}

		
	}

}
