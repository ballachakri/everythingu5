package com.everything.under.five.pounds.Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {

    ArrayList <String> alist=new ArrayList<String>();

    ArrayList<Integer> ilist=new ArrayList <Integer>();


    public static void main (String[] args) {
        ArrayList1 aobj=new ArrayList1 ();

        aobj.addToArrayList ();


        aobj.initArray ();
    }
    public void addToArrayList()
    {
        alist.add("Ram");
        alist.add ("shaam");
        alist.add (0,"Chakra");
        System.out.println (alist);
        alist.add("Ganesh");
        alist.add ("Rajesh");

        System.out.println (alist);

        ilist.add (1);
        ilist.add (2);
        ilist.add (3);
        ilist.add (4);
        ilist.add (5);
        ilist.add (6);
        ilist.add (7);
        ilist.add (8);
        System.out.println (" size of ilsit " + ilist.size ());
        System.out.println (ilist);

        ilist.clear ();

        System.out.println (ilist);

            }

            public void initArray() {
            ArrayList <String> initArrayList = new ArrayList <String> (Arrays.asList ("hello", " how", " are", " you"));
                System.out.println (initArrayList);
            }


}
