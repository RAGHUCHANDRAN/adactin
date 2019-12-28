package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

public static WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='login']")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver ldriver) {
		LoginPage.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
		
		
	}

	
}
