package testautomation;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuvraj\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		/*driver.get("https://www.amazon.in/");
		
		//WebElement acntList=driver.findElement(By.linkText("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooginhydr1-21%26ref%3Dnav_ya_signin%26adgrpid%3D60639568242%26hvpone%3D%26hvptwo%3D%26hvadid%3D294102729351%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D4942771446498349428%26hvqmt%3Db%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062096%26hvtargid%3Dkwd-299123108802%26hydadcr%3D5841_1738695%26gclid%3DCj0KCQjw6pOTBhCTARIsAHF23fLJTeiMi35kBwD7I3VTxnNqXoH0eRTHKGeT5h4ZrTxCu_jHjWCNu00aAoqlEALw_wcB&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&"));
		
		//WebElement flag=driver.findElement(By.className("nav-line-2"));
		Actions action=new Actions(driver);
		
		//action.moveToElement(flag).build().perform();
		
		//WebElement starthere=driver.findElement(By.linkText("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&"));
		//starthere.click();*/
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569885%7Ce%7Cfb%20sign%20up%7C&placement=&creative=589460569885&keyword=fb%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-23300271256%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjw6pOTBhCTARIsAHF23fJxigD40AEAOBvX4behXDU0ZgzSMoBn1L833fD6n2PdZJIshsY3u0kaArR3EALw_wcB");
		WebElement day=driver.findElement(By.name("birthday_day"));
		
		Actions action=new Actions(driver);
		
		Thread.sleep(5000);
		action.moveToElement(day).perform();
		
		
		
		
		
		
		
		
	}

}
