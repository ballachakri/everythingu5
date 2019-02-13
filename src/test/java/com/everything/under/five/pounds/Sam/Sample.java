package com.everything.under.five.pounds.Sam;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class Sample
{

   private static WebDriver d;

   private static Logger logger=Logger.getLogger (Sample.class);

    @Before
    public void setUp ( ) {
        System.setProperty ("webdriver.chrome.driver","C:\\Users\\sball\\Downloads\\chromedriver_win32\\chromedriver.exe");
        d=new ChromeDriver ();
        d.manage ().window ().maximize ();
        BasicConfigurator.configure ();

        logger.trace (" trace");
        logger.debug ("debug");
        logger.fatal ("fatal");
        logger.info (" info");
    }

@After

    public void tearDown()
    {
 //   d.quit ();
    }

@Test
public void select()
{

    d.navigate().to ("https://www.argos.co.uk/search/nike/");
    // Select sl=new Select (d.findElement (By.xpath ("//select[@class='font-standard form-control sort-select']")));

    // By Visible Text
    // sl.selectByVisibleText ("Customer Rating");

    // By Index value
    // sl.selectByIndex (0);

    // to obtain all the elements from the Select

    WebElement sort=d.findElement (By.xpath ("//select[@class='font-standard form-control sort-select']"));

    List <WebElement> sortList=sort.findElements (By.cssSelector ("option"));

     for(WebElement w: sortList)
     {
       // System.out.println (" attribute : " +w.getAttribute ("value"));
       // System.out.println (" text : " +w.getText ());
       if(w.getText ().equalsIgnoreCase ("Price: Low - High"))
       {
           w.click ();
           break;
       }

     }

}

@Test
public void dragAndDrop() throws Exception
{
    d.get ("https://jqueryui.com/droppable/");
    d.manage ().timeouts ().implicitlyWait (10, MILLISECONDS);
    // switching to frame
    d.switchTo ().frame (0);

    Actions act=new Actions (d);

    WebElement toBeMoved=d.findElement (By.id ("draggable"));
    WebElement moveTo=d.findElement (By.id ("droppable"));

    act.clickAndHold (toBeMoved).moveToElement (moveTo).release (toBeMoved).build ().perform ();

    Thread.sleep (2000);
    d.quit ();

}


public void alerts()
{
    // if the alert got exposed
    // then we have to first switch to that alert to confirm or decline

    Alert al=d.switchTo ().alert ();

    // to accept
    al.accept ();

    // to decline
    al.dismiss ();
}
}
