package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAndSendKeys {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuvraj\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/login/");
		
		driver.manage().window().fullscreen();
		
		WebElement EmailId=driver.findElement(By.id("email"));
		EmailId.sendKeys("yuvraj123@gmail.com");
		
		WebElement Password= driver.findElement(By.id("pass"));
		Password.sendKeys("password");
		
		WebElement LoginButton=driver.findElement(By.id("loginbutton")); 
		LoginButton.click();

	}

}
