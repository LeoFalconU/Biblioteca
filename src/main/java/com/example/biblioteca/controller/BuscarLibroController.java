package com.example.biblioteca.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class BuscarLibroController {
    @FXML private TextField txtBuscar;
    @FXML private Label     lblNumero;
    @FXML private Label     lblTitulo;
    @FXML private Label     lblAutor;
    @FXML private Label     lblGenero;
    @FXML private Label     lblMensaje;


    DatosLibro libro1 = new DatosLibro(1, "El Quijote",         "Cervantes",      "Novela");
    DatosLibro libro2 = new DatosLibro(2, "Cien Años de Soledad","García Márquez", "Novela");
    DatosLibro libro3 = new DatosLibro(3, "Harry Potter",        "J.K. Rowling",   "Fantasía");

    @FXML
    private void buscarLibro() {

        String busqueda = txtBuscar.getText().toLowerCase();

        if (busqueda.isEmpty()) {
            lblMensaje.setText("Escribe un título para buscar.");
            limpiarResultados();
            return;
        }


        if (libro1.getTitulo().toLowerCase().contains(busqueda)) {
            mostrarLibro(libro1);

        } else if (libro2.getTitulo().toLowerCase().contains(busqueda)) {
            mostrarLibro(libro2);

        } else if (libro3.getTitulo().toLowerCase().contains(busqueda)) {
            mostrarLibro(libro3);

        } else {
            lblMensaje.setText("No se encontró ningún libro.");
            limpiarResultados();
        }
    }


    private void mostrarLibro(DatosLibro libro) {
        lblNumero.setText("Número: " + libro.getNumero());
        lblTitulo.setText("Título: "  + libro.getTitulo());
        lblAutor .setText("Autor: "   + libro.getAutor());
        lblGenero.setText("Género: "  + libro.getGenero());
        lblMensaje.setText("¡Libro encontrado!");
    }


    private void limpiarResultados() {
        lblNumero.setText("");
        lblTitulo.setText("");
        lblAutor .setText("");
        lblGenero.setText("");
    }
}
