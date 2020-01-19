package com.accenture.util;

public class Settings extends PropertiesFile{

    public Settings(String fileName) {
	super(fileName);
	// TODO Auto-generated constructor stub
    }

    public String getDeviceName() {
	return this.getValueOf("DeviceName");
	
    }

    public String getAppPackage() {
	return this.getValueOf("AppPackage");
	
    }

    public String getDeviceUdid() {
	return this.getValueOf("Udid");
	
    }

    public String getHost() {
	return this.getValueOf("Host");
    }

    public String getPlatform() {
	return this.getValueOf("Platform");
    }

    public String getAppActivity() {
	return this.getValueOf("AppActivity");
    }

    public String getPlatformVersion() {
	return this.getValueOf("PlatformVersion");
    }

    public String getUserName() {
	return this.getValueOf("UserName");
    }

    public String getPassword() {
	return this.getValueOf("Password");
    }

}
