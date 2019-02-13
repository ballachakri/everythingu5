package com.everything.under.five.pounds.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArrayList {

    public static void main (String[] args) {

        ArrayList <String> countryList =new ArrayList <String> (Arrays.asList ("India","Pakistan","Germany","Canada","UK","China"));

        //  before sorting the ArrayList

        System.out.println (" before sorting");
        System.out.println ("@@@@@@@@@@@@@@@@@@@@@@@@@");
        for (int i=0;i<countryList.size ();i++)
        {
            System.out.println (countryList.get (i));
        }


     // After sorting in ascending order using Collections.sort(arraylist) method
       Collections.sort (countryList);
        System.out.println ("After sorting in ascending order");
        System.out.println ("@@@@@@@@@@@@@@@@@@@@@@@@@");
        for(String s: countryList)
        {
            System.out.println (s);
        }

     // After sorting in descending order
        System.out.println ("After sorting in descending  order");
        System.out.println ("@@@@@@@@@@@@@@@@@@@@@@@@@");

        Collections.sort (countryList,Collections.reverseOrder ());
        for (String s1: countryList)
        {
            System.out.println (s1);
        }
    }

}
