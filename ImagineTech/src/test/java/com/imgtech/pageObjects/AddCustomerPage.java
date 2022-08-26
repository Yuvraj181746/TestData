package com.imgtech.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	WebDriver ldriver; 						//ldriver i.e local driver
	
	public AddCustomerPage(WebDriver rdriver) 	//Constructor
	{ 					
	
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
	 
	}  
	
	//WebElement
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/ul/li[2]/a")
	WebElement lnkAddnewCustomer;
	
	@FindBy(how=How.NAME,using="name")
	WebElement txtCustomerName;
	
	@FindBy(how=How.NAME,using="rad1")
	WebElement rdGender;
	
	@FindBy(how=How.NAME,using="dob")
	WebElement txtDOB;
	
	@FindBy(how=How.NAME,using="addr")
	WebElement txtAddress;
	
	@FindBy(how=How.NAME,using="city")
	WebElement txtCity;
	
	@FindBy(how=How.NAME,using="state")
	WebElement txtState;
	
	@FindBy(how=How.NAME,using="pinno")
	WebElement txtPIN;
	
	@FindBy(how=How.NAME,using="telephoneno")
	WebElement txtTelephoneno;
	
	@FindBy(how=How.NAME,using="emailid")
	WebElement txtEmailid;
	
	@FindBy(how=How.NAME,using="password")
	WebElement txtPassword;
	
	@FindBy(how=How.NAME,using="sub")
	WebElement btnSubmit;
	
	public void clickAddNewCustomer()
	{
	lnkAddnewCustomer.click();
	}
	
	public void custName(String cname)
	{
		txtCustomerName.sendKeys(cname);
	}
	
	public void custGender(String cgender)
	{
		rdGender.sendKeys(cgender);
	}
	
	public void custDOB(String dd,String mm,String yy)
	{
		txtDOB.sendKeys(dd);
		txtDOB.sendKeys(mm);
		txtDOB.sendKeys(yy);
	}
	
	public void custAddress(String caddress)
	{
		txtAddress.sendKeys(caddress);
	}
	
	public void custCity(String ccity)
	{
		txtCity.sendKeys(ccity);
	}
	
	public void custState(String cstate)
	{
		txtState.sendKeys(cstate);
	}
	
	public void custPIN(String cpin)
	{
		txtPIN.sendKeys(cpin);
	}
	
	public void custTelephoneno(String ctelephone)
	{
		txtTelephoneno.sendKeys(ctelephone);
	}
	
	public void custEmailid(String cemail)
	{
		txtEmailid.sendKeys(cemail );
	}
	
	public void custPassword(String cpassword)
	{
		txtPassword.sendKeys(cpassword);
	}
	
	public void custSubmit()
	{
		btnSubmit.click();
	}
	
	
	
	
}
