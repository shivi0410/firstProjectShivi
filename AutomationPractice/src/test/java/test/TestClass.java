package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass{
	
	WebDriver driver;
	
	@Test
	public void testing1() {
		
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
	}

}
