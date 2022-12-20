module com.example.javaproj {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaproj to javafx.fxml;
    exports com.example.javaproj;
}