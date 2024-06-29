package testlayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.BaseAmazonClass;
import pomPackage.PomAccountCreation;

public class AccountCreationTest extends BaseAmazonClass{
	PomAccountCreation Pom;
	
	public AccountCreationTest() {
		super();
	}
	
	@BeforeMethod
	public void initialsetup() {
		initiation();
		
		Pom=new PomAccountCreation(driver);
	
	}
	@Test
	public void Title() {
		String actual=Pom.verify();
		System.out.println(actual);
		Assert.assertEquals(actual, "Amazon.ca");
	}
	@Test
	public void PomAccountCreation() throws InterruptedException {
		Pom.typeyourname(prop.getProperty("YourName"));
		Thread.sleep(1000);
		
		Pom.typemobilenumber(prop.getProperty("Mobilenumber"));
		Thread.sleep(1000);
		
		Pom.typepassword(prop.getProperty("Password"));
		Thread.sleep(1000);
		
		Pom.typepasswordagain(prop.getProperty("Passwordagain"));
		Thread.sleep(1000);
		
		Pom.continuebtn();
		/*
		 * try { Thread.sleep(5000); }catch (InterruptedException e) {
		 * e.printStackTrace(); } String actual=Pom.verify();
		 * Assert.assertEquals(actual, "Amazon Registration");
		 */
	}
	
	
    @AfterMethod
    public void close() {
    	driver.close();
    }
    	
    }

