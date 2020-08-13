package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import main.SingletonDriver;

public class HomePage {

	public HomePage(WebDriver driver) {

		driver = SingletonDriver.getDriver();
		PageFactory.initElements(driver, this);  //where it will initialize the driver where it is called, this represents for this particular page
	}

	@FindBy(xpath = "//a[@title = 'Contact Us']")
	public  WebElement contactUsBtn;

	@FindBy(xpath = "//a[@class='login']")
	public WebElement signInBtn;

	@FindBy(xpath="//body/div/div/header/div/div/div/div/ul/li[2]/a[1]")
	public WebElement dressBtn;	
}
