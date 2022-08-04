package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePomPinPage {

	@FindBy(id="pin")private WebElement Pin;
	@FindBy(xpath = "//button[@type='submit']")private WebElement ContinueButton;
	
	public KitePomPinPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void SendPin(String pin) {
		Pin.sendKeys(pin);
	}
	public void ClickContinueButton() {
		ContinueButton.click();
	}
}
