package com.accenture.mobile.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginScreen extends BaseScreen{
    
    @AndroidFindBy(id = "com.ebay.mobile:id/button_sign_in")
    private MobileElement signIn;
    
    @AndroidFindBy(id = "com.ebay.mobile:id/button_classic")
    private MobileElement USE_EMAIL_OR_USERNAME;
    
    @AndroidFindBy(id = "com.ebay.mobile:id/edit_text_username")
    private MobileElement userName;
    
    @AndroidFindBy(id = "com.ebay.mobile:id/et_temp")
    private MobileElement password;
    


    public LoginScreen(AppiumDriver<?> driver) {
        super(driver);
    }
    
    public boolean login(String username, String password){
	signIn.click();
	USE_EMAIL_OR_USERNAME.click();
	
	/*
	 * boolean usernameStatus = sendKeysToElement(username, usernameField, false);
	 * 
	 * passwordField.click(); Thread.sleep(KEYBOARD_ANIMATION_DELAY);
	 * passwordField.sendKeys(password);
	 * 
	 * loginButton.click();
	 * 
	 * return usernameStatus;
	 */
	 
	return true;
	
    }
}
