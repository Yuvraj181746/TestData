package Hindu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Business {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuvraj\\Desktop\\New folder1\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.thehindu.com/");
		
		driver.findElement(By.xpath("//a[@content=\"Business\"]")).click();
		
		System.out.println(driver.getCurrentUrl());
		
 

	}

}
