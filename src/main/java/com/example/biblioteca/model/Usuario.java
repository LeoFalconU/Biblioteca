package com.example.biblioteca.model;

public class Usuario {
    private String user ="admin";
    private String password = "1234";

    public boolean login(String user, String pass) {

        return this.user.equals(user) && this.password.equals(pass);
    }
}
