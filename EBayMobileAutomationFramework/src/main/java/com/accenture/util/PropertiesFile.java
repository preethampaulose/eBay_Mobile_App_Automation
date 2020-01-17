package com.accenture.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {

    Properties prop = new Properties();
    
    public PropertiesFile(String fileName) {
	try (InputStream input = new FileInputStream(fileName)) {
            prop.load(input);
	} catch (FileNotFoundException e) {
	    System.out.println("Properties file not found " + fileName + " ERROR: " + e.getMessage());
	} catch (IOException e) {
	    System.out.println("Properties file read error " + fileName + " ERROR: " + e.getMessage());
	}
	
    }

    public String getValueOf(String fieldName) {
	if(prop.containsKey(fieldName))
	    return prop.getProperty(fieldName);
	return "";
    }

}
