package com.accenture.mobile.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginScreen extends BaseScreen{

    /*
     * @AndroidFindBy(id = "com.ebay.mobile:id/button_sign_in") private
     * MobileElement signIn;
     */

    @AndroidFindBy(id = "com.ebay.mobile:id/button_classic")
    private MobileElement USE_EMAIL_OR_USERNAME;

    @AndroidFindBy(id = "com.ebay.mobile:id/edit_text_username")
    private MobileElement userNameField;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Password']")
    private MobileElement passwordField;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='SIGN IN']")
    private MobileElement signIn;

    public LoginScreen(AppiumDriver<?> driver) {
	super(driver);
    }

    public void login(String username, String password){
	//signIn.click();
	if(fieldIsDisplayed(USE_EMAIL_OR_USERNAME))
	    USE_EMAIL_OR_USERNAME.click();
	boolean textEnteredSuccessfully = enterText(username, userNameField);
	if (!textEnteredSuccessfully)
	    System.out.println("Could not enter username");
	textEnteredSuccessfully = enterText(password, passwordField);
	if (!textEnteredSuccessfully)
	    System.out.println("Could not enter password");
	signIn.click();
    }
    
}
