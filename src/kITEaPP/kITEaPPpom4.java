package kITEaPP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kITEaPPpom4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Java Driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://kite.zerodha.com/");
		 
		 Thread.sleep(1000);
		 kITEaPPpom1 login=new kITEaPPpom1(driver);
		 login.sendUserName();
		 login.sendPassword();
		 login.clickOnLoginButton();
		 
		 Thread.sleep(2000);
		 kITEaPPpom2 pin= new kITEaPPpom2(driver);
		 pin.sendPin();
		 pin.clickOnContinueButton();
		
		 Thread.sleep(2000);
		 kITEaPPpom3 home= new kITEaPPpom3(driver);
		 home.validateUserName();
		 home.logOut();
		 driver.close();

	}

}
