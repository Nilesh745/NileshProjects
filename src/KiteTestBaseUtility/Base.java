package KiteTestBaseUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
WebDriver driver;
	
	public void browserInitialize()
	{
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\May-2021 Class\\test2\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver= new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}


}
