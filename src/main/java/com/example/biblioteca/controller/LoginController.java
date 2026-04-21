package com.example.biblioteca.controller;

import com.example.biblioteca.model.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML private TextField txtUser;
    @FXML private PasswordField txtPass;

    private final Usuario modelo = new Usuario();

    @FXML
    private void login() {
        try {
            String user = txtUser.getText();
            String pass = txtPass.getText();

            if (modelo.login(user, pass)) {
                Stage stage = (Stage) txtUser.getScene().getWindow();
                Parent root = FXMLLoader.load(
                        getClass().getResource("/com/example/biblioteca/vista/menu-view.fxml"));
                stage.setScene(new Scene(root));
                stage.setTitle("Biblioteca - Menú");
                stage.show();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Usuario o contraseña incorrectos.\nUsa: admin / 1234");
                alert.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}