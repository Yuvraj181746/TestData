package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActioncClickAndSendKeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuvraj\\Desktop\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		//WebElement search=driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div[1]/div[1]/input"));
		WebElement search=driver.findElement(By.xpath("//input[@id=\"search\"]"));
		//WebElement search=driver.findElement(By.id("search-input"));
		//WebElement search=driver.findElement(By.className("ytd-searchbox-spt"));
		
		search.sendKeys("selenium");
	   
	
	   WebElement search_button=driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/button"));
		//WebElement search_button=driver.findElement(By.className("style-scope ytd-searchbox"));
	   
	   search_button.click();
	
	}

} 