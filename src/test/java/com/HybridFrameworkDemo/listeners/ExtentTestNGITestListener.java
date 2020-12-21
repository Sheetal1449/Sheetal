package com.HybridFrameworkDemo.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentTestNGITestListener implements ITestListener {
	ExtentReports extent=ExtentManager.getInstance();
	ExtentTest child;
	ThreadLocal<ExtentTest> parentTest=new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {
		parentTest.set(extent.createTest(result.getMethod().getMethodName()));
		
	}

	public void onTestSuccess(ITestResult result) {
		parentTest.get().pass("Test Completed");
		
	}

	public void onTestFailure(ITestResult result) {
		parentTest.get().fail("test failed");
		
	}

	public void onTestSkipped(ITestResult result) {
		parentTest.get().skip("test Skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		extent.flush();
		
	}

}
