package com.accenture.junits;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.accenture.util.PropertiesFile;

public class TestPropertiesFile {

    @Test
    public void canReadProperties() {
	PropertiesFile prop = new PropertiesFile("src/test/resources/test.properties");
	assertEquals("Android", prop.getValueOf("Device"));
    }
}
