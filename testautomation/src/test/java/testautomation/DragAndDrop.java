package testautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuvraj\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	/*	driver.get("http://demo.automationtesting.in/Static.html");
		
		WebElement source=driver.findElement(By.id("angular"));
		WebElement target=driver.findElement(By.id("droparea"));
		
		Actions action = new  Actions(driver);
		
		//action.clickAndHold(source).moveToElement(target).release().build().perform();
		action.dragAndDrop(source, target).perform();	
		*/
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Accepted%20Elements");
		 
		WebElement source=driver.findElement(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'][1]"));
		WebElement target=driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions action = new  Actions(driver);
		action.dragAndDrop(source, target).build().perform(); 
		//action.clickAndHold(source).moveToElement(target).release().build().perform();
		
	}

}
