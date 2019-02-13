package com.everything.under.five.pounds.Loops;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Java_Do_While {

    public static void main (String[] args) {
// simple do_while loop
        int ent_number;

        System.out.print (" enter a number for times table :");

        Scanner inp = new Scanner (System.in);

        ent_number = inp.nextInt ();


        int i = 1;
        do {
            System.out.println (ent_number + " X " + i + " = " + ent_number * i);
            i++;
        } while (i <= 10);


//        sample ();
//        rev();
//
//        ran ();

add ();
    }


    public static void sample ( ) {

        for (int i = 1; i <= 10; i++) {
            System.out.println (i);
        }
    }
    public static void rev ()
        {
           char[] c={'h','e','l','l','o'};

            String str1 = "chakravarthy";
            Scanner inpTxt = new Scanner (System.in);
            System.out.println ( "enter  a string   : ");
            String str2=inpTxt.nextLine ();
            System.out.println (str2);
            System.out.println (c);
            System.out.println ("Size of the string " + str1.length ());

            String revString = reverseString(str1);
            System.out.println ( revString);


        }
public static String reverseString(String str1 )
 {
     if(str1.isEmpty ())
       return str1;

      return reverseString (str1.substring (1))+str1.charAt (0);
 }

 public static void ran()
 {
     Random rn=new Random ();
     System.out.println (rn.nextInt (25));
 }


 public static void add()
 {
     System.out.print (" enter the first number   : ");
     Scanner infnum=new Scanner (System.in);
     int a= infnum.nextInt();
     System.out.print (" enter the second number   : ");
     Scanner insnum=new Scanner (System.in);
     int b=insnum.nextInt ();
     int c=a+b;
     System.out.println (" sum of two number "+ c);

 }

}

