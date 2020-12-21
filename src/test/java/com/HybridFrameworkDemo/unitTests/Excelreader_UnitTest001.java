package com.HybridFrameworkDemo.unitTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.HybridFrameworkDemo.helper.ExcelReader;

public class Excelreader_UnitTest001 {
	@Test
 public void checkConfig() {
	 Assert.assertTrue(new ExcelReader().GetData("Data3", 0, 0)!=null);
 }
}
