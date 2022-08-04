package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {

	@FindBy(xpath = "//span[@class='user-id']")private WebElement ActualUID;
	@FindBy(xpath = "//a[@target='_self']")private WebElement LogoutButton;
	
	public KiteHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void ValidateUserID(String expecteduid) {
		String actualuid = ActualUID.getText();
		String ExpectedUID = expecteduid;
		if (actualuid.equals(ExpectedUID)) {
			System.out.println("User ID matching TC passed");
		}
		else {
			System.out.println("TC failed");
		}
		
	}
	
	public String actualUID() {
		String Username = ActualUID.getText();
		return Username;
	}
	
	public void ClickLogoutButton() {
		ActualUID.click();
		LogoutButton.click();
	}
}
