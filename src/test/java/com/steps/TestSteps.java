package com.steps;

import org.junit.Assert;

import com.utils.CommonMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class TestSteps extends CommonMethods{

	
	
	
	 @And("click the collections")
	public void i_click_on_emergency_contact() {
		// setUp();
			click(mp.collections_link);

		}
	 
	 
	 @Then("chek elements are displayed")
		public void i_check() {
		 
		
		 boolean check = mp.collections_verify.isDisplayed();
				Assert.assertTrue(check);

			}
	 
}
