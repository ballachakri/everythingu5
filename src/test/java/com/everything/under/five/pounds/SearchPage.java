package com.everything.under.five.pounds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPage extends DriverHelper {

    public void mySearch(String product)
    {
        WebElement ele=dr.findElement (By.xpath ("//input[@id='input_SearchBox']"));
        ele.sendKeys (product);
        dr.findElement (By.xpath ("//button[@class='siteSearchSubmit']")).click ();
    }




}
