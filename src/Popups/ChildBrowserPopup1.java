package Popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Java Driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://skpatro.github.io/demo/links/");
		 
		 Thread.sleep(2000);
		 String MainPageID = driver.getWindowHandle();
		 System.out.println(MainPageID);
		 
		 Thread.sleep(1000);
		 driver.findElement(By.name("NewWindow")).click();
		 
		 Thread.sleep(2000);
		 Set<String> AllPageID = driver.getWindowHandles();
		 Iterator<String> it = AllPageID.iterator();
		
		
		// while(it.hasNext()) {
			// System.out.println(it.next());
		// }
		  MainPageID=it.next(); 
		            String ChildPageID = it.next();
		            
		            driver.switchTo().window(ChildPageID);
		            driver.manage().window().maximize();
		            
		            driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Hahaha");
		            Thread.sleep(1000);
		            driver.switchTo().window(MainPageID);
		            Thread.sleep(1000);
		            
		            WebElement WebElement = driver.findElement(By.xpath("(//input[@type='button'])[2]"));
		            Thread.sleep(1000);
		            
		            System.out.println(WebElement.getText());
		            
         
       
	   
	}
}


