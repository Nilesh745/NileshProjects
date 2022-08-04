package ActionClass;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeandPosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Java Driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 //driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 
		 Thread.sleep(1000);
		 System.out.println(driver.manage().window().getPosition());
		 
        Point P= new Point(25,15);
         driver.manage().window().setPosition(P);
         System.out.println(driver.manage().window().getPosition());
	}

}
