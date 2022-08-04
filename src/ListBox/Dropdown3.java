package ListBox;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown3 {
   // TreeSet Example for getting all options in a Drop down table into output.
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Java Driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 
		 TreeSet<String>ts= new TreeSet<String>();
		 
		 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		 
		 Thread.sleep(1000);
		 WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		 Select s= new Select(Month);
		 List<WebElement> AvailableMonths=s.getOptions();
		 
		 for(WebElement we:AvailableMonths)
			{
				String Text = we.getText();
				ts.add(Text);
			}

			System.out.println(ts);
			
			for(String s1:ts)
			{
				System.out.println(s1);
			}

		 
		 
		 

	}

}
