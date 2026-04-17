package com.example.biblioteca.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AgregarLibroController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
