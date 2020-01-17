package com.accenture.junits;

import static org.junit.Assert.*;

import org.junit.Test;

import com.accenture.util.Settings;

public class TestSettingsProperties {

    @Test
    public void test() {
	Settings settings = new Settings("src/test/resources/setting.properties");
	assertEquals("Android Emulator", settings.getDeviceName());
	assertEquals("org.ebayopensource.fidouafclient", settings.getAppPackage());
	assertEquals("emulator-5554", settings.getDeviceUdid());
    }

}
