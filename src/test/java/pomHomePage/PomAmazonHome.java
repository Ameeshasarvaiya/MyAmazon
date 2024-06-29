package pomHomePage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basepackage.BaseAmazonClass;

public class PomAmazonHome extends BaseAmazonClass {
	
	WebDriver driver;
	WebDriverWait wait;
	
	//object repository
	@FindBy(css="#twotabsearchtextbox")
	WebElement searchbox;
	@FindBy(css="#nav-search-submit-button")
	WebElement searchbutton;
	
	
	//initiate page elements
	
		public PomAmazonHome(WebDriver driver) {
			this.driver= driver;
			this.wait= new WebDriverWait(driver,Duration.ofSeconds(10));
			
			PageFactory.initElements(driver, this);
		}
		
		public void searchProduct (String productname) {
			wait.until(ExpectedConditions.visibilityOf(searchbox));
			searchbox.sendKeys(productname);
			searchbutton.click();
		}
		

}
