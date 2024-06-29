package testlayerHome;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.BaseAmazonClass;
import pomHomePage.PomAmazonHome;


public class AmazonHomepage extends BaseAmazonClass{
	PomAmazonHome  home;
	
	public AmazonHomepage() {
		super();
	}
	
	@BeforeMethod
	public void initialsetup() {
		initiation();
		
		home=new PomAmazonHome(driver);
	}
	@Test
	public void testSearchProduct() {
		driver.get("https://www.amazon.ca/");
		
		//Search for a product
		home.searchProduct("t-shirt women");
	}
	
		
		
	
		
	
}
