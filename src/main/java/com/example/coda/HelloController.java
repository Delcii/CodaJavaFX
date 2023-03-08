package com.example.coda;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Objects;

public class HelloController {

    ArrayList<String> fila = new ArrayList<>();
    @FXML
    private ListView Lista;

    @FXML
    private Label titolo;
    @FXML
    private TextField NomeRimuovi,NomeAggiungi;

    private void aggiornaLista()
    {
        Lista.getItems().clear();
        for(int i =0;i<fila.size();i++)
        Lista.getItems().add(fila.get(i));
    }

    @FXML
    private void AggiungiClick()
    {
        if(!Objects.equals(NomeAggiungi.getText(), ""))
            fila.add(NomeAggiungi.getText());
        aggiornaLista();
    }

    @FXML
    private void ServiClick()
    {
        titolo.setText("Persona " + fila.get(0) + " è stata servita");
        fila.remove(0);
        aggiornaLista();

    }

    @FXML
    private void RimuoviClick()
    {
        for(int i = 0; i<fila.size(); i++)
            if(Objects.equals(fila.get(i), NomeRimuovi.getText()))
                fila.remove(i);
        aggiornaLista();
    }
}