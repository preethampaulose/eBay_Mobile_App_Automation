package com.accenture.tests;

import java.net.MalformedURLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.accenture.mobile.Android;
import com.accenture.util.Settings;

import io.appium.java_client.AppiumDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseTest extends AbstractTestNGCucumberTests{
     
        
    private Android android;
    private Settings settings = new Settings("src/test/resources/setting.properties");

    //Connect to the device mentioned in the settings.properties before starting all the tests
    @BeforeSuite
    public void setUpAppium() throws MalformedURLException {
	this.android = new Android(settings);
	android.start();	
    }
    
    //Close the connection to the device after completion of all the tests
    @AfterSuite
    public void tearDownAppium() {
        this.android.quit();
    }
}
