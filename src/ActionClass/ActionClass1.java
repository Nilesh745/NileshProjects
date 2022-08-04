package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class ActionClass1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Java Driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		 
		 Thread.sleep(1000);
		 Actions Ac= new Actions(driver);
		 
		WebElement seleniumButton = driver.findElement(By.linkText("Selenium"));
         Ac.click(seleniumButton).perform();
         
         WebElement RightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
         Ac.contextClick(RightClick).perform();
         
         WebElement DoubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
         Ac.doubleClick(DoubleClick).perform();
         System.out.println("Hi.......");
	}

}
