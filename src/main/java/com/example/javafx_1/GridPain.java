package com.example.javafx_1;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class GridPain extends Application {
    Button lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9;

    @Override
    public void start(Stage primaryStage) {



        lbl1 = new Button("Klikni na mě uwu 1");
        lbl2 = new Button("Klikni na mě uwu 2");
        lbl3 = new Button("Klikni na mě uwu 3");

        GridPane root = new GridPane();
        root.add(lbl1, 0, 0);
        root.add(lbl2, 1, 0);
        root.add(lbl3, 1, 2);



        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();


    }



    public static void main(String[] args) {
        launch(args);
    }
}