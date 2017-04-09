package lib;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile_Config {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public ExcelFile_Config(String excelpath){
		try {
			File src = new File(excelpath);
			FileInputStream file = new FileInputStream(src);
			wb= new XSSFWorkbook(file);
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String getdata(int sheetno,int rowno,int cellno){
		sheet1 = wb.getSheetAt(sheetno);
		String Data = sheet1.getRow(rowno).getCell(cellno).getStringCellValue();
		return Data;
	}

}
