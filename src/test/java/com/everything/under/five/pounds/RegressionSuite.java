package com.everything.under.five.pounds;


import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class RegressionSuite extends Hooks{

private SearchPage spage=new SearchPage ();
private ResultsPage rpage=new ResultsPage ();
private Sort st=new Sort();
private Menu se=new Menu ();

@Test
    public void urlTest()
    {
       String url= rpage.getUrl ();

       assertThat ("not on the home page",url,endsWith (".com/"));
        System.out.println (url);
    }
@Test
    public void searchTheProduct()
    {
     spage.mySearch ("shirts");
     String txt=rpage.getSearchedItem ().replace ("You searched for ","");
     assertThat (" wrong item searched ",txt,containsString ("shirts"));

    }
@Test
public void sort()
{
    spage.mySearch ("shirts");
   // st.sortByAll ();
    st.filterByDepartment ();
}

@Test
public void SelectMenu()
{
    se.mainMenu ();
}
}
