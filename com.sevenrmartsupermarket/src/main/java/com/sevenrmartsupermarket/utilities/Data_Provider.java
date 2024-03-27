package com.sevenrmartsupermarket.utilities;

import org.testng.annotations.DataProvider;

public class Data_Provider {
	Excel excel=new Excel();
	
	@DataProvider(name="excelfiles")
	
	public Object[][] exceldata() {
		excel.setExcelFile("LoginData","LoginCredentials" );
		Object data[][]=excel.getMultidimentionalData(2, 2);
		return data;
	}
	@DataProvider(name="managelocation")
	public Object[][] manageLocation() {
		excel.setExcelFile("ManageLocation", "sheet1");
		Object data[][]=excel.getMultidimentionalData(2, 2);
		return data;
	}
}
