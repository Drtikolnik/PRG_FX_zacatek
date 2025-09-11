package com.example.javafx_1;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class HBoxx extends Application {
    Button tlacitko;
    Button dalsiTlacitko;

    @Override
    public void start(Stage primaryStage) {



        tlacitko = new Button("Klikni na mě uwu");
        dalsiTlacitko = new Button("Klikni na mě uwu");
        BorderPane pane = new BorderPane();
        HBox root = new HBox();
        root.getChildren().addAll(tlacitko, dalsiTlacitko);



        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();


    }



    public static void main(String[] args) {
        launch(args);
    }
}


/*
        tlacitko = new Button();
        tlacitko.setText("click me uwu");
        pane.setLeft(tlacitko);

        tlacitko = new Button();
        tlacitko.setText("click me uwu");
        pane.setCenter(tlacitko);

        tlacitko = new Button();
        tlacitko.setText("click me uwu");
        pane.setLeft(tlacitko);

        tlacitko = new Button();
        tlacitko.setText("click me uwu");
        pane.setBottom(tlacitko);

        tlacitko = new Button();
        tlacitko.setText("click me uwu");
        pane.setRight(tlacitko);
 */