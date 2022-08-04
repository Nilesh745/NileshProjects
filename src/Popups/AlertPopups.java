package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Java Driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demoqa.com/alerts");
		 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		 Alert alt= driver.switchTo().alert();
		 
		 alt.accept();      //There are three ways- Accept,Dismiss,GetText.
		 
		 
		 
		 

	}

}
