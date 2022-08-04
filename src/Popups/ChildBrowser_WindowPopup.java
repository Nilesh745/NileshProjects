package Popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser_WindowPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Java Driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://skpatro.github.io/demo/links/");

		 Thread.sleep(1000);
		 driver.findElement(By.name("NewWindow")).click();
		 Set<String> AllWindows = driver.getWindowHandles();
		 System.out.println(AllWindows);
		 Iterator<String> it=AllWindows.iterator();
		 String mainpage= it.next();
		 String child= it.next();
		 Thread.sleep(1000);
		 driver.switchTo().window(child);
		 Thread.sleep(1000);
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Ola! This is Leo Messi");
		 
		 driver.close();
		 
		
		  driver.switchTo().window(mainpage);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
		 driver.close();
		
		 
		 
		 
		 
		 
	}

}
