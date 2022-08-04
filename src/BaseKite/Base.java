package BaseKite;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import UtilityKite.Utility;

public class Base {
	protected static WebDriver driver;

	public void ChromeSetup() throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Java Driver\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 //driver.get("https://kite.zerodha.com/");
		 
		  driver.get(Utility.DataReadFromPropertyFile("url"));
		 }
	public void FirefoxSetup() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\LENOVO\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		 driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://kite.zerodha.com/");

	}
	public String CrossBrowserSetup(String Name) throws IOException {
		if (Name.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\Java Driver\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
		}else if(Name.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\LENOVO\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(Utility.DataReadFromPropertyFile("url"));
        return Name;
	}
}
