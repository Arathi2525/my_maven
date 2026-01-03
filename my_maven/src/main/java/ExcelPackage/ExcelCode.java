package ExcelPackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode 
{
	public static FileInputStream f;//Fileinputstream is a predefined class then declared variable
	public static XSSFWorkbook w;
	public static XSSFSheet s;
	
public static String readStringData(int i,int j) throws //i=row,j=colum
IOException
{
	f= new FileInputStream("C:\\Users\\HP\\Desktop\\ExcelRead.xlsx");
	w= new XSSFWorkbook(f);
	s= w.getSheet("Sheet1");//predefined method
	XSSFRow r=s.getRow(i);
	XSSFCell c=r.getCell(j);
	return c.getStringCellValue();
}
public static double readIntegerData(int i,int j) throws IOException
{
	f= new FileInputStream("C:\\Users\\HP\\Desktop\\ExcelRead.xlsx");
	w= new XSSFWorkbook(f);
	s= w.getSheet("Sheet1");//predefined method
	XSSFRow r=s.getRow(i);
	XSSFCell c=r.getCell(j);
	return c.getNumericCellValue();
}
}
