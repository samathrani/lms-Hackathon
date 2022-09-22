package stepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelsheet {
		private String sheetname;
		private String testid;
		public Excelsheet(String testid, String sheetname) {
			this.testid = testid;
			this.sheetname = sheetname;
			
			}
			
	     

		public String readusername()  {
			String path = System.getProperty("user.dir")+"\\Testdata\\Testdata.xlsx";
			File excelfile = new File(path);
			FileInputStream fs = null;
			try {
				fs = new FileInputStream(excelfile);
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			XSSFWorkbook book = null;
			try {
				book = new XSSFWorkbook(fs);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			XSSFSheet sheet = book.getSheet(this.sheetname);
			int rowcount = sheet.getLastRowNum();
			System.out.println(rowcount);
			 for (int rownum =1; rownum<=rowcount; rownum++) {
				 Row excelrow = sheet.getRow(rownum);
				if(this.testid.equals(excelrow.getCell(0).getStringCellValue())) {
				 return excelrow.getCell(1).getStringCellValue();
				}
			 }
			
			return "";
			}
		

		 
			public String readpassword() {
				String path = System.getProperty("user.dir")+"\\Testdata\\Testdata.xlsx";
				File excelfile = new File(path);
				FileInputStream fs = null;
				try {
					fs = new FileInputStream(excelfile);
				} catch (FileNotFoundException e) {
					
					e.printStackTrace();
				}
				XSSFWorkbook book = null;
				try {
					book = new XSSFWorkbook(fs);
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				XSSFSheet sheet = book.getSheet(this.sheetname);
				int rowcount = sheet.getLastRowNum();
				 for (int rownum =1; rownum<=rowcount; rownum++) {
					 Row excelrow = sheet.getRow(rownum);
					 if(this.testid.equals(excelrow.getCell(0).getStringCellValue())) {
						 return excelrow.getCell(2).getStringCellValue();
						}
				 }
				
				 return"";
				}
			
			
			public String search() {
				String path = System.getProperty("user.dir")+"\\Testdata\\Testdata.xlsx";
				File excelfile = new File(path);
				FileInputStream fs = null;
				try {
					fs = new FileInputStream(excelfile);
				} catch (FileNotFoundException e) {
					
					e.printStackTrace();
				}
				XSSFWorkbook book = null;
				try {
					book = new XSSFWorkbook(fs);
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				XSSFSheet sheet = book.getSheet(this.sheetname);
				int rowcount = sheet.getLastRowNum();
				 for (int rownum =1; rownum<=rowcount; rownum++) {
					 Row excelrow = sheet.getRow(rownum);
					 if(this.testid.equals(excelrow.getCell(0).getStringCellValue())) {
						 return excelrow.getCell(3).getStringCellValue();
						}
				 }
				
				 return"";
			}
				

}