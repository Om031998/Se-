package genericPacage;
/**
  Om
 */
import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.support.FindBy;

public class ExcelReader {
File filepath= new File(FrameConstants.Excel_Path);
public static Workbook workbook;
public String getData(String sheet,int row,int column) throws EncryptedDocumentException, IOException {
	String val="";
	workbook=WorkbookFactory.create(filepath);
	 Cell cell1 = workbook.getSheet(sheet).getRow(row).getCell(column);
	 return val=cell1.getStringCellValue();
}

}

