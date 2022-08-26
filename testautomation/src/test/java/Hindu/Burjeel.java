package Hindu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Burjeel {

	public static void main(String[] args) {
 
		System.setProperty("webdriver.chr"
				+ "ome.driver", "C:\\Users\\Yuvraj\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://burjeel.com/");
		//driver.findElement(By.xpath("//*[@id=\"topSidePanel\"]/button")).click();
		
		//driver.findElement(By.xpath("//*[contains(text(),'About Us')]")).click();
		//driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/section/div/ul/li[1]/a")).click();
		WebElement a=driver.findElement(By.xpath("//*[@id=\"custom_html-8\"]/div/ul/li[1]/a"));
		a.click();
		System.out.println(driver.getCurrentUrl());
		 
	}

}
