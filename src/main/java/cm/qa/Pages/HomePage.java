package cm.qa.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(xpath="//img[@src='https://static.insurancedekho.com/pwa/img/id-main-logo.svg' and @height='32' ]")
	WebElement logo;
	
	@FindBy(xpath="//a[@href='/car-insurance' and @title='Car Insurance']//span[@class='innerSpan']")
	WebElement carinsurance;
	
	@FindBy(xpath="//a[@href='/bike-insurance' and @title='Two Wheeler Insurance']//span[@class='innerSpan']")
	WebElement twowheelerinsurance;
	
	@FindBy(xpath="//a[@href='/health-insurance' and @title='Health Insurance']//span[@class='innerSpan']")
	WebElement healthinsurance;
	
	@FindBy(xpath="//a[@href='/life-insurance' and @title='Life Insurance']//span[@class='innerSpan']")
	WebElement lifeinsurance;
	
	@FindBy(xpath="//div[@class='atagFlow']//span[@class='innerSpan']")
	WebElement newsLink;
	
	public HomePage() {
		PageFactory.initElements(d,this);
	}
	
	public String validateHomePageTitle() {
		return d.getTitle();
	}
	public boolean ValidateLogo() {
		return logo.isDisplayed();
	}
	public CarInsurancePage clickOnCarInsurancePage() {
		carinsurance.click();
		return new CarInsurancePage();
	}
	public HealthInsurancePage clickOnHealthInsurancePage() {
		healthinsurance.click();
		return new HealthInsurancePage();
	}
	public LifeInsurancePage clickOnLifeInsurancePage() {
		healthinsurance.click();
		return new LifeInsurancePage();
	}
	public TwoWheelerInsurancePage clickOnTwoWheelerInsurancePage() {
		twowheelerinsurance.click();
		return new TwoWheelerInsurancePage();
	}
	public NewsPage clickOnNewsPage() {
		newsLink.click();
		return new NewsPage();
	}
}
