package Hindu;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TodaysPaper {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuvraj\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.thehindu.com/");
		
		driver.findElement(By.xpath("//a[@content=\"Today's Paper\"]")).click();
		
		System.out.println(driver.getCurrentUrl());
		
		 
		driver.close();
	} 

}
