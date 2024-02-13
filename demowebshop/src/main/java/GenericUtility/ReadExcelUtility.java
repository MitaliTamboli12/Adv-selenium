package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * this method is used to fetch the single data from excel sheet
 * @param Sheet
 * @param row
 * @param cell
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public class ReadExcelUtility {
public static String fetchData(String Sheet,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream(Iconstant.Excel_Path);
	Workbook w= WorkbookFactory.create(fis);
	Sheet s= w.getSheet(Sheet);
	Row r=s.getRow(row);
	return r.getCell(cell).toString();
}
/**
 * this method is used to return the row size of excel sheet
 * @param Sheet
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public static int rowSize(String Sheet) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream(Iconstant.Excel_Path);
	Workbook w = WorkbookFactory.create(fis);
	Sheet s = w.getSheet(Sheet);
	return s.getPhysicalNumberOfRows();
}
/**
 * this method is used to return the cell size of excel sheet
 * @param Sheet
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public static int columnSize(String Sheet) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream(Iconstant.Excel_Path);
	Workbook w = WorkbookFactory.create(fis);
	Sheet s = w.getSheet(Sheet);
	return s.getRow(0).getPhysicalNumberOfCells();
}
/**
 * this method is used to fetch all the data in excel sheet
 * @param Sheet
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public static Object[][] fetcheallthedata(String Sheet) throws EncryptedDocumentException, IOException{
	FileInputStream fis=new FileInputStream(Iconstant.Excel_Path);
	Workbook w = WorkbookFactory.create(fis);
	Sheet s = w.getSheet(Sheet);
	int rowsize=s.getPhysicalNumberOfRows();
	int columnsize=s.getRow(0).getPhysicalNumberOfCells();
	Object d[][]=new Object[rowsize][columnsize];
	for(int i=0;i<rowsize;i++) {
		for(int j=0;j<columnsize;j++) {
			d[i][j]=s.getRow(i).getCell(j).toString();
		}
	}
	return d;
}
}
