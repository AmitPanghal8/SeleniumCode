package working_Excel_Data;

import org.apache.log4j.Logger;


public class testExcel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		Logger log = Logger.getLogger("devpinoyLogger");
		
		ExcelReader excel = new ExcelReader("F:\\JAVA Projects\\selenium_data.xlsx");
		String sheetName = "Sheet1";
		
	log.debug("Getting the row count");
		
		System.out.println(excel.getRowCount(sheetName));
		
	log.debug("Getting the column count");
		System.out.println(excel.getColumnCount(sheetName));
	log.debug("Getting the data");
		System.out.println(excel.getCellData(sheetName, "username", 2));
	log.debug("Entering the data");
	excel.setCellData(sheetName, "username", 7, "Manpreet");

	}

}

