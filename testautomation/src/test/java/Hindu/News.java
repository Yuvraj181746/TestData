package Hindu;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class News {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuvraj\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.thehindu.com/");
		
		driver.findElement(By.xpath("//a[@content=\"News\" and @data-toggle=\"dropdown\" ]")).click();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		
	}

}
