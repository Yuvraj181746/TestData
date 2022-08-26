package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankingGuru99 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuvraj\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/V4/");
		
		driver.findElement(By.name("uid")).sendKeys("mngr406248");
		driver.findElement(By.name("password")).sendKeys("unejEbA");
		driver.findElement(By.name("btnLogin")).click();
		System.out.println(driver.getTitle());
	}

}
