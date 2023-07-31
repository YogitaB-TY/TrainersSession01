package tesng_basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LearningReadExcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//singleRead();
		multipleRead("Login");
	}
	public static String stringRead(String sheetName, int rowNum, int colNum) throws EncryptedDocumentException, IOException {
		File file=new File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet("Login");
		Row row=sheet.getRow(0);
		Cell cell=row.getCell(1);
		return cell.toString();
	}
	public static String[][] multipleRead(String sheetName) throws EncryptedDocumentException, IOException {
		File file=new File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetName);
		
		int row=sheet.getPhysicalNumberOfRows();
		int col=sheet.getRow(0).getPhysicalNumberOfCells();
		String [][] data=new String[row-1][col];
		for (int i = 1; i < row; i++) { //<--Row iteration
			for (int j = 0; j < col; j++) { //<-- Cell iteration
				
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();			
				
			}
		}
		/*
		 * for (int i = 0; i < row-1; i++) { //<--Row iteration for (int j = 0; j < col;
		 * j++) { //<-- Cell iteration
		 * 
		 * System.out.println(data[i][j]);
		 * 
		 * } }
		 */
		return data;
	}
	public static double numericRead(String sheetName, int rowNum, int colNum) throws EncryptedDocumentException, IOException {
		File file=new File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetName);
		return sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
	}
	
	public static boolean booleanRead(String sheetName, int rowNum, int colNum) throws EncryptedDocumentException, IOException {
		File file=new File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetName);
		return sheet.getRow(rowNum).getCell(colNum).getBooleanCellValue();
	}
	

}
