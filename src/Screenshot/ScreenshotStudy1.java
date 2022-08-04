package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotStudy1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Java Driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 
		 Thread.sleep(5000);
		 
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File destination = new File("C:\\Users\\LENOVO\\OneDrive\\Pictures\\Lenovo\\Facebookimage.png");
		 FileHandler.copy(source, destination);
				 //File destination= new File("C:\\Users\\LENOVO\\OneDrive\\Pictures\\Lenovo\\discoveryimage.png");
					
					//FileHandler.copy(source,destination);

	}

}
