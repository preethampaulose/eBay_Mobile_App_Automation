package com.accenture.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatasetFile {

    private String fileName;

    public DatasetFile(String fileName) {
	this.fileName = fileName;
    }

    public Dataset read() {
	Dataset dataset = new Dataset();
	try (FileInputStream excelFile = new FileInputStream(new File(this.fileName));
		Workbook workbook = new XSSFWorkbook(excelFile);){
	    //Read the Dataset sheet
	    Sheet datatypeSheet = workbook.getSheet("DataSet");
	    
	    if(datatypeSheet == null) {
		System.out.println("No test data found. Please add \"DataSet\" sheet in the input file and try again");
		return dataset;
		}
	    Iterator<Row> iterator = datatypeSheet.iterator();
	    //Skip first row as it is the header
	    iterator.next();
	    
	    while (iterator.hasNext()) {
		Row currentRow = iterator.next();
		/*
		 * Assumed the first row contains the items to search. 
		 * Add code to look for the header if multiple headers are present.
		 */
		Cell firstCell = currentRow.getCell(0);
		if (firstCell.getCellType() == CellType.STRING)
		    dataset.add(firstCell.getStringCellValue());
		else if (firstCell.getCellType() == CellType.NUMERIC)
		    dataset.add(String.valueOf(firstCell.getNumericCellValue()));
	    }
	}
	catch (FileNotFoundException e) {
	    System.out.println("Input file " + this.fileName + " could not be found");
	} catch (IOException e) {
	    System.out.println("Issue in readng the input file " + this.fileName);
	}
	return dataset;

    }

}
