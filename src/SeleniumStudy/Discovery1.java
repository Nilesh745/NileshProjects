package SeleniumStudy;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Discovery1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Java Driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.discoveryplus.in/");
		 
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("8830077527");
		 
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination= new File("C:\\Users\\LENOVO\\OneDrive\\Pictures\\Lenovo\\discoveryimage.png");
		
		FileHandler.copy(source,destination);
	    
         
	}

}
