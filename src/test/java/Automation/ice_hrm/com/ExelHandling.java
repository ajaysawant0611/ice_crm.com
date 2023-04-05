package Automation.ice_hrm.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExelHandling {

	public static void main(String[] args)throws FileNotFoundException {
		// TODO Auto-generated method stub
		String filepath="D:\\AJAY\\Testdata.xlsx";
		String extension=filepath.substring(filepath.indexOf(".") + 1);
		Workbook workbook=null;
		try {
			FileInputStream inputStream=new FileInputStream(filepath);
			if(extension.equals("xlsx"))
			{
			workbook =new XSSFWorkbook(inputStream);
		}else if(extension.equals("xlx"))
		{  workbook=new HSSFWorkbook(inputStream);
			
		}
		Sheet sheet= workbook.getSheet("Sheet1");
			int totalRows= sheet.getPhysicalNumberOfRows();
			int totalColumns=sheet.getRow(0).getPhysicalNumberOfCells();
			for(int i=0; i< totalRows; i++)
			{		
			  for (int j=0; j < totalColumns; j++)
			  {
				Cell cell = sheet.getRow(i).getCell(j);
				CellType cellType=cell.getCellType();
				if(cellType.equals(CellType.NUMERIC))
				{ System.out.print(cell.getNumericCellValue() + "  ");
				}
				else if(cellType.equals(CellType.STRING))
				{
					System.out.print(cell.getStringCellValue()+"  ");
				}
				else if(cellType.equals(CellType._NONE) || cellType.equals(CellType.BLANK))
				{
					System.out.println();
				}
				else if(cellType.equals(CellType.ERROR))
				{
					System.out.println(cell.getErrorCellValue());
				}
			  }
			  System.out.println();
			}
			workbook.close();
		}
		catch(IOException e)
		{
			throw new RuntimeException(e);
				
			}
	}
}	


