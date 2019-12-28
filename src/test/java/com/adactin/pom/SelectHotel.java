package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {

public static WebDriver driver;
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement select;

	@FindBy(xpath="//input[@name='continue']")
	private WebElement cont;

	public WebElement getSelect() {
		return select;
	}

	public WebElement getCont() {
		return cont;
	}

	public SelectHotel(WebDriver shdriver) {
		SelectHotel.driver=shdriver;
		PageFactory.initElements(driver, this);
	}
}
