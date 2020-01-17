package com.accenture.tests;

import org.testng.annotations.Test;

import com.accenture.mobile.Android;
import com.accenture.mobile.screens.LoginScreen;
import com.accenture.mobile.screens.ProductSearchScreen;

public class TestSearchAndValidate extends BaseTest{

    
    @Test()
    public void login() {
	LoginScreen loginScreen = new LoginScreen(Android.driver);
	loginScreen.login("", "");
    }

    @Test()
    public void searchForItem() {
	ProductSearchScreen searchScreen = new ProductSearchScreen(Android.driver);
	searchScreen.searchFor("TV");
	searchScreen.selectRandomItem();
    }
}
