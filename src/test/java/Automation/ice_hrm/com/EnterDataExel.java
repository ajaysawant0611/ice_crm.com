/*package Automation.ice_hrm.com;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class EnterDataExel {


	public static void main(String[]args)
	{
		String filepath="D:\\AJAY\\Testdata.xlsx";
		String extension=filepath.substring(filepath.indexOf(".") + 1);
		Workbook workbook=null;
		try {
			FileInputStream inputStream=new FileInputStream(filepath);
			if(extension.equals("xlsx"))
			{
			workbook =new XSSFWorkbook(inputStream);
		    }
			else if(extension.equals("xlx"))
		{  
			workbook=new HSSFWorkbook(inputStream);
		}
	      Sheet sheet=workbook.getSheet("blank");
	    
		if(sheet==null)
		{
			sheet=workbook.createSheet("blank");
		}
		Cell cell= sheet.createRow(0).createCell(0);
		cell.setCellValue("AJAY");
		FileOutputStream outputStream=new FileOutputStream(filepath);
		workbook.write(outputStream);
		workbook.close();
		}
		catch(FileNotFoundException e)
		{
			throw new RuntimeException(e);
		}
		catch(IOException e)
		{
			throw new RuntimeException(e);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
			
		
	}
*/

