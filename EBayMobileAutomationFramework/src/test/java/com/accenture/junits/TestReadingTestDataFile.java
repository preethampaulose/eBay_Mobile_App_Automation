package com.accenture.junits;

import static org.junit.Assert.*;

import org.junit.Test;

import com.accenture.util.Dataset;

public class TestReadingTestDataFile {

    @Test
    public void canReadTestDataFile() {
	Dataset dataset = new Dataset("src/test/resources/TestData.xlsx");
	
    }

}
