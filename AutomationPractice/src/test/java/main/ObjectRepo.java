package main;

import pageFactory.ContactUsPage;
import pageFactory.HomePage;

public class ObjectRepo {
	
	private SingletonDriver sd;
	private HomePage hp;
	private UtilClass uc;
	private ContactUsPage cu;
	
	//	//another way to create object so that no new instance is created.
	//	SingletonDriver sd = SingletonDriver.getThisClassInstance();  // if we write new SingletonDriver it will create new instance of that class.
	//but doing like this we are using same  instance without creating a new one.
	
	public SingletonDriver getSd() {
		if(sd == null) {
		sd = SingletonDriver.getThisClassInstance();
		}
		return sd;
	}
	public HomePage getHp() {
		if(hp == null) {
		hp = new HomePage(SingletonDriver.getDriver());
		}
		return hp;
	}
	public UtilClass getUc() { // this will make sure not to create the object if its already created; instance same throughout.
		if(uc == null) {
		uc = new UtilClass();
		}
		return uc;
	}
	public ContactUsPage getCu() {
		if(cu == null) {
		cu = new ContactUsPage(SingletonDriver.getDriver());
		}
		return cu;
	}

}
