package Hindu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectMenu {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuvraj\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.thehindu.com/");
		
		//driver.findElement(By.id("menu-button")).click();
		//driver.findElement(By.className("menu-icon"));
		Thread.sleep(5000);
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.linkText("menu-button")).click();
		 driver.findElement(By.xpath("//a[@id=\"menu-button\"]")).click();
		String menulink=driver.getCurrentUrl();
		System.out.println(menulink);
//		String menu=driver.getCurrentUrl();
//		
//		System.out.println(menu);
		

	}

}
