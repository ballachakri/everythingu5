package com.everything.under.five.pounds.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IterateArrayList1 {


   private ArrayList <String> simpleArrayList = new ArrayList <String> (Arrays.asList ("hello", " how", " are", " you" ," i ",  "am ", " name " ," is ", "Chakravarthy"));

    public static void main (String[] args) {

        IterateArrayList1 obj=new IterateArrayList1 ();
        obj.dispArrayList ();
        obj.retrieveWithForLoop ();
        obj.retreiveWiThEnhancedForLoop ();
        obj.retrieveWithWhileLoop ();
        obj.retrieveWithIterators ();;
    }

    public void dispArrayList() {

        System.out.println ("display array list");
        System.out.println (simpleArrayList);
    }


    public void retrieveWithForLoop()
    {
        System.out.println ("retreive with for loop");

        for(int i=0;i<simpleArrayList.size ();i++)
        {

            System.out.println (simpleArrayList.get (i));
        }
    }

    public void retreiveWiThEnhancedForLoop()
    {
        System.out.println ("retrieve with enhanced for loop");
        for( String s: simpleArrayList)
        {

            System.out.println (s);
        }
    }

    public void retrieveWithWhileLoop()
    {
        int i=0;
        System.out.println ("reteive with  while loop ");
        while(simpleArrayList.size ()>i)
        {

        System.out.println (simpleArrayList.get (i));
        i++;
        }
    }
   public void retrieveWithIterators()
   {
       System.out.println ("retrieve with Iterators");
       Iterator itr=simpleArrayList.iterator ();
       while (itr.hasNext ())
       {
           System.out.println (itr.next ());
       }
   }
}




