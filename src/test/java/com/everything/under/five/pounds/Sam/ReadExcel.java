package com.everything.under.five.pounds.Sam;


import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class ReadExcel {

    File src;
    FileInputStream inputStream;
    HSSFWorkbook book;
    HSSFSheet sheet;

    public ReadExcel() throws Exception{

       inputStream = new FileInputStream (src);
       book = new HSSFWorkbook (inputStream);
       sheet = book.getSheetAt (0);
    }
    public static void main (String[] args)  throws Exception{

        ReadExcel obj=new ReadExcel ();
       // obj.excelRead1 ();
        obj.excelReadcol1 ();
        obj.excelReadcol2 ();
    }
 public void excelRead1()
 {
     System.out.println (sheet.getRow (0).getCell (0));
     System.out.println (sheet.getRow (1).getCell (0));
     System.out.println (sheet.getRow (1).getCell (1));
     System.out.println (sheet.getRow (11).getCell (1));
 }

 public void excelReadcol1()
 {
  ArrayList<Double> col1=new ArrayList <Double> ();
     Iterator<Row> rows=sheet.iterator ();

     // if have the header to skip first row write code here.
     //  write rows.next();

          while (rows.hasNext ())
          {
            //System.out.println (rows.next ().getCell (0));
            col1.add (rows.next ().getCell (0).getNumericCellValue ());

                     }
     System.out.println (col1);
     }
public void excelReadcol2()
{
    ArrayList<String> col2=new ArrayList <String> ();

    Iterator<Row> rws=sheet.iterator ();
        while (rws.hasNext ())
        {
        //System.out.println (rws.next ().getCell (1).getStringCellValue ());
        col2.add (rws.next ().getCell (1).getStringCellValue ());

       }
    System.out.println (col2);
  }



}





