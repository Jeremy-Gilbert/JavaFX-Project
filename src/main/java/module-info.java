module com.example.javafxproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.javafxproject to javafx.fxml;
    exports com.example.javafxproject;
}