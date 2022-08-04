package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Java Driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://vctcpune.com/selenium/practice.html");
		 
		 Thread.sleep(1000);
		 driver.switchTo().frame("iframe-name");
		 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click();
		 
		 Thread.sleep(1000);
		 driver.switchTo().defaultContent();
		 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		 
		 


	}

}
