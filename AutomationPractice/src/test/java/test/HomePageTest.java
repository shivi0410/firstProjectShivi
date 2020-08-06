package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import main.SingletonDriver;
import main.UtilClass;

public class HomePageTest {
	
	SingletonDriver sd;
	UtilClass uc ;
	
	@BeforeMethod
	public void setUp() {
		sd = SingletonDriver.getThisClassInstance();
		sd.openBrowser("chrome", "http://automationpractice.com/index.php");
		uc = new UtilClass();
	}
	
	@AfterMethod
	public void tearDown() {
		uc.closeAllBrowser();
	}
	
	@Test
	public void homePageCheck() throws InterruptedException {
		
		
		//assertEquals(uc.getTitle(), "My Store");	
		
		uc.sleep(2000);
		uc.highlightElement("//a[@title = 'Women']");
		
		uc.sleep(2000);
		uc.highlightElement("//ul//li[3]//a[@title = 'T-shirts']");
		
		uc.takeScreenshots("1");
		
	}
	
	//@Test
	public void contactBoxCheck() {
		//a[@title = 'Women']
		//li//li[2]//a[@title = 'Dresses']
		//ul//li[3]//a[@title = 'T-shirts']
		assertEquals(uc.getText("//a[@title = 'Contact Us']"), "Contact us");
		
	}
	
	@Test
	public void contactUsDropdown() throws InterruptedException {
		
		uc.clickElement("//a[@ title = 'Contact Us']");
		uc.sleep(2000);
		uc.selectDropDown("//select[@id = 'id_contact']", 2);
		uc.sleep(2000);
		uc.selectDropDown("//select[@id = 'id_contact']", "Customer service");
		uc.sleep(2000);
		uc.selectDropDown("//select[@id = 'id_contact']").selectByValue("0");
	}

}
