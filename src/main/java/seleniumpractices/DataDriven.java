package seleniumpractices;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class DataDriven {
    public static void main(String[] args) throws IOException {
        FileInputStream file=new FileInputStream("C:\\Users\\91863\\Desktop\\Book1.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(file);
        XSSFSheet sheet=workbook.getSheet("test");
        int row=sheet.getLastRowNum();
        int column=sheet.getRow(0).getLastCellNum();
        for(int i=1;i<row;i++) {
            XSSFRow currentrow=sheet.getRow(i);
            for(int j=1;j<column;j++) {
                String s= currentrow.getCell(j).toString();
                System.out.println(s);
            }
            System.out.println();
        }
}}
