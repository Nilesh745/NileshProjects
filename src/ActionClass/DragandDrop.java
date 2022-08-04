package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Java Driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://demo.guru99.com/test/drag_drop.html");
		 
		 Thread.sleep(1000);
		// WebElement Source = driver.findElement(By.xpath("(//ul[@id='gallery']//li)[1]"));
		// WebElement Destination = driver.findElement(By.xpath("//div[@id='trash']"));
		 
		 Actions Act = new Actions(driver);
		 
		 Thread.sleep(1000);
			 WebElement Source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
			 WebElement Destination = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
			 Act.dragAndDrop(Source, Destination).perform();
			
			 
			 
			 
		 
		

		 
		 
		 
		 
		 
		 
	}

}
