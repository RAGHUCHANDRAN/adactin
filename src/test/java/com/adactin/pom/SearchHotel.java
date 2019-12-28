package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {

public static WebDriver driver;
	
	@FindBy(xpath="//select[@name='location']")
	private WebElement location;

	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(name="room_nos")
	private WebElement noofrooms;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adultroom;
	

	@FindBy(xpath="//select[contains(@name,'child')]")
	private WebElement childroom;
	
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitbtn;
	
	

	public  SearchHotel(WebDriver sdriver) {
		SearchHotel.driver = sdriver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getnoofrooms() {
		return noofrooms;
	}	
	
	public WebElement getadultroom() {
		return adultroom;
	}
	public WebElement getChildroom() {
		return childroom;
	}	
	public WebElement getSubmitbtn() {
		return submitbtn;
	}

}

