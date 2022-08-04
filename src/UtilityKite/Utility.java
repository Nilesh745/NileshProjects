package UtilityKite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import BaseKite.Base;

public class Utility extends Base {

	public static String DateReadFromEXCEL(int row, int column) throws EncryptedDocumentException, IOException {
		File MyFile= new File("C:\\Users\\LENOVO\\OneDrive\\Documents\\Velocity\\SeleniumTest1.xlsx");
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
		String VALUE = MySheet.getRow(row).getCell(column).getStringCellValue();
		return VALUE;
	}
	public static String DataReadFromPropertyFile(String Key) throws IOException {
		Properties Pro =new Properties();
		FileInputStream FIS = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium_Project\\PropertyFile.properties");
		Pro.load(FIS);
		String Value = Pro.getProperty(Key);
		return Value;
		
	}
	public static void TakeSshot(String Shotid) throws IOException {
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination= new File("C:\\Users\\LENOVO\\OneDrive\\Pictures\\Screenshots\\Kite"+Shotid+".png");
		FileHandler.copy(Source, Destination);
		
	}
}
