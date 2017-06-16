package scripts.common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.testng.Assert;
import jxl.*;

public class ExcelReader {
	
	private Workbook book    = null;
	private Sheet sheet      = null;
	private int rowNum       = 0;
	private int currentRowNo = 0;
	private int columnNum    = 0;
	private boolean flag = true;
	protected static final Logger logger = Logger.getLogger(SeleniumDrivers.class);
	
	public List<String> readExcelByColumn(String filePath, String columnName, String sheetName) {
		
		List<String> list = new ArrayList<String>();
		try {
			String[] columnnName;
			//String path = "E://workspace//infonova//ExcelFiles//test.xls";
			InputStream inputStream = new FileInputStream(filePath);
			book = Workbook.getWorkbook(inputStream);
			//Get sheet Name
			sheet = book.getSheet(sheetName);
			rowNum = sheet.getRows();
			logger.info("RowNumber in Excel are======" + rowNum);
			if (rowNum > 0) {
				Cell[] cell = sheet.getRow(0);
				columnNum = cell.length;
				logger.info("columnNum in Excel are======" + columnNum);
				columnnName = new String[columnNum];
				for (int i = 0; i < columnNum; i++) {
					columnnName[i] = cell[i].getContents().trim().toString();
					if (columnnName[i].equalsIgnoreCase(columnName)) {
						for (int j = 1; j < rowNum; j++) {
							flag = false;
							logger.info("Data are======" + sheet.getCell(i, j).getContents().trim().toString());
							list.add(sheet.getCell(i, j).getContents().trim().toString());
						}
					}
					logger.info("Column Names are =====" + columnnName[i]);
				}
				if (flag) {
					logger.info("Column is not existed in Excel!");
				}
			}
			
			book.close();
			
		} catch(Exception e) {
			 e.printStackTrace();
			 Assert.fail("unable to read Excel data");
		}
       return list;
    }
	
	public void readExcel(String filePath, String columnName, String sheetName) {}
	
	
}
