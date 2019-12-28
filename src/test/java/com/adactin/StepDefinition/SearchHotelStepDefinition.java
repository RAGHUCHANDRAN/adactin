package com.adactin.StepDefinition;

import com.adactin.baseclass.Baseclass;
import com.adactin.pom.SearchHotel;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchHotelStepDefinition extends Baseclass {
	SearchHotel sh=new SearchHotel(driver);
	
	@When("^user select the location$")
	public void user_select_the_location() throws Throwable {
		SearchHotel sh=new SearchHotel(driver);
		dropDown(sh.getLocation(), "index", "2");   
	}

	@When("^user select the hotel$")
	public void user_select_the_hotel() throws Throwable {
		SearchHotel sh=new SearchHotel(driver);
		dropDown(sh.getHotels(), "value", "Hotel Hervey");
	}

	@When("^user select the roomtype$")
	public void user_select_the_roomtype() throws Throwable {
		SearchHotel sh=new SearchHotel(driver);
		dropDown(sh.getRoomtype(), "index", "2");
		    
	}

	@When("^user select the no\\.of rooms$")
	public void user_select_the_no_of_rooms() throws Throwable {
		SearchHotel sh=new SearchHotel(driver);
		dropDown(sh.getnoofrooms(), "value", "2");    
	}

	@When("^user select the adults room$")
	public void user_select_the_adults_room() throws Throwable {
		SearchHotel sh=new SearchHotel(driver);
		 dropDown(sh.getadultroom(), "value", "2");   
	}

	@When("^user select the children room$")
	public void user_select_the_children_room() throws Throwable {
		SearchHotel sh=new SearchHotel(driver);
		dropDown(sh.getChildroom(), "index", "1");   
	}

	@Then("^user verify the given Search hotel details$")
	public void user_verify_the_given_Search_hotel_details() throws Throwable {
		SearchHotel sh=new SearchHotel(driver);
		clickOnElement(sh.getSubmitbtn());    
	}

}
