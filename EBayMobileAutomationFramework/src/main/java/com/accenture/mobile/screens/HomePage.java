package com.accenture.mobile.screens;

import java.util.Random;

import com.accenture.mobile.Android;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BaseScreen{

    public HomePage(AppiumDriver<?> driver) {
	super(driver);
    }


    @AndroidFindBy(id = "com.ebay.mobile:id/home")
    private MobileElement navigationMenu;
    
    @AndroidFindBy(id = "com.ebay.mobile:id/textview_sign_out_status")
    private MobileElement signIn;
    
    @AndroidFindBy(id = "com.ebay.mobile:id/search_box")
    private MobileElement searchBox;
    
    @AndroidFindBy(id = "com.ebay.mobile:id/search_src_text")
    private MobileElement searchTextBox;

    
    @AndroidFindBy(id = "com.ebay.mobile:id/textview_sign_in_status")
    private MobileElement avatar;
  
    
    @AndroidFindBy(id = "com.ebay.mobile:id/menuitem_sign_out")
    private MobileElement signOut;


    public void signIn(String userName, String password) {
	navigationMenu.click();
	signIn.click();
	LoginScreen loginScreen = new LoginScreen(Android.driver);
	loginScreen.login(userName, password);
    }
    
    public void logOut() {
	navigationMenu.click();
	avatar.click();
	signOut.click();
    }

    
}
