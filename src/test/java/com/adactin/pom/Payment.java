package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.baseclass.Baseclass;

public class Payment extends Baseclass {

	public static WebDriver driver;
	
	public Payment(WebDriver pdriver) {
		Payment.driver = pdriver;
		PageFactory.initElements(driver, this);
		}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}
	
	public WebElement getExpiryDate() {
		return ExpiryDate;
	}
	
	public WebElement getCVV() {
		return CVV;
	}

	public WebElement getBookbtn() {
		return bookbtn;
	}

	@FindBy(xpath="//input[contains(@name,'first')]")
	private WebElement firstname;
	
	@FindBy(xpath="//input[contains(@name,'last')]")
	private WebElement lastname;
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement address;

	@FindBy(xpath="(//input[contains(@name,'num')])[2]")
	private WebElement cardno;
	
	@FindBy(xpath="(//select[contains(@name,'cc')])[1]")
	private WebElement cardtype;
	
	@FindBy(xpath="//select[contains(@name,'month')]")
	private WebElement ExpiryDate;
	
	@FindBy(xpath="//select[contains(@name,'year')]")
	private WebElement CVV;
	
	@FindBy(xpath="//input[contains(@name,'book')]")
	private WebElement bookbtn;


}
