package com.everything.under.five.pounds;

import org.junit.After;
import org.junit.Before;

public class Hooks {

   private DriverHelper hp = new DriverHelper ();

    @Before
    public void choiceBrowser ( ) {


        hp.choiceBrowser ();
        hp.maximizeBrowser ();
        hp.navigateToHomePage ("https://www.everything5pounds.com/");
        hp.waits ();
   //     hp.killCookies ();


    }


    @After
    public void closeTheBrowser ( ) {
      hp.closeBrowser ();
    }
}
