package com.everything.under.five.pounds.Sam;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class GetDataFromExl {

    // to obtain data from column1

    public ArrayList<String> getcol1() throws IOException {

        FileInputStream instm=new FileInputStream ("C:\\Users\\sball\\Desktop\\testdatalogin.xls");
        HSSFWorkbook bk=new HSSFWorkbook (instm );
        HSSFSheet sh=bk.getSheetAt (0);

        Iterator <Row> rw= sh.iterator ();

        ArrayList<String> uid=new ArrayList <String> ();

        while(rw.hasNext ())
        {
         uid.add (rw.next ().getCell (0).getStringCellValue ());

        }
        return uid;
    }

    // to obtain data from column2
    public ArrayList<String> getcol2() throws IOException {

        FileInputStream ipst=new FileInputStream ("C:\\Users\\sball\\Desktop\\testdatalogin.xls");
        HSSFWorkbook book=new HSSFWorkbook ((ipst));
        HSSFSheet sheet=book.getSheetAt (0);
        Iterator<Row> rw2=sheet.iterator ();

        ArrayList<String> pwd=new ArrayList <String> ();
        while(rw2.hasNext ())
        {
            pwd.add (rw2.next ().getCell (1).getStringCellValue ());
        }
        return pwd;
    }
  // to obtain all excel data passing column number as arguments
    public ArrayList<String> addExcelData(int colNumber ) throws IOException {
        FileInputStream inpstm=new FileInputStream ("C:\\Users\\sball\\Desktop\\testdatalogin.xls");
        HSSFWorkbook book=new HSSFWorkbook (inpstm);
        HSSFSheet sheet=book.getSheetAt (0);
        ArrayList<String> coldata=new ArrayList <String> ();
        Iterator<Row> rows=sheet.iterator ();
        while (rows.hasNext ())
        {
            coldata.add (rows.next ().getCell (colNumber).getStringCellValue ());
        }
        return coldata;
    }

}
