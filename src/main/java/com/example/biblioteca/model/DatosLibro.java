package com.example.biblioteca.Model;

public class DatosLibro {
    private int numero;
    private String titulo;
    private String autor;
    private String genero;


    public DatosLibro() {
    }


    public DatosLibro(int numero, String titulo, String autor, String genero) {
        this.numero = numero;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        //agregar getters y setter para los datos de libro, clase padre, contructores vecio y con info
    }
}
