package com.mindtree.utility;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtentReport {

	
	public static ExtentReports generateReport()  {
		ExtentReports report = new ExtentReports();	
		try {
			
			ExtentHtmlReporter htmlReporter =new ExtentHtmlReporter(".\\report\\extenthtmlreport.html");
			report.attachReporter(htmlReporter);
			
			return report;}
			catch(Exception c) {
				System.out.println("Extent Report could not be created");
				return report;
			}
			
	}

}
