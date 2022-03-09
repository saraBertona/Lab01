package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;
    
    @FXML
    private Button btnCancella;
    
    @FXML
    private TextArea textTime;

    @FXML
    void doInsert(ActionEvent event) {
    	String parola=txtParola.getText();
    	elenco.addParola(parola);
    	String el="";

    	List <String>lista=elenco.getElenco();
    	for(String r: lista) {
    		el+=r+"\n";
    	}
    	txtResult.setText(el);
    	textTime.setText(""+System.nanoTime());

    }

    @FXML
    void doReset(ActionEvent event) {
    	String el="";
    	elenco.reset();
    	List <String>lista=elenco.getElenco();
    	for(String r: lista) {
    		el+=r+"\n";
    	}
    	txtResult.setText(el);
    	textTime.setText(""+System.nanoTime());
    	

    }
    @FXML
    void doCancella(ActionEvent event) {
    	
    	String c=txtResult.getSelectedText();
    	elenco.cancella(c);
     	String el="";
    	List <String>lista=elenco.getElenco();
    	for(String r: lista) {
    		el+=r+"\n";
    	}
    	txtResult.setText(el);
    	textTime.setText(""+System.nanoTime());
    	
    }
    
    

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
}
