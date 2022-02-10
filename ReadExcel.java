package utlis;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static String[][] readExcel(String fileName) throws IOException {
		
		//Set Path
		XSSFWorkbook wb=new XSSFWorkbook("./data/"+fileName+".xlsx");
		//Go to the Sheet
		XSSFSheet ws=wb.getSheet("CreateLead");
		//row count excluding header
		int rowCount = ws.getLastRowNum();
		//cell count
		short cellCount = ws.getRow(0).getLastCellNum();
		String[][] data=new String[rowCount][cellCount];
		for(int i=1;i<=rowCount;i++)
		{
			XSSFRow row = ws.getRow(i);
			for(int j=0;j<cellCount;j++)
			{				
				XSSFCell cell = row.getCell(j);
				//Retrive the data
				String cellValue=cell.getStringCellValue();
				data[i-1][j]=cellValue;
				
			}
		}
		//Close the workbook
		wb.close();
		return data;
		
		
	}

}
