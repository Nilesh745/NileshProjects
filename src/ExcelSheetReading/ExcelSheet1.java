package ExcelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheet1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//System.setProperty("webdriver.chrome.driver","D:\\Java Driver\\chromedriver_win32\\chromedriver.exe");
		// WebDriver driver=new ChromeDriver();
		 
		// create excel sheet and pass the path along with name and extension in File Object 
		 File myfile= new File("C:\\Users\\LENOVO\\OneDrive\\Documents\\Velocity\\SeleniumTest1.xlsx");
		 // Using WorkBookFactory class read excel sheet
		 // how to read String value
		 String name = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		 System.out.println(name);
		 // how to read numeric value
		 double number = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
		 System.out.println(number);
		 // how to read char value
		 String mychar = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		 System.out.println(mychar);
		 //how to read boolean value
		 boolean myValue = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(0).getBooleanCellValue();
		 System.out.println(myValue);

	}

}
