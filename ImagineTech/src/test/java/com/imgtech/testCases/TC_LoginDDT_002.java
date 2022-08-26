package com.imgtech.testCases;

import java.io.IOException;


import org.junit.jupiter.api.Test;
import org.testng.annotations.DataProvider;

import com.imgtech.pageObjects.LoginPage;
import com.imgtech.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass
{
	
	@Test(dataProvider="LoginData")
	public void loginDDT()
	{
		LoginPage lp=new LoginPage(driver);
		
	}
	
	@DataProvider(name="LoginData")
	String[][] getData() throws IOException
	{
		
		String path="C:\\Users\\Yuvraj\\eclipse-workspace\\ImagineTech\\src\\test\\java\\com\\imgtech\\testData\\LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path,"Sheet1");
		int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<colcount;i++)
		{
			for(int j=0;j<colcount;j++)
				
			{
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);//1 0
			}
		}
		
	return logindata;
	}

}
