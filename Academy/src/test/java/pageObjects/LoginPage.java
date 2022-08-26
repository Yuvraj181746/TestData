/*package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver; 						//ldriver i.e local driver
	
	public LoginPage(WebDriver driver) 	//Constructor
	{ 					
	
	this.driver=driver;
	PageFactory.initElements(driver,this);
	 
	}  
	//WebElement
	@FindBy(name="uid")
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	//Action methods
	public void setUserName(String uname) 
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd) 
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogin() 
	{
		btnLogin.click();
	}	
	

}
*/