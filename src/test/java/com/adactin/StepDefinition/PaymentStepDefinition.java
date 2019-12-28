package com.adactin.StepDefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Baseclass;
import com.adactin.pom.Payment;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentStepDefinition extends Baseclass{
	public static WebDriver driver;
	
	
	@When("^user enter firstname$")
	public void user_enter_firstname() throws Throwable {
		Payment ph=new Payment(driver);
		inputOnElement(ph.getFirstname(), "Kaviya");
		
	}

	@When("^user enter lastname$")
	public void user_enter_lastname() throws Throwable {
		Payment ph=new Payment(driver);
		inputOnElement(ph.getLastname(), "Thangapandi");
	}

	@When("^user enter Billing address$")
	public void user_enter_Billing_address() throws Throwable {
		Payment ph=new Payment(driver);
		inputOnElement(ph.getAddress(), "Chennai");
	}

	@When("^user enter card number$")
	public void user_enter_card_number() throws Throwable {
		Payment ph=new Payment(driver);
		inputOnElement(ph.getCardno(), "0123456789012345");
	   	}

	@When("^user enter card type$")
	public void user_enter_card_type() throws Throwable {
		Payment ph=new Payment(driver);
		dropDown(ph.getCardtype(), "value", "VISA");
	}

	@When("^user enter card Expiry Date$")
	public void user_enter_card_Expiry_Date() throws Throwable {
	  Payment ph=new Payment(driver);
	  dropDown(ph.getExpiryDate(), "index", "5");  
	}

	@When("^user enter card CVV$")
	public void user_enter_card_CVV() throws Throwable {
		Payment ph=new Payment(driver);
		inputOnElement(ph.getCVV(), "123"); 	
	}

	@Then("^user verify the payment Details$")
	public void user_verify_the_payment_Details() throws Throwable {
		Payment ph=new Payment(driver);
	   clickOnElement(ph.getBookbtn());    
	}


}
