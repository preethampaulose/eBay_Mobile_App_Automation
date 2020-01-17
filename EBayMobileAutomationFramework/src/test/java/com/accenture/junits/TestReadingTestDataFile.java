package com.accenture.junits;

import static org.junit.Assert.*;

import org.junit.Test;

import com.accenture.util.Dataset;
import com.accenture.util.DatasetFile;

public class TestReadingTestDataFile {

    @Test
    public void canReadTestDataFile() {
	DatasetFile datasetFile = new DatasetFile("src/test/resources/TestData.xlsx");
	Dataset dataset = datasetFile.read();
	assertEquals(4, dataset.size());
    }

}
