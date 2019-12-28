package com.adactin.StepDefinition;

import com.adactin.baseclass.Baseclass;
import com.adactin.pom.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition extends Baseclass{
	
	@Given("^user launch the browser$")
	public void user_launch_the_browser() throws Throwable {
		browserLaunch("chrome");
	}

	@When("^user enter application url$")
	public void user_enter_application_url() throws Throwable {
		urllaunch("https://www.adactin.com/HotelApp/index.php");
		
	}

	@When("^user enter valid username$")
	public void user_enter_valid_username() throws Throwable {
		LoginPage lp=new LoginPage(driver);
		inputOnElement(lp.getUserName(), "kaviyarkmk");
		 }

	@When("^user enter valid password$")
	public void user_enter_valid_password() throws Throwable {
		LoginPage lp=new LoginPage(driver);	
	   inputOnElement(lp.getPassword(), "test@1234"); 
	}

	@Then("^user verify the username in the homepage$")
	public void user_verify_the_username_in_the_homepage() throws Throwable {
		LoginPage lp=new LoginPage(driver);
		clickOnElement(lp.getLoginBtn());
	}



}
