package com.example.javafx_1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ClickMe extends Application {
    Button tlacitko;
    @Override

    public void start(Stage primaryStage) {
        tlacitko = new Button();
        tlacitko.setText("Klikni na mě uwu");
        BorderPane pane = new BorderPane();
        pane.setCenter(tlacitko);
        Scene scene = new Scene(pane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}