package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import main.SingletonDriver;

public class ContactUsPage {
	
	public ContactUsPage(WebDriver driver) {

		driver = SingletonDriver.getDriver();
		PageFactory.initElements(driver, this);  //where it will initialize the driver where it is called, this represents for this particular page
	}

	@FindBy(xpath = "//h1[@class='page-heading bottom-indent']")
	public WebElement contactUsPageTitle;
		
	@FindBy(xpath = "//a[@class='login']")
	public WebElement signInBtn;
	
}
