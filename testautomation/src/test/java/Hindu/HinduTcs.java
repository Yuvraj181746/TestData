package Hindu;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HinduTcs {

	public static void main(String[] args) {
		 
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuvraj\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.thehindu.com/");
		
		SoftAssert softAssert= new SoftAssert();
		
		//For Entertainment
		driver.findElement(By.xpath("//a[@content=\"Entertainment\"]")).click();
		
		String entertainmentactualURL=driver.getCurrentUrl();
		String entertainmentexpectedURL="https://www.thehindu.com/entertainment/";
		
		softAssert.assertEquals(entertainmentactualURL, entertainmentexpectedURL);
		
		System.out.println("Entertainment Page URL :" + driver.getCurrentUrl());
		
		
		//For Sport
		driver.findElement(By.xpath("//a[@content=\"Sport\"]")).click();
		
		String sportactualURL=driver.getCurrentUrl();
		String sportexpectedURL="https://www.thehindu.com/sport/";
		
		softAssert.assertEquals(sportactualURL, sportexpectedURL);
		
		System.out.println("Sport Page URL:" + driver.getCurrentUrl());
		
		
		//Crossword
		driver.findElement(By.xpath("//a[@content=\"Crossword+\"]")).click();
		
		String crosswordactualURL=driver.getCurrentUrl();
		String crosswordexpectedURL="https://crossword.thehindu.com/?utm_source=thehindu&utm_medium=mainmenu";
		
		softAssert.assertEquals(crosswordactualURL, crosswordexpectedURL);
		System.out.println("Crossword+ Page URL:"+driver.getCurrentUrl());
		
		//Science 
		driver.findElement(By.xpath("//a[@content=\"Science\"]")).click();
		
		String scienceactualURL=driver.getCurrentUrl();
		String scienceexpectedURL="https://www.thehindu.com/sci-tech/science/";
		
		softAssert.assertEquals(scienceactualURL, scienceexpectedURL);
		System.out.println("Science Page URL:"+driver.getCurrentUrl());
		
		//Latest News
		driver.findElement(By.id("latestnews-top-title")).click();
		String latestNewsactualURL=driver.getCurrentUrl();
		String latestNewsexpectedURL="https://www.thehindu.com/latest-news/";
		
		softAssert.assertEquals(latestNewsactualURL, latestNewsexpectedURL);
		System.out.println("Latest News URL:"+driver.getCurrentUrl());
		
		//Business
		driver.findElement(By.xpath("//a[@content=\"Business\"]")).click();
		String businessactualURL=driver.getCurrentUrl();
		String businessexpectedURL="https://www.thehindu.com/business/";
		
		softAssert.assertEquals(businessactualURL, businessexpectedURL);
		System.out.println("Business Page URL:"+driver.getCurrentUrl());
		
		//News
		driver.findElement(By.xpath("//a[@content=\"News\" and @data-toggle=\"dropdown\" ]")).click();
		String newsactualURL=driver.getCurrentUrl();
		String newsexpectedURL="https://www.thehindu.com/news/";
		
		softAssert.assertEquals(newsactualURL, newsexpectedURL);
		
		System.out.println("News Page URL:"+driver.getCurrentUrl());
		
		//Opinion 
		driver.findElement(By.xpath("//a[@content=\"Opinion\"]")).click();
		String opinionactualURL=driver.getCurrentUrl();
		String openionexpectedURL="https://www.thehindu.com/opinion/";
		
		softAssert.assertEquals(opinionactualURL, openionexpectedURL);
		
		System.out.println("Opinion Page URL:"+driver.getCurrentUrl());
		
		

	}

}
