package test;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import main.ObjectFactory;
import pageFactory.ContactUsPage;
import pageFactory.HomePage;
public class TestClass {
	ObjectFactory or;
	@Test
	public void testing1() {
		or = new ObjectFactory();
		or.getSd().openBrowser(or.getUc().readPropFile("browser"), or.getUc().readPropFile("baseUrl"));
		or.getHp();
		assertEquals(or.getHp().contactUsBtn.getText(), "Contact us");
		or.getHp().contactUsBtn.click();
		or.getCu();
		assertEquals(or.getCu().contactUsPageTitle.getText(), "CUSTOMER SERVICE - CONTACT US");
		or.getUc().closeAllBrowser();
	}
}
