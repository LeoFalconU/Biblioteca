package com.example.biblioteca.controller;

import com.example.biblioteca.model.Biblioteca;
import com.example.biblioteca.model.DatosLibro;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BuscarLibroController {

    @FXML private TextField txtBuscar;
    @FXML private Label lblNumero;
    @FXML private Label lblTitulo;
    @FXML private Label lblAutor;
    @FXML private Label lblGenero;
    @FXML private Label lblMensaje;

    @FXML
    private void buscarLibro() {
        String busqueda = txtBuscar.getText().trim().toLowerCase();

        if (busqueda.isEmpty()) {
            lblMensaje.setText("⚠ Escribe un título para buscar.");
            limpiarResultados();
            return;
        }

        DatosLibro encontrado = null;
        for (DatosLibro libro : Biblioteca.getLibros()) {
            if (libro.getTitulo().toLowerCase().contains(busqueda)) {
                encontrado = libro;
                break;
            }
        }

        if (encontrado != null) {
            lblNumero.setText("Número: " + encontrado.getNumero());
            lblTitulo.setText("Título: "  + encontrado.getTitulo());
            lblAutor .setText("Autor: "   + encontrado.getAutor());
            lblGenero.setText("Género: "  + encontrado.getGenero());
            lblMensaje.setText("✔ ¡Libro encontrado!");
        } else {
            lblMensaje.setText("✘ No se encontró ningún libro.");
            limpiarResultados();
        }
    }

    private void limpiarResultados() {
        lblNumero.setText("");
        lblTitulo.setText("");
        lblAutor .setText("");
        lblGenero.setText("");
    }
}