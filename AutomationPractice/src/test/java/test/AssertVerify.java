package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertVerify {
	
	@Test
	public void hardAssert()
	{
		
		System.out.println("Step 1");
		assertEquals(true, true);
		
		System.out.println("Step 2");
		assertEquals("ss", "ss");
		
		System.out.println("Step 3");
		assertEquals(true, false);
		System.out.println("Step 4");
		
	}
	
	@Test
	public void softAssert()
	{
		SoftAssert sa = new SoftAssert();
		System.out.println("Step 1");
		sa.assertEquals(true, true);
		
		System.out.println("Step 2");
		sa.assertEquals("ss", "ss");
		
		System.out.println("Step 3");
		sa.assertEquals(true, false);
		System.out.println("Step 4");
		
		sa.assertAll();
	
}
}
