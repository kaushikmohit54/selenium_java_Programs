package seleniumPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadFromEXcel {

	public static void main(String[] args) throws IOException {
		
		WriteData();
	}

	static void readData() throws IOException {

		FileInputStream fs=new FileInputStream("D:\\mohitRepo\\pratice\\TestData.xlsx");
	
		XSSFWorkbook wb=new XSSFWorkbook(fs);
	XSSFSheet sh=wb.getSheet("Sheet1");
	
	int rowCount=sh.getLastRowNum();
	int coulmn=sh.getRow(0).getLastCellNum();
	System.out.println("couln"+coulmn+"rows"+rowCount);
	
	for (int i = 0; i < rowCount; i++) {
		XSSFRow r=sh.getRow(i);
		for (int j = 0; j < coulmn; j++) {
			String value=r.getCell(j).toString();
			System.out.println(value);
		}
	
	}
	
	
	
	}
	static void WriteData() throws IOException {

		FileInputStream fs=new FileInputStream("D:\\mohitRepo\\pratice\\TestData.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fs);
	XSSFSheet sh=wb.getSheet("Sheet1");
	sh.getRow(0).createCell(3).setCellValue("pass");
	FileOutputStream fo=new FileOutputStream("D:\\mohitRepo\\pratice\\TestData.xlsx");
	wb.write(fo);
	fo.close();
	
	
		
	}
}
