package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePomLoginPage {

	@FindBy(id = "userid")private WebElement UserID;
	@FindBy(id= "password")private WebElement Password;
	@FindBy(xpath = "//button[@type='submit']")private WebElement LoginButton;
	
    public KitePomLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
    public void SendUserID(String userid) {
    	UserID.sendKeys(userid);
    }
    public void SendPassword(String password) {
    	Password.sendKeys(password);
    }
    public void ClickLoginButton() {
    	LoginButton.click();
    }
}
