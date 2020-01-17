package com.accenture.mobile.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProductDetailsScreen extends BaseScreen{

    @AndroidFindBy(id = "com.ebay.mobile:id/textview_item_name")
    private MobileElement name;
    
    @AndroidFindBy(id = "com.ebay.mobile:id/textview_item_price")
    private MobileElement price;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='ADD TO CART']")
    private MobileElement addToCart;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='BUY IT NOW']")
    private MobileElement buyItNow;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Watch']")
    private MobileElement watch;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='GO TO CART']")
    private MobileElement goToCart;
    
    public ProductDetailsScreen(AppiumDriver<?> driver) {
	super(driver);
    }

    public String getItemName() {
	return name.getText();
    }

    public String getItemPrice() {
	return price.getText();
    }

    public void buy() {
	buyItNow.click();
	
    }

}
