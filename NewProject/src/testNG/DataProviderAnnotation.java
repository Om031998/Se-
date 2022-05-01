package testNG;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DataProviderAnnotation {
	@DataProvider(name = "data" )
	public Object[] Demo() throws EncryptedDocumentException, IOException {
		File file = new File("./TestDAta/Book1.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
		String data = workbook.getSheet("Sheet1").getRow(0).getCell(0).toString();
        return new Object[] {data};
	}

}
