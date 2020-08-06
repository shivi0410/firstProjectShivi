package main;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class UtilClass {


	SingletonDriver sd = SingletonDriver.getThisClassInstance();    // sd is object for class SingletonDriver, it holds the memory of it
	                                                                                          //as soon as we run it, we activate it & instantiate it
	WebDriver driver = sd.getDriver();

	public void closeCurrentBrowser() {
		driver.close();
	}
	
	public String getTitle() {
		
		return driver.getTitle();
		
	}

	public void closeAllBrowser() {
		driver.quit();
	}

	public void refreshPage() {
		driver.navigate().refresh();
	}

	public void back() {
		driver.navigate().back();
	}

	public void forward() {
		driver.navigate().forward();
	}

	public void goToUrl(String url) {
		driver.get(url);
	}

	public void navigateToUrl(String url) {
		driver.navigate().to(url);
	}
	
	public String getText(String xpath) {
		
		return driver.findElement(By.xpath(xpath)).getText();
	}
	
public String getAttribute(String xpath, String value) {
		
		return driver.findElement(By.xpath(xpath)).getAttribute(value);
	}

	public void validateText(String xpath, String expected){

		String actual = driver.findElement(By.xpath(xpath)).getText();

		if(expected.equals(actual)){

			System.out.println("Text Matches, Test Passed");
		}
		else {

			System.out.println("Text Doesnt Match, Test Failed");
		}

	}

	public void negativeValidateText(String xpath, String expected){

		String actual = driver.findElement(By.xpath(xpath)).getText();

		if(expected.equals(actual)){

			System.out.println("Text Matches, Test failed");
		}
		else {

			System.out.println("Text Doesnt Match, Test Passed");
		}

	}
	
	public void validateAttribute(String xpath, String expected, String value){

		String actual = driver.findElement(By.xpath(xpath)).getAttribute(value);

		if(expected.equals(actual)){

			System.out.println("Attribute Matches, Test Passed");
		}
		else {

			System.out.println("Attribute Doesnt Match, Test Failed");
		}

	}
	
	public void takeScreenshot(String testName) {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  //File has link to your directory
		try {
			File local = new File(new File("Screenshots"), "bugs");
			File dest = new File(local, testName );
			Files.copy(src, dest);
		}
		catch(Exception e) {
			System.out.println("Unable to take screenshot");	
		}
	}
	
	public void takeScreenshots(String a) {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			//FileUtils.copyFile(src, new File("C:\\Users\\SHIVI\\Desktop\\Multicart\\" + a +".jpg"));       need apacheCommons IO dependency
			
			Files.copy(src, new File("C:\\Users\\SHIVI\\Desktop\\Multicart\\" + a +".jpg"));                   // provided by java
		}
		catch(Exception e) {
			System.out.println("Unable to take screenshot");	
		}
	}
	public void takeScreenshots(String a, String path) {             // method overloading
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			//FileUtils.copyFile(src, new File("C:\\Users\\SHIVI\\Desktop\\Multicart\\" + a +".jpg"));       need apacheCommons IO dependency
			
			Files.copy(src, new File(path + a +".jpg"));                   // provided by java
		}
		catch(Exception e) {
			System.out.println("Unable to take screenshot");	
		}
	}
	
	public void highlightElement(String xpath) {
		
		WebElement highlight = driver.findElement(By.xpath(xpath));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: solid 5px blue')", highlight);
		
	}
	
	public void unHighlightElement(String xpath) {
		
		WebElement highlight = driver.findElement(By.xpath(xpath));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: white; border: solid 5px white')", highlight);
		
	}
	
	public void sleep(int sec) throws InterruptedException {
		
		Thread.sleep(sec);
	}
	
	public Select selectDropDown(String xpath) {
		
		WebElement element = driver.findElement(By.xpath(xpath));
		Select select = new Select(element);
		return select;
	}
	
	public void selectDropDown(String xpath, int index) {
		
		WebElement element = driver.findElement(By.xpath(xpath));
		
		Select select = new Select(element);
		select.selectByIndex(index);	
	}
	
	public void selectDropDown(String xpath, String text) {
		
		WebElement element = driver.findElement(By.xpath(xpath));
		
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	public void clickElement(String xpath) {
		
		driver.findElement(By.xpath("//a[@ title = 'Contact Us']")).click();
	}
	

}

















