package org.mav;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Maven {
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\gange\\eclipse-workspace\\Maven\\Excel\\New Microsoft Excel Worksheet.xlsx");
		
		FileInputStream stream=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(stream);
		
	    Sheet s = w.getSheet("Sheet2");
	    
	    Row r = s.getRow(5);
	    
	    Cell c = r.getCell(5);
	    
	    System.out.println(c);
	    
		
		
	}

}
