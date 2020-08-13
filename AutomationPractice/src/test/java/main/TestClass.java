package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import main.SingletonDriver;

public class TestClass{
	
	SingletonDriver sd = SingletonDriver.getThisClassInstance();  // if we write new SingletonDriver it will create new instance of that class.
	                                                                                                    //but doing like this we are using same same instance without creating a new one.
	
	@Test
	public void testing1() {
		
		sd.openBrowser("chrome", "http://automationpractice.com/index.php");
		//driver.get("http://automationpractice.com/index.php");
		
	}

}
