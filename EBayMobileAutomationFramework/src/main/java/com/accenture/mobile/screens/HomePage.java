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

    
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc="
    			+ "'When you save a search, we'll let you know when a new item is listed double tap to dismiss']")
    private MobileElement saveASearch;
  
    
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.ebay.mobile:id/cell_collection_item'][1]")
    private MobileElement listing;


    public void searchFor(String itemToSearch) {
	searchBox.click();
	boolean textEnteredSuccessfully = enterText(itemToSearch, searchTextBox);
	if (!textEnteredSuccessfully)
	    System.out.println("Could not enter text " + itemToSearch + " in the search box");
	Android.driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }


    public void selectRandomItem() {
	Random r = new Random();
	for(int i=0; i < r.nextInt((7 - 0) + 1) + 0; i++)
	    swipeup();
	listing.click();
    }


    public void signIn(String userName, String password) {
	navigationMenu.click();
	signIn.click();
	
	LoginScreen loginScreen = new LoginScreen(Android.driver);
	loginScreen.login(userName, password);
    }

    
}
