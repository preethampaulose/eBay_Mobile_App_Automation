package com.accenture.mobile.screens;

import com.accenture.mobile.Android;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginScreen extends BaseScreen{

    /*
     * @AndroidFindBy(id = "com.ebay.mobile:id/button_sign_in") private
     * MobileElement signIn;
     */

    @AndroidFindBy(id = "com.ebay.mobile:id/button_classic")
    private MobileElement USE_EMAIL_OR_USERNAME;

    @AndroidFindBy(id = "//android.widget.EditText[@text='Email or username']")
    private MobileElement userNameField;

    @AndroidFindBy(id = "//android.widget.EditText[@text='Password']")
    private MobileElement passwordField;

    @AndroidFindBy(id = "//android.widget.Button[@text='Sign in']")
    private MobileElement signIn;

    public LoginScreen(AppiumDriver<?> driver) {
	super(driver);
    }

    public void login(String username, String password){
	signIn.click();
	USE_EMAIL_OR_USERNAME.click();
	boolean textEnteredSuccessfully = enterText(username, userNameField);
	if (!textEnteredSuccessfully)
	    System.out.println("Could not enter username");
	textEnteredSuccessfully = enterText(password, passwordField);
	if (!textEnteredSuccessfully)
	    System.out.println("Could not enter password");
	Android.driver.pressKey(new KeyEvent(AndroidKey.ENTER)); 
    }
}
