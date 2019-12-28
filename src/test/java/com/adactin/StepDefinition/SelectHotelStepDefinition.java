package com.adactin.StepDefinition;

import com.adactin.baseclass.Baseclass;
import com.adactin.pom.SelectHotel;

import io.cucumber.java.en.Given;


public class SelectHotelStepDefinition extends Baseclass{
	
	@Given("^click radio button$")
	public void click_radio_button() throws Throwable {
		SelectHotel ss=new SelectHotel(driver);
	    clickOnElement(ss.getSelect());
	}

	@Given("^click continue$")
	public void click_continue() throws Throwable {
		SelectHotel ss=new SelectHotel(driver);
		   clickOnElement(ss.getCont());  
	}


}
