package com.HybridFrameworkDemo.helper;

import org.testng.annotations.DataProvider;

public class DataGenerator {
  	@DataProvider(name="LoginData")
	public Object[][] CreateData() {
  		ExcelReader excel=new ExcelReader();
		int row=excel.GetRowCount("Data3");
		int coulmn=excel.GetColumnCount("Data3");
		Object[][] arr=new Object[row][coulmn];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<coulmn;j++)
			{
				arr[i][j]=excel.GetData("Data3", i, j);
			}
		}
		return arr;
	}
   
}
