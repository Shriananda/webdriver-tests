package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectHooks;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class LoginPage extends ProjectHooks{
	@Given("Enter the username as {string}")
	public LoginPage enterUsername(String data) {
		clearAndType(locateElement(Locators.ID, "username"), data);
		reportStep(data+" entered successfully","pass");
		System.out.println(data+" entered successfully");
		return this;
	}
	
	@And("Enter the password as {string}")
	public LoginPage enterPassword(String data) {
		clearAndType(locateElement(Locators.ID, "password"), data);
		reportStep(data+" entered successfully","pass");
		System.out.println(data+" entered successfully");
		return this;
	}
	 
	@And("Click Login button")
	public HomePage clickLogin() {
		click(locateElement(Locators.CLASS_NAME, "decorativeSubmit"));
		reportStep("Leaftaps Login button clicked successfully", "pass");
		System.out.println("Leaftaps Login button clicked successfully");
		return new HomePage();
	}

}
