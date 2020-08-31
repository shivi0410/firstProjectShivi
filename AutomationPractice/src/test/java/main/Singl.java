package main;

import org.openqa.selenium.WebDriver;

public class Singl {
	
	private WebDriver driver;
 private static Singl singleton_instance = null;
 
 private Singl(WebDriver driver) {
	 this.driver = driver;
 }
 
 public static Singl getInstance() {
	 
	 if(singleton_instance ==null) {
		 singleton_instance = new Singl(driver);	 
	 }
	 return singleton_instance;
	 
 }
 
	
	
}
