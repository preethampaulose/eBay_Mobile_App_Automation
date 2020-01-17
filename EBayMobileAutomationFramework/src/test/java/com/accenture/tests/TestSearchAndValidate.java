package com.accenture.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.accenture.mobile.Android;
import com.accenture.mobile.screens.CheckoutScreen;
import com.accenture.mobile.screens.HomePage;
import com.accenture.mobile.screens.ProductDetailsScreen;
import com.accenture.mobile.screens.ProductSearchScreen;
import com.accenture.util.Dataset;
import com.accenture.util.DatasetFile;
import com.accenture.util.Settings;

public class TestSearchAndValidate extends BaseTest{


    @DataProvider(name = "data-provider") 
    public Object[][] dataProviderMethod(){
	DatasetFile datasetFile = new DatasetFile("src/test/resources/TestData.xlsx");
	Dataset dataset = datasetFile.read();
	return dataset.getObjectData();
    }


    @Test()
    public void login() {
	Settings settings = new Settings("src/test/resources/setting.properties");
	HomePage homePage = new HomePage(Android.driver);
	homePage.signIn(settings.getUserName(), settings.getPassword());
    }
    

    @Test(dataProvider = "data-provider")
    public void searchForItem(String data) {
	ProductSearchScreen searchScreen = new ProductSearchScreen(Android.driver);
	searchScreen.searchFor(data);
	searchScreen.selectRandomItem();

	ProductDetailsScreen productDetailsScreen = new ProductDetailsScreen(Android.driver);
	String itemName = productDetailsScreen.getItemName();
	String itemPrice = productDetailsScreen.getItemPrice();
	productDetailsScreen.buy();

	CheckoutScreen checkoutScreen = new CheckoutScreen(Android.driver);
	String itemNameInCheckout = checkoutScreen.getItemName();
	String itemPriceInCheckout = checkoutScreen.getItemPrice();


	checkoutScreen.goToHome();

	assertEquals(itemName, itemNameInCheckout);
	//assertEquals(itemPrice, itemPriceInCheckout);

    }
}
