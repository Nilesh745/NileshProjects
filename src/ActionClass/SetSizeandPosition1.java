package ActionClass;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeandPosition1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Java Driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 //driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 
		 Thread.sleep(1000);
		 System.out.println(driver.manage().window().getSize());
		 
		 Dimension D= new Dimension(1333, 999);
		 driver.manage().window().setSize(D);
		 
		 System.out.println(driver.manage().window().getSize());

	}

}
