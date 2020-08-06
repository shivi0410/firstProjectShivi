package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import main.ObjectRepo;
import main.SingletonDriver;
import main.UtilClass;
import pageFactory.ContactUsPage;
import pageFactory.HomePage;

public class TestClass {

	ObjectRepo or;
	
	@Test
	public void testing1() {

		or = new ObjectRepo();
		or.getSd().openBrowser("chrome", "http://automationpractice.com/index.php");
		or.getHp();
		assertEquals(HomePage.contactUsBtn.getText(), "Contact us");
		HomePage.contactUsBtn.click();
		or.getCu();
		assertEquals(ContactUsPage.contactUsPageTitle.getText(), "CUSTOMER SERVICE - CONTACT US");
		or.getUc().closeAllBrowser();

	}

}
