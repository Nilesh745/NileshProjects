package kITEaPP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kITEaPPpom1 {

	
		
		
		@FindBy (id = "userid") private WebElement userName;
		@FindBy (id = "password") private WebElement password;
		@FindBy (xpath = "//button[@type='submit']") private WebElement 
		loginButton;


	
	public kITEaPPpom1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void sendUserName()
	{
	userName.sendKeys("ELR321");
	}
	public void sendPassword()
	{
	password.sendKeys("Dhana1111");
	}
	public void clickOnLoginButton()
	{
	loginButton.click();
	}

}
