package com.example.biblioteca.controller;

import com.example.biblioteca.model.Biblioteca;
import com.example.biblioteca.model.DatosLibro;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AgregarLibroController {

    @FXML private TextField txtNumero;
    @FXML private TextField txtTitulo;
    @FXML private TextField txtAutor;
    @FXML private TextField txtGenero;
    @FXML private Label     lblMensaje;

    @FXML
    private void agregarLibro() {
        String numero = txtNumero.getText().trim();
        String titulo = txtTitulo.getText().trim();
        String autor  = txtAutor.getText().trim();
        String genero = txtGenero.getText().trim();

        if (numero.isEmpty() || titulo.isEmpty() || autor.isEmpty() || genero.isEmpty()) {
            lblMensaje.setText("⚠ Por favor llena todos los campos.");
            return;
        }

        int num;
        try {
            num = Integer.parseInt(numero);
        } catch (NumberFormatException e) {
            lblMensaje.setText("⚠ El número debe ser un entero.");
            return;
        }

        Biblioteca.agregarLibro(new DatosLibro(num, titulo, autor, genero));
        lblMensaje.setText("✔ Libro agregado: \"" + titulo + "\"");

        txtNumero.clear();
        txtTitulo.clear();
        txtAutor.clear();
        txtGenero.clear();
    }
}