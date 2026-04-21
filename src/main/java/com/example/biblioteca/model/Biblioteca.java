package com.example.biblioteca.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class Biblioteca {


    private static final ObservableList<DatosLibro> libros =
            FXCollections.observableArrayList();

    static {
        libros.add(new DatosLibro(1,"El Quijote","Cervantes","Novela"));
        libros.add(new DatosLibro(2,"Cien Años de Soledad","García Márquez","Novela"));
        libros.add(new DatosLibro(3,"Harry Potter","J.K. Rowling","Fantasía"));
    }

    private Biblioteca() {}

    public static ObservableList<DatosLibro> getLibros() {
        return libros;
    }

    public static void agregarLibro(DatosLibro libro) {
        libros.add(libro);
    }
}
