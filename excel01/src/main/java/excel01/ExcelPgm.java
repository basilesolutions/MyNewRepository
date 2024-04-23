package excel01;



import java.io.FileInputStream;
import java.io.IOException;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class ExcelPgm {
	 XSSFSheet sh;
	
	 public ExcelPgm() throws IOException {
		 FileInputStream f=new FileInputStream("D:\\Obsqura\\excel.xlsx");
		 XSSFWorkbook wb=new XSSFWorkbook(f);
		 sh=wb.getSheet("Sheet1");
	 }
	
	public String readData(int i, int j) {
		
		Row r=sh.getRow(i);
		Cell c=r.getCell(j);
		int celltype=c.getCellType();//0 or 1
		switch(celltype) {
		case Cell.CELL_TYPE_NUMERIC:
		{
			double d=c.getNumericCellValue();
			return String.valueOf(d);
		}
		case Cell.CELL_TYPE_STRING:
		{
			return c.getStringCellValue();
		}
		}
		
		return null;
		
		
	}
}
 

