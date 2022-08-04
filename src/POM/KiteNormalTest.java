package POM;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteNormalTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		File MyFile= new File("C:\\Users\\LENOVO\\OneDrive\\Documents\\Velocity\\SeleniumTest1.xlsx");
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
		String UID = MySheet.getRow(0).getCell(1).getStringCellValue();
		String PWD = MySheet.getRow(1).getCell(1).getStringCellValue();
		String PIN = MySheet.getRow(2).getCell(1).getStringCellValue();
		
		
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Java Driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://kite.zerodha.com/");
		 
		KitePomLoginPage LOGIN = new KitePomLoginPage(driver);
		LOGIN.SendUserID(UID);
		LOGIN.SendPassword(PWD);
		LOGIN.ClickLoginButton();
		
		Thread.sleep(1000);
		
		KitePomPinPage PINPAGE = new KitePomPinPage(driver);
		PINPAGE.SendPin(PIN);
		PINPAGE.ClickContinueButton();
		
		Thread.sleep(1000);
		
		KiteHomePage HOME = new KiteHomePage(driver);
		HOME.ValidateUserID(UID);
		HOME.ClickLogoutButton();
		
		driver.close();
		
		

	}

}
