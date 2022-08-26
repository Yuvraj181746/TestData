package com.imgtech.pageObjects;

import org.apache.tika.config.Field;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BurjeelHomePage {
WebDriver driver; 						//ldriver i.e local driver
	
	public BurjeelHomePage(WebDriver driver) 	//Constructor
	{ 					
	
	this.driver=driver;
	PageFactory.initElements(driver,this);
	 
	}
	
	//WebElements
	@FindBy(xpath="//*[@id=\"mega-menu-item-581\"]/a")
	WebElement linkDoctor;
	
	@FindBy(xpath="//*[@id=\"mega-menu-item-2316\"]/a ")
	WebElement linkSpecialities;
	
	/*@FindBy(linkText="Specialties")
	WebElement linkSpecialities; */
 
	@FindBy(xpath="//*[@id=\"masthead\"]/div/div/div[2]/div/div/a[1]")
	WebElement linkPatientPotal;
	
	@FindBy(xpath="//*[@id=\"masthead\"]/div/div/div[2]/div/div/a[2]/span")
	WebElement selectLocation;
	
	@FindBy(xpath="//*[@id=\"user_data\"]")
	WebElement searchTextfield;
	
	@FindBy(xpath="//*[@id=\"headerglobal_form\"]/button")
	WebElement searchOption;
	
	@FindBy(xpath = "(//a[@class='nav-link'])[1]")////*[contains(text(),'About Us')]
	WebElement aboutUs;
	
	@FindBy(xpath="//*[contains(text(),'Patient Stories')]")
	WebElement patientStories;
	
	@FindBy(xpath="//*[contains(text(),'Accreditations')]")
	WebElement accreditions;
	
	@FindBy(xpath="//*[contains(text(),'Achievements')]")
	WebElement achievements;
	
	@FindBy(xpath="//*[contains(text(),'Insurance Partners')]")
	WebElement InsurancePartners;
	
	@FindBy(xpath="//*[@id=\"menu-item-2334\"]/a")
	WebElement media;
	
	@FindBy(xpath="//*[contains(text(),'Blogs')]")
	WebElement blogs;
	
	@FindBy(xpath = "//*[contains(text(),'FAQ')]")
	WebElement FAQ;
	
	@FindBy(xpath="//*[contains(text(),'Careers')]")
	WebElement careers;
	
	@FindBy(xpath="//*[@id=\"menu-item-2322\"]/a")
	WebElement contactUS;
	
	@FindBy(xpath="//*[@id=\"menu-item-2366\"]/a")
	WebElement feedback;
	
	@FindBy(xpath="//*[@id=\"custom_html-8\"]/div/ul/li[1]/a")
	WebElement facebookPage;

	@FindBy(xpath="//*[@id=\"custom_html-8\"]/div/ul/li[2]/a")
	WebElement linkedin ;
	
	@FindBy(xpath="//*[@id=\"custom_html-8\"]/div/ul/li[3]/a")
	WebElement twitter;
	
	@FindBy(xpath="//*[@id=\"custom_html-8\"]/div/ul/li[4]/a")
	WebElement instagram;
	
	@FindBy(xpath="//*[@id=\"custom_html-8\"]/div/ul/li[5]/a")
	WebElement youtube;
	//Action methods
	public void Doctor() 
	{
		linkDoctor.click();
	}
	
	public void Specialities() 
	{
		linkSpecialities.click();
	}
	
	public void PatientPortal()
	{
		linkPatientPotal.click();
	}
	
	public void SelectLocation()
	{
		selectLocation.click();
	}
	public void search() 
	{
		searchTextfield.sendKeys("Radiology");
	}
	
	public void searchOptionClick()
	{
		searchOption.click();
	}
	public void aboutUsClick()
	{
		aboutUs.click();
	}
	
	public void PatientStoriesClick()
	{
		patientStories.click();
	}
	public void accreditationsClick()
	{
		accreditions.click();
	}
	public void achievementsClick()
	{
		achievements.click();
	}
	public void InsurancePartnersClick()
	{
		InsurancePartners.click();
	}
	public void mediaClick()
	{
		media.click();
	}
	public void blogsClick()
	{
		blogs.click();
	}
	public void FAQClick()
	{
		FAQ.click();
	}
	public void careersClick()
	{
		careers.click();
	}
	public void contactUSClick()
	{
		contactUS.click();
	}
	public void feedbackClick()
	{
		feedback.click();
	}
	public void facebookPageClick()
	{
		facebookPage.click();
	}
	public void linkedinPageClick()
	{
		linkedin.click();
	}
	public void twitterPageClick()
	{
		twitter.click();
	}
	public void instagramPageClick()
	{
		instagram.click();
	}
	public void youtubeChannelClick()
	{
		youtube.click();
	}
}
