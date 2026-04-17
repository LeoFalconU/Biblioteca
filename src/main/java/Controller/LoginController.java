package Controller;

import Biblioteca.Model.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Control;

public class LoginController {
    @FXML
    private TextField txtUser;
    @FXML
    private PasswordField txtPassword;

    private Usuario modelo = new Usuario();

    @FXML
    private void login(){
        try {
            String user = txtUser.getText();
            String password = txtPassword.getText();

            if (modelo.login(user, password)) {
                Stage stage = (Stage) txtUser.getScene().getWindow();

                FXMLLoader loader = new FXMLLoader(
                        getClass().getResource("/biblioteca/vista/vista.fxml"));

                stage.setScene(new Scene(loader.load()));
                stage.setTitle("Biblioteca");
            }else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Usuario o contraseña incorrectos");
                alert.show();
            }
        }
 catch (Exception e) {
        e.printStackTrace();
    }

}
