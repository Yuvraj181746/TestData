package com.imgtech.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.imgtech.pageObjects.BurjeelHomePage;

public class TC2_Burjeel_SpecialitiesListTest extends BaseClass {

	
	@Test
	public void specialitiesList() throws IOException
	{
		//driver.get(baseURL);
		
				logger.info("URL is opened");
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				BurjeelHomePage hp=new BurjeelHomePage(driver);
				
				 
				hp.Specialities();
				hp.Specialities();
				
				if(driver.getCurrentUrl().equals("https://burjeel.com/clinical-speciality/"))
				{
					Assert.assertTrue(true);
					logger.info("Hospital speciality list Test passed");
				}  
				else
				{
					captureScreen(driver, "TC2_Burjeel_SpecialitiesList");
					Assert.assertTrue(false);
		 			logger.info("Hospital speciality list Test failed");
					
				}
			
	}


}
