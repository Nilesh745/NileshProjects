package Miscelleneous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Misc5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Java Driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://vctcpune.com/selenium/practice.html");
		 
		 Thread.sleep(1000);
		 List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		 System.out.println(rows.size());
		 
		 List<WebElement> columns = driver.findElements(By.xpath("//table//tr//th"));
		 System.out.println(columns.size());
		 
		 for(WebElement Rose:rows) {
			 System.out.println();
		 }
		 

	}

}
