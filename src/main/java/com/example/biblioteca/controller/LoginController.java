package com.example.biblioteca.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LoginController {
}

@FXML private StackPane contenedor;


@FXML
private void irAgregarLibro() {
    cargarVista("AgregarLibro.fxml");
}


@FXML
private void irBuscarLibro() {
    cargarVista("BuscarLibro.fxml");
}


@FXML
private void cerrarSesion() {
    try {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Stage stage = (Stage) contenedor.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Biblioteca - Login");
        stage.show();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

private void cargarVista(String fxml) {
    try {
        Parent vista = FXMLLoader.load(getClass().getResource(fxml));
        contenedor.getChildren().setAll(vista);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
