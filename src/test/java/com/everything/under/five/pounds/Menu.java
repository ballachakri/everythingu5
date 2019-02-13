package com.everything.under.five.pounds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Menu extends DriverHelper
{
public void mainMenu()
   {
    List <WebElement> menuList=dr.findElements (By.xpath ("//div[@class='slide-menu']"));
    for(WebElement menu: menuList)
    {
        System.out.println (menu.getText ());
        System.out.println (menu.getAttribute ("value"));


    }
}
}
