package com.everything.under.five.pounds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class DriverHelper {


    public static WebDriver dr;

    private String brow = "";

    public void choiceBrowser ( ) {

        switch (brow) {

            case "chrome":

                System.setProperty ("webdriver.chrome.driver", "C:\\Users\\sball\\Downloads\\chromedriver_win32\\chromedriver.exe");
                dr=new ChromeDriver ();
                break;

            case "ie":
                System.setProperty ("webdriver.ie.driver", "C:\\Users\\sball\\Downloads\\microsoftwebdriver.exe");
                dr = new InternetExplorerDriver ();
                break;

            case "safari":
                dr = new SafariDriver ();
                break;

            default:
                System.setProperty ("webdriver.gecko.driver", "C:\\Users\\sball\\Downloads\\geckodriver-v0.22.0-win64\\geckodriver.exe");
                FirefoxOptions options = new FirefoxOptions ().setProfile (new FirefoxProfile ());
                dr = new FirefoxDriver ();
                break;

        }
    }

    public void navigateToHomePage (String url) {
        dr.get (url);
    }


    public void maximizeBrowser ( ) {
        dr.manage ().window ().maximize ();
    }


    public void killCookies ( ) {
        dr.findElement (By.xpath ("//button[@class='inner-element']")).click ();

    }

    public void waits ( ) {
        dr.manage ().timeouts ().implicitlyWait (10, TimeUnit.MILLISECONDS);
    }

    public void closeBrowser ( ) {
        dr.quit ();
    }


}
