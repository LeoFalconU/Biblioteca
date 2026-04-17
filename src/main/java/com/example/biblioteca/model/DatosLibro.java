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
    }
    //Getters
    public int    getNumero() {
        return numero; }
    public String getTitulo() {
        return titulo; }
    public String getAutor()  {
        return autor;  }
    public String getGenero() {
        return genero; }

    //Setters
    public void setNumero(int    numero) {
        this.numero = numero; }
    public void setTitulo(String titulo) {
        this.titulo = titulo; }
    public void setAutor (String autor)  {
        this.autor  = autor;  }
    public void setGenero(String genero) {
        this.genero = genero; }

    @Override
    public String toString() {
        return "Libro{" +
                "numero="  + numero  +
                ", titulo='" + titulo  + '\'' +
                ", autor='"  + autor   + '\'' +
                ", genero='" + genero  + '\'' +
                '}';
    }

}
