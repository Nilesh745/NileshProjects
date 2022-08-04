package SeleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Java Driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://vctcpune.com/selenium/practice.html");
		
		 Thread.sleep(1000);
		 
	     driver.findElement(By.name("checkBoxOption1")).click();  //by name locator type
	     Thread.sleep(2000);
		 driver.findElement(By.id("checkBoxOption1")).click();    // by id locator type
		
		 Thread.sleep(1000);
		 WebElement Text = driver.findElement(By.xpath("//legend[text()='Suggession Class Example']"));
		
		System.out.println(Text.getText());
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[contains(@class,'inputs ui')]")).sendKeys("Hi");
		
		
		
		 
	}

}
