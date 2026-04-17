module com.example.biblioteca {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.biblioteca to javafx.fxml;
    exports com.example.biblioteca;
    exports com.example.biblioteca.controller;
    opens com.example.biblioteca.controller to javafx.fxml;
}