package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenshotStudy2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Java Driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 
		 Thread.sleep(1000);
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 System.out.println (source);
		 String str= RandomString.make(3);
		 System.out.println(str);
		 File destination = new File("C:\\Users\\LENOVO\\OneDrive\\Pictures\\Lenovo\\Facebookimg.png");
		 FileHandler.copy(source, destination);
		 

	}

}
