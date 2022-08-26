package com.imgtech.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.imgtech.pageObjects.BurjeelHomePage;

public class TC3_Burjeel_PatientPortalTest extends BaseClass {
	
	@Test
	public void patientPortal() throws IOException
	{
		//driver.get(baseURL);
		
				logger.info("URL is opened");
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				
				BurjeelHomePage hp=new BurjeelHomePage(driver);
				
				 
				hp.PatientPortal();
				
				if(driver.getCurrentUrl().equals("https://patientportal.vpshealth.com/home/login?brandName=burjeel"))
				{
					Assert.assertTrue(true);
					logger.info("Patient Portal Test passed");
				}  
				else
				{
					captureScreen(driver, "TC3_Burjeel_PatientPortal");
					Assert.assertTrue(false);
		 			logger.info("Patient Portal Test failed");
					
				}
			
	}

}
