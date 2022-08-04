package Miscelleneous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Misc2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Java Driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 
		 driver.findElement(By.name("q")).sendKeys("Mercedes");
		 Thread.sleep(200);
		 List<WebElement> List = driver.findElements(By.xpath(("//ul[@class='erkvQe']//li")));
		 System.out.println(List.size());
		 
		 Thread.sleep(500);
		 for (WebElement r:List) {
			 System.out.println(r.getText());
			
		 }
		 
		 

	}

}
