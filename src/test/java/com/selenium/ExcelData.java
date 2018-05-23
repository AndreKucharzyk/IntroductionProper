package com.selenium;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelData {

    public static void main(String[] args) {

        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream("C:\\Selenium\\Projects\\IntroductionProper_21_05\\IntroductionProper\\src\\test\\java\\testData\\ProperBook.xls");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        HSSFWorkbook hssfWorkbook = null;

        try {
            hssfWorkbook = new HSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        HSSFSheet hssfSheet = hssfWorkbook.getSheet("boolean");
        HSSFRow hssfRow = hssfSheet.getRow(0);
        HSSFCell hssfCell = hssfRow.getCell(0);
        Boolean cell = hssfCell.getBooleanCellValue();

        System.out.println(cell);
    }
}