 package testautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForward {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuvraj\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/login/");
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.navigate().back();
		
		driver.navigate().forward(); 
		
		driver.navigate().refresh();

	}

}
