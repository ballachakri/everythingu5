package com.everything.under.five.pounds;

import org.openqa.selenium.By;

public class ResultsPage extends DriverHelper{


    public String getUrl ( ) {
    String curl = dr.getCurrentUrl ();
    return curl;
    }
    public String getSearchedItem()
    {
    String itemsearched=dr.findElement (By.xpath ("//h1[@class='search-page__title top_scroll_position']")).getText ();
    return itemsearched;

    }
}
