package Miscelleneous;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Misc1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Java Driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://www.w3schools.com/");
		
		 String Main = driver.getWindowHandle();
			System.out.println(Main); 
		
			Thread.sleep(1000);
		 driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[1]")).click();
		 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[1]")).click();
		 
		Set<String> AllId = driver.getWindowHandles();
		for(String N:AllId)
		{
			System.out.println(N);
			if(!N.equals(Main)) {
				driver.switchTo().window(N);
				driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
				Thread.sleep(4000);
				break;
				}
		}
		driver.switchTo().window(Main);
		 String Try = driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[1]")).getText();
		 System.out.println(Try);
		
		
		
		
		
		
		
		 


	}

}
