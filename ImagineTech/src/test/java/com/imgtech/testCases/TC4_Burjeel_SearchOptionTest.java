package com.imgtech.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.imgtech.pageObjects.BurjeelHomePage;

public class TC4_Burjeel_SearchOptionTest extends BaseClass {
	
	@Test
	public void searchField() throws IOException
	{
	
		logger.info("URL is opened");
		
		 
		
		BurjeelHomePage hp=new BurjeelHomePage(driver);
		
		 
		hp.search();
		hp.searchOptionClick();
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("Global Home Search - Burjeel Hospital"))
		{
			Assert.assertTrue(true);
			logger.info("Search option  Test passed");
		}  
		else
		{
			captureScreen(driver, "TC4_Burjeel_SearchOption");
			Assert.assertTrue(false);
 			logger.info("Search option Test failed");
			
		}
	}

}
