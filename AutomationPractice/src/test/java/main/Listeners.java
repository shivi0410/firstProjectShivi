package main;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	ObjectFactory of = new ObjectFactory();

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Starting");
		of.getSd().openBrowser(of.getUc().readPropFile("browser"), of.getUc().readPropFile("baseUrl"));

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test successful");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failure");

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped");
		if(ITestResult.SKIP == result.getStatus()) {
			of.getUc().takeScreenshots(result.getName());
		}
		result.getStatus();
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test success percentage");

	}


	@Override
	public void onStart(ITestContext context) {
		System.out.println("on start");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("on finish");
		of.getUc().closeAllBrowser();
	}


}
