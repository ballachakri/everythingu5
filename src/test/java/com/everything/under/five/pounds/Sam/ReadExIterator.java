package com.everything.under.five.pounds.Sam;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class ReadExIterator {

GetDataFromExl getData=new GetDataFromExl ();

private static WebDriver exldr;

    @Before
    public void openBrows()
    {
        System.setProperty ("webdriver.chrome.driver","C:\\Users\\sball\\Downloads\\chromedriver_win32\\chromedriver.exe");
        exldr=new ChromeDriver ();
        exldr.manage ().window ().maximize ();

    }
   @Test
   public void login() throws IOException, InterruptedException {
     //   declare ArrayList to get column 1 data
       ArrayList <String> getCol1 = new ArrayList <String> ();
     //   declare ArrayList to get column 2 data
       ArrayList <String> getCol2 = new ArrayList <String> ();

       exldr.get ("https://www.everything5pounds.com/en/login");
    // get data from column1
       getCol1 = getData.getcol1 ();
    // get data from column2
       getCol2 = getData.getcol2 ();

       WebElement uidtxt = exldr.findElement (By.id ("j_username"));

       WebElement pwdtxt = exldr.findElement (By.id ("j_password"));
    // use for to till size of array and sent data from index 0
       for (int i = 0; i <= getCol1.size (); i++) {
           uidtxt.sendKeys (getCol1.get (i));
           exldr.manage ().timeouts ().implicitlyWait (5, TimeUnit.SECONDS);
           uidtxt.clear ();

           pwdtxt.sendKeys (getCol2.get (i));
           exldr.manage ().timeouts ().implicitlyWait (5, TimeUnit.SECONDS);
           uidtxt.clear ();

       }
   }
@Test
public void loginParameters() throws IOException {

    // similar to above method but this parameterized and code reusability.

    ArrayList <String> collist1 = new ArrayList <String> ();
    ArrayList <String> collist2 = new ArrayList <String> ();

    collist1 = getData.addExcelData (0);
    collist2 = getData.addExcelData (1);

    exldr.get ("https://www.everything5pounds.com/en/login");

    WebElement uidtxt = exldr.findElement (By.id ("j_username"));
    WebElement pwdtxt = exldr.findElement (By.id ("j_password"));

    for (int i = 0; i <= collist1.size ();i++)
    {
        uidtxt.sendKeys (collist1.get (i));
        exldr.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);
        uidtxt.clear ();

        pwdtxt.sendKeys (collist2.get (i));
        exldr.manage ().timeouts ().implicitlyWait (10,TimeUnit.SECONDS);
        pwdtxt.clear ();

    }
    exldr.quit ();

}


    @After
    public void close()
    {
//    exldr.quit ();
    }


}
