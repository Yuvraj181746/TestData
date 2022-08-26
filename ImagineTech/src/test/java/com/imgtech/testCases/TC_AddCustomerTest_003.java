package com.imgtech.testCases;

import java.io.IOException;



import org.junit.jupiter.api.Test;
import org.testng.Assert;

import com.imgtech.pageObjects.AddCustomerPage;
import com.imgtech.pageObjects.LoginPage;


public class TC_AddCustomerTest_003 extends BaseClass{

@org.testng.annotations.Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		 
		LoginPage  lp=new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("Username is provided");
		lp.setPassword(password);
		logger.info("Password is provided");
		lp.clickLogin();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust= new AddCustomerPage(driver);
		
		addcust.clickAddNewCustomer();
		logger.info("Providing customer details");
		Thread.sleep(3000);
		
		addcust.custName("Yuvraj");
		addcust.custGender("female");
		addcust.custDOB("26", "06", "1995");
		
		Thread.sleep(3000);
		
		addcust.custAddress("India");
		addcust.custCity("Mumbai");
		addcust.custState("Maharashtra");
		addcust.custPIN("123123");
		addcust.custTelephoneno("9878685848");
		
		String email=randomestring()+"@gmail.com";
		addcust.custEmailid(email);
		
		addcust.custPassword("abcdef");
		addcust.custSubmit();
		Thread.sleep(3000);
		
		logger.info("Validation started....");
		boolean res=driver.getPageSource().contains("Customer Registered Successful!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test case passed...");
		}
		else
		{
			logger.info("Test case failed...");
			captureScreen(driver, "addNewCustomer");
			Assert.assertTrue(false);
		}
	}
	
	
}
