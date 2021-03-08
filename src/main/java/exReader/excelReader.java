package exReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelReader {
	
	public FileInputStream fis;
	
	private XSSFWorkbook workbook;
	private XSSFSheet sheet;
	
	
	public String projpath;
	public String path;
	public int indexn;
	
	public void exreader() throws IOException {
		projpath = System.getProperty("user.dir");
		path = projpath + "//src//main//tdat//testdata.xlsx";
		
		fis = new FileInputStream(path);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);
	
		
	}
	
	public int getrow(String sheetname)  throws IOException{
		indexn = workbook.getSheetIndex(sheetname);
		System.out.println(workbook.getNumberOfSheets()); 
		
		sheet = workbook.getSheetAt(indexn);
		return(workbook.getNumberOfSheets());
		
		//return(sheet.getLastRowNum() + 1);
	}
	
	
	public static void main(String[] args) throws IOException{
		excelReader read = new excelReader();
		read.getrow("login");
		System.out.println(read.getrow("signup"));
	}

}
