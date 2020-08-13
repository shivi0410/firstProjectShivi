package test;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import hooks.HomepageHook;
public class ReadPropFile extends HomepageHook{
	String actual, expected;
	@Test(priority = 1)
	public void homepageTest() {
		sa = new SoftAssert();
		actual = of.getUc().getTitle();
		expected ="HomePage";
		sa.assertEquals(actual, expected);
		sa.assertAll();
	}
	@Test(priority = 2, groups = {"Smoke", "Regression"})
	public void dressTest() {
		sa = new SoftAssert();
		of.getHp().dressBtn.click();
		actual = of.getUc().getTitle();
		expected ="Dresses - My Store";
		sa.assertEquals(actual, expected);
		sa.assertAll();
	}
	@Test(priority = 3, groups = {"Smoke", "Regression"})
	public void multipleElementCheck() {
		sa = new SoftAssert();
		of.getHp().dressBtn.click();
		actual = of.getUc().getTitle();
		expected ="Dresses - My Store";
		sa.assertEquals(actual, expected);
		List listOfCheckBox = of.getDp().multipleCheckboxes;
		int size = listOfCheckBox.size();
		System.out.println(size);
		boolean checked;
		for(int i = 0;i<size;i++) {
			checked = of.getDp().multipleCheckboxes.get(i).isSelected();
			if(!checked) {
				of.getDp().multipleCheckboxes.get(i).click();
			}
		}
		sa.assertAll();
	}
}

























