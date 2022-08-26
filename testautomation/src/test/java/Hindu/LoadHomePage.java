package Hindu;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class LoadHomePage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuvraj\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.thehindu.com/");
		
		String currentURL =driver.getCurrentUrl();
		String expectedURL= "https://www.thehindu.com/";
		
		System.out.println("Title :"+driver.getTitle());
		
		System.out.println(currentURL);
		
		SoftAssert softAssert= new SoftAssert();
		
		softAssert.assertEquals(expectedURL, currentURL);
		
		
		
		driver.close();
		

	}

}
