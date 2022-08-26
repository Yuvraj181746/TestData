package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuvraj\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		/*driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement country=driver.findElement(By.linkText("//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"));
		
		Select select_country=new Select(country);
		
		select_country.selectByVisibleText("Aruba");*/
		
		driver.get("https://www.amazon.in/");
		
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		dropdown.click();
		String text=dropdown.getText();
		System.out.println(text);
		
		Select DropDownList=new Select(dropdown);
		
		 DropDownList.selectByIndex(5);
		
		DropDownList.selectByValue("search-alias=alexa-skills");
		
		DropDownList.selectByVisibleText("Baby");
		

	}

}
