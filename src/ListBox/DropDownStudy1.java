package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownStudy1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Java Driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		 
		 Thread.sleep(1000);
		 WebElement Day = driver.findElement(By.xpath("//select[@title='Day']"));
		 Select s = new Select(Day);
		 s.selectByIndex(15);
		 
		 Thread.sleep(1000);
		 WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		 Select s1= new Select(Month);
		 s1.selectByVisibleText("Apr");
		 
		 
		 Thread.sleep(1000);
		 WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		 Select s2= new Select(year);
		 s2.selectByVisibleText("1998");
		 
		 Thread.sleep(1000);
			System.out.println(s.isMultiple());

		 
		 
		 
		 
		 
		 
		 

	}

}
