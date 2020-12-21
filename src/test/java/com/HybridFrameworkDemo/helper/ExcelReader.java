package com.HybridFrameworkDemo.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
  
	public XSSFWorkbook wb;
	public ExcelReader() {
		try {
			wb=new XSSFWorkbook(new FileInputStream(new File(System.getProperty("user.dir") +"/TestData/AutomationData.xlsx")));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	public String GetData(String sheetname,int row,int coulmn) {
		String Data = null;
		XSSFCell cell=wb.getSheet(sheetname).getRow(row).getCell(coulmn);
		if(cell.getCellType()==CellType.STRING)
		{
			Data=cell.getStringCellValue();
		}
		else if(cell.getCellType()==CellType.NUMERIC) {
			Data=String.valueOf(cell.getNumericCellValue());
		}
		else if(cell.getCellType()==CellType.BLANK) {
			Data=" ";
		}
		return Data;
	}
	
	public  int GetRowCount(String sheetname) {
		return wb.getSheet(sheetname).getPhysicalNumberOfRows();
	}
	public int GetColumnCount(String sheetname) {
		return wb.getSheet(sheetname).getRow(0).getPhysicalNumberOfCells();
	}
}
