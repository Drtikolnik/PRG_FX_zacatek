package com.example.javafx_1;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class VBoxx extends Application {
    Button tlacitko;
    Button dalsiTlacitko;

    @Override
    public void start(Stage primaryStage) {



        tlacitko = new Button("Klikni na mě uwu");
        dalsiTlacitko = new Button("Klikni na mě uwu");
        BorderPane pane = new BorderPane();
        VBox vbox = new VBox();
        vbox.getChildren().addAll(tlacitko, dalsiTlacitko);



        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();


    }



    public static void main(String[] args) {
        launch(args);
    }
}
