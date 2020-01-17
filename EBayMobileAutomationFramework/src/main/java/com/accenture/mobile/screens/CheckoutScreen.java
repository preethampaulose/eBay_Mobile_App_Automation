package com.accenture.mobile.screens;

import com.accenture.mobile.Android;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CheckoutScreen extends BaseScreen{

    @AndroidFindBy(id = "com.ebay.mobile:id/item_title")
    private MobileElement name;
    
    @AndroidFindBy(id = "com.ebay.mobile:id/item_price")
    private MobileElement price;
    
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Close']")
    private MobileElement close;
    
    public CheckoutScreen(AppiumDriver<?> driver) {
	super(driver);
    }

    public String getItemName() {
	return name.getText();
    }

    public String getItemPrice() {
	return price.getText();
    }

    public void goToHome() {
	close.click();
	Android.driver.pressKey(new KeyEvent(AndroidKey.BACK));
	
    }

}
