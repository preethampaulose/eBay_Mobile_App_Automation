package com.accenture.mobile.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SearchScreen extends BaseScreen{

    public SearchScreen(AppiumDriver<?> driver) {
	super(driver);
    }


    @AndroidFindBy(id = "com.ebay.mobile:id/search_box")
    private MobileElement searchBox;
    
    @AndroidFindBy(id = "com.ebay.mobile:id/search_src_text")
    private MobileElement searchTextBox;

    
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc="
    			+ "\"When you save a search, we'll let you know when a new item is listed double tap to dismiss\"]")
    private MobileElement saveASearch;
  
    
    @AndroidFindBy(id = "com.ebay.mobile:id/search_box")
    private MobileElement listing;


    public void searchFor(String itemToSearch) {
	searchBox.click();
	boolean textEnteredSuccessfully = enterText(itemToSearch, searchTextBox);
	if (!textEnteredSuccessfully)
	    System.out.println("Could not enter text " + itemToSearch + " in the search box");
	
    }


    public void selectRandomItem() {
	
	
    }

    
}
