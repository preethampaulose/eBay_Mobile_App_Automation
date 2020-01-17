package com.accenture.mobile;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.accenture.util.Settings;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Android {

    private Settings settings;
    final String URL_STRING;
    public static AndroidDriver<MobileElement> driver;

    public Android(Settings settings) {
	this.settings = settings;
	this.URL_STRING = "http://" + settings.getHost() + "/wd/hub";
    }

    public void start() {
	try {
	    URL url = new URL(URL_STRING);

	    //Use a empty DesiredCapabilities object
	    DesiredCapabilities capabilities = new DesiredCapabilities();

	    //Set the DesiredCapabilities capabilities only for local development
	    capabilities.setCapability("platformName", "Android");
	    capabilities.setCapability("platformVersion", settings.getPlatformVersion());
	    capabilities.setCapability("deviceName", settings.getDeviceName());
	    capabilities.setCapability("udid", settings.getDeviceUdid());
	    capabilities.setCapability("appPackage", settings.getAppPackage());
	    capabilities.setCapability("appActivity", settings.getAppActivity());
	    capabilities.setCapability("noReset", "true");

	    driver = new AndroidDriver<MobileElement>(url, capabilities);

	    //Use a higher value if your mobile elements take time to show up
	    driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}
	catch(Exception e) {
	    System.out.println("Unable to load android driver. Please verify the setting file. ERROR = " + e.getMessage());
	}

    }

    public void quit() {
	Android.driver.quit();
	
    }

}
