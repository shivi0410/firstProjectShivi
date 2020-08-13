package hooks;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import main.ObjectFactory;
public class HomepageHook {
	
	public ObjectFactory of = new ObjectFactory();
	public SoftAssert sa;
	
	@BeforeClass
	public void setup() {
		of.getSd().openBrowser(of.getUc().readPropFile("browser"), of.getUc().readPropFile("baseUrl"));
	}
	@AfterClass
	public void tearDown() {
		of.getUc().closeAllBrowser();
	}

}
