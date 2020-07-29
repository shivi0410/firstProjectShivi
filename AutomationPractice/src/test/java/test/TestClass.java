package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import main.SingletonDriver;
import main.UtilClass;

public class TestClass{
	
	
	
	SingletonDriver sd = SingletonDriver.getThisClassInstance();  // if we write new SingletonDriver it will create new instance of that class.
	UtilClass uc;                                     //but doing like this we are using same same instance without creating a new one.
	
	@Test
	public void testing1() {
		
		sd.openBrowser("chrome", "http://automationpractice.com/index.php");
		uc = new UtilClass();
		uc.closeAllBrowser();
		//driver.get("http://automationpractice.com/index.php");
		
	}

}
