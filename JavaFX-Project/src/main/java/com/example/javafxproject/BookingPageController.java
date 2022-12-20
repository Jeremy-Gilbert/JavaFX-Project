package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BookingPageController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}