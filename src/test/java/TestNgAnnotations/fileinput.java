/*package TestNgAnnotations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.function.Predicate;

import org.apache.jcp.xml.dsig.internal.dom.DOMXMLObject;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell ;
import org.apache.poi.ss.usermodel.CellType;

public class fileinput {
	private Workbook workbook;
	private Sheet sheet;
	
     public Object[][] getExcelData(String filePath, String SheetName)
	{
		try {
			FileInputStream inputStream=new FileInputStream(filePath);
			String extension =filePath.substring(filePath.indexOf(".")+1);
			System.out.println(extension);
			if (extension.equals("xlsx"))
			{
				workbook=new XSSFWorkbook(inputStream);
			}else
			{
				workbook = new HSSFWorkbook(inputStream);
			}
			sheet = workbook.getSheet(SheetName);
			int totalRows= sheet.getPhysicalNumberOfRows();
			int toatalColumns=sheet.getRow(0).getPhysicalNumberOfCells();
			Object[][] object=new Object[totalRows-1][toatalColumns];
			for(int i=1; i<totalRows; i++) {
			
			for (int j=0; j<toatalColumns; j++) {
			
		Cell cell= sheet.getRow(i).getCell(j);
				if(cell.getCellType().equals(CellType.STRING))
				{
					object[i-1][j]=cell.getStringCellValue();
				}
				else if(cell.getCellType().equals(CellType.NUMERIC)) {
					object[i-1][j]=cell.getNumericCellValue();
					
					
				}else if(cell.getCellType().equals(CellType.BLANK)) {
					System.out.println("Blank Value");
				object[i-1]=null;
				}
					
			}
		}
		workbook.close();
		inputStream.close();
		return object;
		}
		catch (IOException e) {
			throw new RuntimeException(e);
		}
		
	
	
	}
}
*/		
	


