import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.apache.poi.ss.usermodel.Sheet;

public class DataImportfromExcel {

	static WebDriver driver;
	//static String filePath = System.getProperty("user.dir")+ "/src/test/resources/ExcelTestData/OpenCartTestData.xlsx";
	static String filePath = "F:\\Code_workSpace\\SeleniumLearning\\src\\test\\resources\\ExcelTestData\\OpenCartTestData.xlsx";
	public static void main(String[] args) {

		  ChromeOptions co = new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*"); //driver = new ChromeDriver();
		  driver = new ChromeDriver(co); driver.get(
		  "https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		  
		  
		 Object [] [] excelData = getData("Sheet1");
		System.out.println("======Hello========");
		//System.out.println(excelData);
		
		/*
		 * for(Object ar : excelData) { System.out.println(ar); }
		 */
	}
	
	
	public static Object[][] getData(String sheetName)
	{
		Object [][] data = null;
		try {
		FileInputStream file = new FileInputStream(filePath);
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheet(sheetName);
		 data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		 int row = sheet.getLastRowNum();
		 System.out.println(row);
		 int cell = sheet.getRow(0).getLastCellNum();
		 System.out.println(cell);
		 
		 for(int i=0; i<sheet.getLastRowNum();i++)
		 {
			 for(int j=0; j<sheet.getRow(0).getLastCellNum();j++)
			 {
				 data[i][j]= sheet.getRow(i+1).getCell(j).toString();
				 System.out.print(data[i][j]);
				 System.out.print("---");
			 }
			 System.out.println();
		 }
		
		
		
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}catch (InvalidFormatException e)
		{
			e.printStackTrace();
		}
		return data;
	}

}
