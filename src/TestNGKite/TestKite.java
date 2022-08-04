package TestNGKite;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseKite.Base;
import POM.KiteHomePage;
import POM.KitePomLoginPage;
import POM.KitePomPinPage;
import UtilityKite.Utility;
@Listeners(UtilityKite.Listener.class)
public class TestKite extends Base {
	KiteHomePage Home;
	KitePomLoginPage Login;
	KitePomPinPage Pin;
	String Shotid="25";
	@Parameters ("BrowserNames")
  @BeforeClass
  public void LaunchBrowser(String Name) throws IOException {
	 //ChromeSetup();
		CrossBrowserSetup(Name);
	  Home= new KiteHomePage(driver);
	  Login= new KitePomLoginPage(driver);
	  Pin= new KitePomPinPage(driver);
  }
  
  
	@BeforeMethod
  public void loginKite() throws EncryptedDocumentException, IOException {
	  Login.SendUserID(Utility.DateReadFromEXCEL(0, 1));
	  Login.SendPassword(Utility.DateReadFromEXCEL(1, 1));
	  Login.ClickLoginButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  Pin.SendPin(Utility.DateReadFromEXCEL(2, 1));
	  Pin.ClickContinueButton();
  }
	@Test
  public void ValidateUsername() throws EncryptedDocumentException, IOException {
		Assert.assertEquals(Home.actualUID(),Utility.DateReadFromEXCEL(0, 1) );
		Assert.fail();
		Utility.TakeSshot(Shotid);
		Reporter.log("Expected UID matched TC passed",true);
		
  }
	@AfterMethod
	public void LogoutKite() {
		Home.ClickLogoutButton();
	}
	@AfterClass
	public void CloseBrowser() {
		driver.close();
	}
	
}
