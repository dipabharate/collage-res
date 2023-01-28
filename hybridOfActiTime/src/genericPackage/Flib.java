package genericPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	 public String readExcelData(String excelpath,String sheetName,int rowCount,int cellCount) throws IOException
	 {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);	
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();
		return data;
		
	}
	 
	 //to get last rowcount
	 public int rowCount(String excelpath,String sheetName) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelpath);
			Workbook wb = WorkbookFactory.create(fis);
		    Sheet sheet = wb.getSheet(sheetName);
			int rc = sheet.getLastRowNum();
			return rc;
			
		}
		
		//write excel data

			public void WriteExcelData(String excelpath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException{
				FileInputStream fis = new FileInputStream(excelpath);
				Workbook wb = WorkbookFactory.create(fis);
				Sheet sheet = wb.getSheet(sheetName);
				Row row = sheet.getRow(rowCount);
				// ----------------------------------
				
				Cell cell = row.createCell(cellCount);
				cell.setCellValue(data);
				FileOutputStream fos = new FileOutputStream(excelpath);
				wb.write(fos);
				
				}
		
	//read the data from property file
		
		public String readPropertyData(String proppath,String keyValue) throws IOException
		{
			FileInputStream fis = new FileInputStream(proppath);
			Properties prop = new Properties();
			prop.load(fis);
			String data = prop.getProperty(keyValue);
			return data;
			
			
		}
	}

