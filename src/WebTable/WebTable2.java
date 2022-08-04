package WebTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Java Driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://vctcpune.com/selenium/practice.html");
		 
		 Thread.sleep(1000);
		  List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		  int TotalNoOfRows= rows.size();
		  System.out.println(TotalNoOfRows);
		  
		  Thread.sleep(1000);
		  List<WebElement> columns = driver.findElements(By.xpath("//table//tr//th"));
		  int TotalNoOfColumns= columns.size();
		  System.out.println(TotalNoOfColumns);
		  
		  for(WebElement header:columns)
		  {
		  System.out.print(header.getText()+" ");
		  }
		  // how to read all rows from table
		  List<WebElement> allrowsData =
		  driver.findElements(By.xpath("//table//tr"));
		 
		  Iterator<WebElement> it = allrowsData.iterator();
		  while(it.hasNext())
		  {
		  System.out.print(it.next().getText()+" ");
		  System.out.println();
		  }


	}

}
