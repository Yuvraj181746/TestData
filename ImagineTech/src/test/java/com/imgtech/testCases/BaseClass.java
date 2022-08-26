package com.imgtech.testCases;

import java.io.File;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.imgtech.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readConfig=new ReadConfig();
	
	public String baseURL=readConfig.getApplicationURL();
	public String username=readConfig.getUsername();
	public String password=readConfig.getPassword();
	
	/*public String baseURL="https://demo.guru99.com/V4";
	public String username="mngr406248";
	public String password="unejEbA";
	*/
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) 
	{
		logger=Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
		//BasicConfigurator.configure();
		
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuvraj\\Desktop\\New folder1\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Yuvraj\\Desktop\\New folder1\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*
		 //System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuvraj\\Desktop\\New folder1\\chromedriver.exe");
		driver=new ChromeDriver();
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Yuvraj\\Desktop\\New folder1\\geckodriver.exe");
		driver=new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());

		
		 */
		 
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname ) throws IOException

	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		//File target=new File(System.getProperty("user.dir")+"/Screenshots"+tname+".png");
 		//FileUtils.copyFile(source, target);
 		FileHandler.copy(source, new File("./Screenshots/"+tname+".png"));
		System.out.println("Screenshot taken");
	}
	public String randomestring()// for generate random string i.e Email bcz avoid duplication for TC3
	{
		String generatedstring =RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	
	public static String randomeNum()// for generate random number to avoid duplications for TC3
	{
		String generatedstring2 =RandomStringUtils.randomNumeric(4);
		return(generatedstring2);
	}
}
