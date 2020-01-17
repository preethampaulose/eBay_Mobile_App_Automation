package com.accenture.mobile.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ShoppingCartScreen extends BaseScreen{
    
    @AndroidFindBy(id = "com.ebay.mobile:id/item_title")
    private MobileElement name;
    
    @AndroidFindBy(id = "com.ebay.mobile:id/item_price")
    private MobileElement price;
    
    @AndroidFindBy(id = "com.ebay.mobile:id/item_action_remove_from_cart")
    private MobileElement removeFromCart;
    
    @AndroidFindBy(id = "com.ebay.mobile:id/shopping_cart_checkout")
    private MobileElement goToCheckout;

    public ShoppingCartScreen(AppiumDriver<?> driver) {
	super(driver);
    }

    public void checkout() {
	goToCheckout.click();
	
    }

}
