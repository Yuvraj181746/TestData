package Hindu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class latestNews {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuvraj\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.thehindu.com/");
		
		driver.findElement(By.id("latestnews-top-title")).click();
		
		String LatestNewsURL=driver.getCurrentUrl();
		System.out.println(LatestNewsURL);
		
		
		
		driver.close();

	}

}
