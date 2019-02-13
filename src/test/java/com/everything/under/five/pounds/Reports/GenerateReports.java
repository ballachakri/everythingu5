package com.everything.under.five.pounds.Reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GenerateReports {

  ExtentHtmlReporter hmtlReporter;

  ExtentReports extent;

  ExtentTest test;


    public void intializeReports()
    {
        hmtlReporter=new ExtentHtmlReporter (System.getProperty ("user.dir")+"\\e5p_reports\\rpt.html");
        extent=new ExtentReports ();
        extent.attachReporter (hmtlReporter);

        extent.setSystemInfo ("OS","Windows");
        extent.setSystemInfo ("environemnt", "QA");
        extent.setSystemInfo ("user","chakra");

        hmtlReporter.config ().setDocumentTitle (" my first extent report");
        hmtlReporter.config ().setTheme (Theme.STANDARD);

        test =extent.createTest ("SAMPLE REPORT");



    }

   public void endReport()
   {
       extent.flush ();


   }
}
