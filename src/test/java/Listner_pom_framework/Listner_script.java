package Listner_pom_framework;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
@Listeners

public class Listner_script implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Execution Start");
	}



	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("My first test");
	}



	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("This test case is fail " + result);
	}


	
	

}
