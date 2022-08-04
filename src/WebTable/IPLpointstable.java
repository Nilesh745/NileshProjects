package WebTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IPLpointstable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Java Driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://www.iplt20.com/");
		 
		 Thread.sleep(1000);
		  driver.findElement(By.xpath("(//a[text()='Points Table'])[2]")).click();
		  
		  Thread.sleep(1000);
		   int rows = driver.findElements(By.xpath("//tbody[@id='pointsdata']//tr")).size();
		  
		  System.out.println(rows);
		  
		  Thread.sleep(1000);
		 int headers = driver.findElements(By.xpath("//tbody//tr[@class='ih-pt-tbl']//th")).size();
		  
		  System.out.println(headers);
		  
		  Thread.sleep(1000);
		  int columns = driver.findElements(By.xpath("//tbody//tr[@class='team0 ng-scope']//td")).size();
		 
		  System.out.println(columns);
		  
		  Thread.sleep(1000);
		 //  String headerdata = driver.findElement(By.xpath("//tbody//tr[@class='ih-pt-tbl']//th")).getText();
		  int a=1;
          for (a=1; a<=11; a++) {
        	  String headerdata = driver.findElement(By.xpath("//tbody//tr[@class='ih-pt-tbl']//th["+a+"]")).getText();
        	  System.out.print(headerdata+" ");
        	  Thread.sleep(100);
          }System.out.println();
		  
		 
		 
		  int i;
		  int j;
		  int c;
		  int b;
		  
		  for (i=1; i<=rows; i++) {
			  for(j=1; j<=11; j++) {
				  
				String text = driver.findElement(By.xpath("//tbody[@id='pointsdata']//tr["+i+"]//td["+j+"]")).getText();
				        
				  Thread.sleep(100);
				  System.out.print(text+" ");
				  Thread.sleep(100);
				  
				  }for( c=1; c<=50; c++) {
					  
						String form = driver.findElement(By.xpath("(//tbody//tr[@class='team0 ng-scope']//span)["+c+"]")).getText();
						System.out.print(form);
						Thread.sleep(100);
						if(c==5) {
							c=c+5;
							break;
							
						}
						
					 }
				  System.out.println();
			      }
			  }
			  
		  }
		 
		  
		  
		  

	


