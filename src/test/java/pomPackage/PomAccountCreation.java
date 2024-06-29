package pomPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basepackage.BaseAmazonClass;

public class PomAccountCreation extends BaseAmazonClass {
	WebDriver driver;
	WebDriverWait wait;
	
	//object repository
	@FindBy(css="#ap_customer_name")
	WebElement Yourname;
	@FindBy(css="#ap_email")
	WebElement Mobilenumber;                
	@FindBy(css="#ap_password")
	WebElement Password;
	@FindBy(css="#ap_password_check")
	WebElement Passwordagain;
	@FindBy(css="#continue")
	WebElement Verifymobilenumber;
	
	//initiate page elements
	
	public PomAccountCreation(WebDriver driver) {
		this.driver= driver;
		this.wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		
		PageFactory.initElements(driver, this);
	}
	
	public void typeyourname(String name) {
		wait.until(ExpectedConditions.visibilityOf(Yourname));
		Yourname.sendKeys(name);
	}
	public void typemobilenumber(String mobilenumber ) {
		wait.until(ExpectedConditions.visibilityOf(Mobilenumber));
		Mobilenumber.sendKeys(mobilenumber);
	}
	public void typepassword(String password) {
		wait.until(ExpectedConditions.visibilityOf(Password));
		Password.sendKeys(password);
	}
	public void typepasswordagain(String passwordagain) {
		wait.until(ExpectedConditions.visibilityOf(Passwordagain));
		Passwordagain.sendKeys(passwordagain);
	}
	public void continuebtn() {
		wait.until(ExpectedConditions.visibilityOf(Verifymobilenumber));
		Verifymobilenumber.click();
	}
	public String verify() {
		return driver.getTitle();
		
		
	}

}
