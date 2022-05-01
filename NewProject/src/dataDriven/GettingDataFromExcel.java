package dataDriven;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class GettingDataFromExcel {


	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file = new File("./TestDAta/Book1.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
		
		for(int i=0;i<=workbook.getSheet("Sheet1").getPhysicalNumberOfRows()-1;i++) {
			for(int j=0;j<=workbook.getSheet("Sheet1").getRow(i).getPhysicalNumberOfCells()-1;j++) {
				String data=workbook.getSheet("Sheet1").getRow(i).getCell(j).toString();
				System.out.print(data+" ");
			}
			System.out.println();
		}
		
		
	}

}


