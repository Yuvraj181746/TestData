package Hindu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TheHinduBusiness {

	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuvraj\\Desktop\\New folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.thehindubusinessline.com/");
        
        WebElement Home = driver.findElement(By.xpath("//a[@class='nav-link Home']"));
            Home.click();
            
            Thread.sleep(3000);
            
            WebElement News = driver.findElement(By.xpath("//a[@class='nav-link News']"));
            News.click();
            
            Thread.sleep(3000); 
            
            
            WebElement Markets = driver.findElement(By.xpath("//a[@class='nav-link Markets']"));
            Markets.click();
            
            Thread.sleep(3000);
            
            WebElement Companies = driver.findElement(By.xpath("//a[@class='nav-link Companies']"));
            Companies.click();
            
            Thread.sleep(3000);
            
            
            WebElement Opinion = driver.findElement(By.xpath("//a[@class='nav-link Opinion']"));
            Opinion.click();
            Thread.sleep(3000);
            
            
            WebElement Portfolio = driver.findElement(By.xpath("//a[@class='nav-link Portfolio']"));
            Portfolio.click();
            
            
            WebElement Specials = driver.findElement(By.xpath("//a[@class='nav-link Specials']"));
            Specials.click();
            Thread.sleep(3000);
            
            WebElement More = driver.findElement(By.xpath("//p[@class='dropdown-toggle']"));
            More.click();
            Thread.sleep(3000);
            
            WebElement Search = driver.findElement(By.xpath("//input[@id='searchTxt']"));
            Search.sendKeys("News");
            Thread.sleep(3000);
            
            WebElement LNews = driver.findElement(By.xpath("//a[@href='https://www.thehindubusinessline.com/latest-news/']"));
            LNews.click();
            Thread.sleep(3000);
            
            
            WebElement portfolio = driver.findElement(By.xpath("//a[@href='https://www.thehindubusinessline.com/portfolio/']"));
            portfolio.click();
            Thread.sleep(3000);
            
            
          // WebElement books = driver.findElement(By.xpath("//a[@href='https://www.thehindubusinessline.com/books/'][1]"));
           //books.click();
            //Thread.sleep(3000);
           
            WebElement blexplainer = driver.findElement(By.xpath("//a[@href='https://www.thehindubusinessline.com/blexplainer/']"));
            blexplainer.click();
            Thread.sleep(3000);
            
            
            WebElement economy = driver.findElement(By.xpath("//a[@href='https://www.thehindubusinessline.com/economy/']"));
            economy.click();
            Thread.sleep(3000);
	}
}
