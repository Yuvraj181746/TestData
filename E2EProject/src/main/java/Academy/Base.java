package Academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException {

	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\Yuvraj\\eclipse-workspace\\E2EProject\\src\\main\\java\\Academy\\data.properties");
	
	prop.load(fis);
	String browserName=prop.getProperty("browser");
	
	
	
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuvraj\\Desktop\\New folder\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
	}
	else if(browserName.equals("firefox" ))
	{
		
	}
	else if(browserName.equals("IE"))
	{
	}
	return driver;
	
}
}  