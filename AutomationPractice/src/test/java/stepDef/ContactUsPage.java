package stepDef;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.ObjectFactory;

public class ContactUsPage {
	ObjectFactory of  = new ObjectFactory();
	
	@Given("I open {string} & go to baseUrl")
	public void i_open_go_to_base_url(String browser) {
		of.getSd().openBrowser(browser, of.getUc().readPropFile("baseUrl"));
	}
	
	@Given("I open browser & go to baseUrl")
	public void i_open_browser_go_to_base_url() {
		of.getSd().openBrowser(of.getUc().readPropFile("browser"), of.getUc().readPropFile("baseUrl"));
	}

	@Then("I verify contact us button")
	public void i_verify_contact_us_button() {
		assertEquals(of.getHp().contactUsBtn.getText(), "Contact us");
	}

	@When("I click contact us button")
	public void i_click_contact_us_button() {
		of.getHp().contactUsBtn.click();
	}

	@Then("I verify contact us page title")
	public void i_verify_contact_us_page_title() {
	   assertEquals(of.getCu().contactUsPageTitle.getText(), "CUSTOMER SERVICE - CONTACT US");
	    
	}


}
