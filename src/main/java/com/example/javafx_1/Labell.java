package com.example.javafx_1;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Labell extends Application {
    TextField txf1, txf2, txf3;

    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();

Label lbl1, lbl2, lbl3;

        lbl1 = new Label("Piš na mě uwu 1:");
        lbl2 = new Label("Piš na mě uwu 2:");
        lbl3 = new Label("Piš na mě uwu 3:");

        txf1 = new TextField();
        txf2 = new TextField();
        txf3 = new TextField();


        root.add(lbl1, 0, 0);
        root.add(txf1, 0, 1);
        root.add(lbl2, 1, 0);
        root.add(txf2, 1, 1);
        root.add(lbl3, 1, 2);
        root.add(txf3, 1, 3);



        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();


    }



    public static void main(String[] args) {
        launch(args);
    }
}