package com.everything.under.five.pounds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Sort extends DriverHelper{

    public void sortByAll()
    {
        List <WebElement> filterByAll=dr.findElements (By.xpath ("//div[@class='mob-facet-content']"));

        for(WebElement f: filterByAll)
        {
            System.out.println (f.getText ());
        }
    }


    public void filterByDepartment()
    {
        List <WebElement> depList=dr.findElements (By.xpath ("//div[@class='body.page-search.pageType-ContentPage.template-pages-search-searchGridPage.pageLabel-search.language-en:nth-child(2) div.page:nth-child(8) div.page__wrapper:nth-child(1) div.page__main-content:nth-child(1) div.page-container div.container.main-content div.clearfix:nth-child(2) div.productsGrid-content.row.ng-scope:nth-child(4) div.facetNavigation.col-sm-3.col-xs-12.ng-scope div.facetNavigation:nth-child(2) div.fixBlock div.fix-content div.mob-facet-content div.server-facets.ng-scope div.facet:nth-child(1) div.facetValues div.allFacetValues > ul.facet_block']"));

                for(WebElement d: depList)
                {
                 System.out.println (d.getText ());

                }
    }
}
