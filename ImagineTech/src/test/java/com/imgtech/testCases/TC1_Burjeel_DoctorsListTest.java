package com.imgtech.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.imgtech.pageObjects.BurjeelHomePage;
import com.imgtech.pageObjects.LoginPage;

public class TC1_Burjeel_DoctorsListTest extends BaseClass {
	
	@Test
	public void doctorList() throws IOException
	{
		//driver.get(baseURL);
		
				logger.info("URL is opened");
				
				
				BurjeelHomePage hp=new BurjeelHomePage(driver);
				
				 
				hp.Doctor();
				
				if(driver.getCurrentUrl().equals("https://burjeel.com/doctors/"))
				{
					Assert.assertTrue(true);
					logger.info("doctorList Test passed");
				}  
				else
				{
					captureScreen(driver, "TC1_Burjeel_DoctorsList");
					Assert.assertTrue(false);
		 			logger.info("doctorList Test failed");
					
				}
			
	}

}
