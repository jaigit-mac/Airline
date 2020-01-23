package secondProject;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel 
{
	public static void printTotalCost(String totalPrice) throws Throwable 
	{	
		FileOutputStream fs = new FileOutputStream("C:\\Users\\Jai\\eclipse-workspace\\HelveticProject\\Excel\\Sheet4.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("Sheet4");
		Row r = s.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue("Tatal Fare");
		Row pr = s.createRow(1);
		Cell pc = pr.createCell(0);
		pc.setCellValue(totalPrice);
		w.write(fs);
	}
}
