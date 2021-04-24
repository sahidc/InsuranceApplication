package com.qa.TestPages;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;

import cm.qa.Pages.CarInsurancePage;
import cm.qa.Pages.HealthInsurancePage;
import cm.qa.Pages.HomePage;
import cm.qa.Pages.LifeInsurancePage;
import cm.qa.Pages.NewsPage;
import cm.qa.Pages.TwoWheelerInsurancePage;

public class HomePageTest extends BaseClass{
	HomePage homepage;
	CarInsurancePage carinsurancepage;
	HealthInsurancePage healthinsurancepage;
	LifeInsurancePage lifeinsurancepage;
	TwoWheelerInsurancePage twowheelerinsurancepage;
	NewsPage newspage;
	Logger log=Logger.getLogger(HomePageTest.class);
	
	public HomePageTest() {
		super();
	}
	@BeforeMethod
    public void setUP() throws InterruptedException {
   	 initialization();
   	 //log.info("Start Intializing");
   	homepage=new HomePage();
   	 Thread.sleep(3000);
   	 }
	@AfterMethod
	public void TearDown() {
		d.quit();
	}
	@Test(priority=1)
	public void validateHomePageTitleTest() throws InterruptedException {
		String homepageTitle=homepage.validateHomePageTitle();
		Assert.assertEquals(homepageTitle, "Insurance - Compare, Buy/Renew Insurance Policy - Health, Life, Car & Bike");
    	Thread.sleep(3000);
      	// log.info("Finish Assertion");


	}
	@Test(priority=7)
	public void validateLogoTest() throws InterruptedException {
		boolean b=homepage.ValidateLogo();
		Assert.assertTrue(b);
    	Thread.sleep(3000);

	}
	@Test(priority=2)
	public void clickOnCarInsurancePageTest() throws InterruptedException {
		carinsurancepage=homepage.clickOnCarInsurancePage();
    	Thread.sleep(3000);	
	}
	@Test(priority=3)
	public void clickOnHealthInsurancePageTest() throws InterruptedException{
		healthinsurancepage=homepage.clickOnHealthInsurancePage();
    	Thread.sleep(3000);	

	}
	@Test(priority=4)
	
	public void clickOnLifeInsurancePageTest() throws InterruptedException{
		lifeinsurancepage=homepage.clickOnLifeInsurancePage();
    	Thread.sleep(3000);	

	}
	@Test(priority=5)
	public void clickOnTwoWheelerInsurancePageTest() throws InterruptedException{
		twowheelerinsurancepage=homepage.clickOnTwoWheelerInsurancePage();
    	Thread.sleep(3000);	

	}
	@Test(priority=6)
	public void clickOnNewsPageTest() throws InterruptedException{
		newspage=homepage.clickOnNewsPage();
    	Thread.sleep(3000);	

	}
	
}
