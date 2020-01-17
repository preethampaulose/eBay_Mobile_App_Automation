package com.accenture.util;

import java.util.ArrayList;

public class Dataset {

    private ArrayList<String> dataset = new ArrayList<>();

    public void add(String value) {
	this.dataset .add(value);

    }

    public int size() {
	return this.dataset.size();
    }

    public Object[][] getObjectData() {
	Object[][] objects = new Object [size()] [1];
	for(int i=0; i<size(); i++)
	    objects[i][0] = this.dataset.get(i).toString();
	Object[][] test = new Object[][] { { "data one" }, { "data two" } };
	return objects;
    }

}
