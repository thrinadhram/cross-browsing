package com.annotations;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Iterator;

public class DataDriven {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\91863\\Desktop\\Book1.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        int sheets = workbook.getNumberOfSheets();
        System.out.println(sheets);
        for (int i = 0; i < sheets; i++) {
            if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
                XSSFSheet sheet = workbook.getSheetAt(i);
                Iterator<Row> row = sheet.iterator();
                Row firstrow = row.next();
                Iterator<Cell> ce = firstrow.iterator();
                int k = 0;
                int column = 0;
                while (ce.hasNext()) {
                    Cell value = ce.next();
                    if (value.getStringCellValue().equalsIgnoreCase("DATA2")) {
                        column++;
                    }
                    k++;
                }
                System.out.println(column);
                while (row.hasNext()) {
                    Row r = row.next();
                    if (r.getCell(column).getStringCellValue().equalsIgnoreCase("purchase")) {
                        Iterator<Cell> cr = r.cellIterator();
                        while (cr.hasNext()) {
                            System.out.println(cr.next().getStringCellValue());

                        }
                    }
                }
            }

        //return a;
    }

}}

