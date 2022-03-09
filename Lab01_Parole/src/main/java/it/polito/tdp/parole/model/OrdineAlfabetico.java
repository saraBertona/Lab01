package it.polito.tdp.parole.model;

import java.util.Comparator;

public class OrdineAlfabetico implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		int result=o1.compareTo(o2);
		return result;
	}



	
}