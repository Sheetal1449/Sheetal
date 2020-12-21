package com.HybridFrameworkDemo.listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
   
	private static ExtentReports extent;
	public static ExtentReports getInstance()
	{
		if(extent==null)
		{
			createInstnace(System.getProperty("user.dir")+"/Reports/report"+System.currentTimeMillis()+".html");
			
		}
		return extent;
	}
	public static ExtentReports createInstnace(String Filename) {
		ExtentSparkReporter htmlReporter=new ExtentSparkReporter(Filename);
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setEncoding("Utf8");
		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName(Filename);
		
		
		extent.attachReporter(htmlReporter);
		return extent;
	}
	
	
}
