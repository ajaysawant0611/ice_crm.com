/*package TestNgAnnotations;


import java.io.FileInputStream;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excelltest {
@DataProvider
public Object [][] getTestData() {
	FileInputStream inputfile= new FileInputStream();
	String filePath="D:/AJAY/Testdata.xlsx";
	String SheetName="Sheet1";
	return inputfile.getExcelData(filePath, SheetName);
}
@Test(dataProvider="getTestData")
public void test(String username, String password) {
	System.out.println(username + "  " + password);
}
}
*/