package com.accenture.tests;

import org.testng.annotations.Test;

import com.accenture.mobile.Android;
import com.accenture.mobile.screens.LoginScreen;
import com.accenture.mobile.screens.SearchScreen;

public class TestSearchAndValidate extends BaseTest{

    
    @Test()
    public void canLoginToApp() {
	LoginScreen loginScreen = new LoginScreen(Android.driver);
	loginScreen.login("", "");
    }

    @Test()
    public void testSearch() {
	SearchScreen searchScreen = new SearchScreen(Android.driver);
	searchScreen.searchFor("TV");
	searchScreen.selectRandomItem();
    }
}
