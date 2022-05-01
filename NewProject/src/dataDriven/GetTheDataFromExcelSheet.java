package dataDriven;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetTheDataFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file = new File("./TestDAta/Book1.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
String data = workbook.getSheet("Sheet1").getRow(0).getCell(0).toString();
System.out.println(data);
	}

}
