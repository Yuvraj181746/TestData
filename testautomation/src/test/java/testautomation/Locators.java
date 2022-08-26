package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuvraj\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/login/");
		
		//driver.manage().window().fullscreen();
		
		//id locator
		//WebElement EmailId=driver.findElement(By.id("email"));
		
		//name 
		
		//WebElement EmailId=driver.findElement(By.name("email"));
		
		//ClassName
		
		//WebElement EmailId=driver.findElement(By.className("clearfix _5466 _44mg"));
		
		//Link text
		//driver.findElement(By.linkText("Sign up for Facebook")).click();
		
		//Partial Link text
		//driver.findElement(By.partialLinkText("Sign up for")).click();
		
		//Xpath 
		
		
		WebElement EmailId=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		
		
		EmailId.sendKeys("raj123@gmail.com");
		
		WebElement password=driver.findElement(By.id("pass"));
		
		password.sendKeys("12345rty");
		
		WebElement loginbtn=driver.findElement(By.id("loginbutton"));
		loginbtn.click();
		
		
		//driver.close();
	}

}
