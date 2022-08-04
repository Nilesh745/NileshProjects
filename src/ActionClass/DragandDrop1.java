package ActionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Java Driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		 
		 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		 
	//	 Thread.sleep(1000);
	//	 WebElement Source = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
	//	 Thread.sleep(100);
		 WebElement Destination = driver.findElement(By.id("trash"));
		
		 Actions Act= new Actions(driver);
		
		 
		 List<WebElement> allImg = driver.findElements(By.xpath("//ul//li/img"));
		 
		 for(WebElement a:allImg) {
			 Act.dragAndDrop(a, Destination).perform();
			 Thread.sleep(2000);
		 }

	}

}
