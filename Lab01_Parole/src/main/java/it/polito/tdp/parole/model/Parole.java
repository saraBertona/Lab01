package it.polito.tdp.parole.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole {
		
	LinkedList <String> elenco= new LinkedList<String>();
	
	public Parole() {
		
	}
	
	public void addParola(String p) {
		elenco.add(p);
		
	}
	
	
	
	public List<String> getElenco() {
		Collections.sort(elenco, new OrdineAlfabetico());
		return elenco;
	}
	
	public void reset() {
		elenco.clear();
	}
	
	public void cancella(String parola) {
		for(int i=0; i<elenco.size(); i++) {
			if(elenco.get(i).equals(parola)) {
				elenco.remove(parola);
			}
		}
	}


}
