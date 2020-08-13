package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import main.SingletonDriver;

public class DressPage {
	public DressPage(WebDriver driver) {

		driver = SingletonDriver.getDriver();
		PageFactory.initElements(driver, this);  //where it will initialize the driver where it is called, this represents for this particular page
	}

	@FindBy(xpath = "//input[@type = 'checkbox']")
	public List<WebElement> multipleCheckboxes;

}
