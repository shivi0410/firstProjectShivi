package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
// Singleton class is a class where we make sure that we pass on same instance of the object.
//Here, we will pass on same instance of driver.
//If we create a singleton driver class, what would be the limitations for the testing?
		
public class SingletonDriver {
	
	public SingletonDriver(WebDriver driver){
		SingletonDriver.driver = driver;      //because we defined WebDriver as static,therefore we will access it in static way
	}
	
	private static WebDriver driver = null ;
	private static SingletonDriver driverInstance = null;
	public static SingletonDriver getThisClassInstance() {         //creating & returning driver instance
		if(driverInstance == null) {
			driverInstance = new SingletonDriver(driver);	
		}
		return driverInstance;
	}
	public static WebDriver getDriver() {
		return driver;
	}
	
	public WebDriver openSingletonBrowser(String browser, String url) {
		
		if(driver == null) {
	
			if(browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				driver.navigate().to(url);
			}
			else if(browser.equalsIgnoreCase("edge")) {
				
				driver = new EdgeDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				driver.navigate().to(url);
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				
				driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				driver.navigate().to(url);
			}
			else {
				System.out.println("Incorrect Driver");
			}
			
		}
		return driver;
		
	}
	
public WebDriver openBrowser(String browser, String url) {	
			if(browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				driver.navigate().to(url);
			}
			else if(browser.equalsIgnoreCase("edge")) {
				
				driver = new EdgeDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				driver.navigate().to(url);
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				
				driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				driver.navigate().to(url);
			}
			else {
				System.out.println("Incorrect Driver");
			}
		return driver;	
	}

}
