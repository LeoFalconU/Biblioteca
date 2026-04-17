package com.example.biblioteca.controller;

import Biblioteca.modelo.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LoginController {
    @FXML private TextField txtUser;
    @FXML private PasswordField txtPass;

    private Usuario modelo = new Usuario();

    @FXML
    private void login() {
        try {
            String user = txtUser.getText();
            String pass = txtPass.getText();

            if (modelo.login(user, pass)) {

                Stage stage = (Stage) txtUser.getScene().getWindow();

                FXMLLoader loader = new FXMLLoader(
                        getClass().getResource("/biblioteca/vista/login.fxml")
                );

                stage.setScene(new Scene(loader.load()));

            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Usuario o contraseña incorrectos");
                alert.show();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

