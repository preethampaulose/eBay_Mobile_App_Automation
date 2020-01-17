package com.accenture.tests;

import org.testng.annotations.Test;

import com.accenture.mobile.Android;
import com.accenture.mobile.screens.LoginScreen;
import com.accenture.util.Settings;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginTest extends BaseTest{
    
    private LoginScreen loginScreen;
    private Settings settings = new Settings("src/test/resources/setting.properties");
    
    @Given("I navigate to login page")
    public void navigateToLoginPage() {
	Android android = new Android(settings);
	android.start();
        loginScreen = new LoginScreen();
        android.quit();
    }

    @Given("Credentials are correct")
    public void correctCredentials() {
	//login correct
    }

    @Then("log out")
    public void logOut() {
        // Write code here that turns the phrase above into concrete actions
    }

}
