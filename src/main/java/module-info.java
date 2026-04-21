module com.example.biblioteca {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.biblioteca to javafx.fxml;
    opens com.example.biblioteca.controller to javafx.fxml;
    opens com.example.biblioteca.model to javafx.fxml;

    exports com.example.biblioteca;
}