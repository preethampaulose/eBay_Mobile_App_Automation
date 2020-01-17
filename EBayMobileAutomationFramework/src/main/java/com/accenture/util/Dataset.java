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

}
