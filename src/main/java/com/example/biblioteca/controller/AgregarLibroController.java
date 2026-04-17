package com.example.biblioteca.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class AgregarLibroController {
    @FXML private TextField    txtNumero;
    @FXML private TextField    txtTitulo;
    @FXML private TextField    txtAutor;
    @FXML private TextField txtGenero;
    @FXML private Label lblMensaje;

    @FXML
    private void agregarLibro() {
        String numero = txtNumero.getText();
        String titulo = txtTitulo.getText();
        String autor  = txtAutor.getText();
        String genero = txtGenero.getText();
    }
     if (numero.isEmpty() || titulo.isEmpty() || autor.isEmpty() || genero.isEmpty()) {
        lblMensaje.setText("Por favor llena todos los campos.");
        return;
    }


}
