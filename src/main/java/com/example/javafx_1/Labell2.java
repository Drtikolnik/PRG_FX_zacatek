package com.example.javafx_1;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Labell2 extends Application {
    Label lbl1, lbl2;
    TextField txf1;
    PasswordField psw1;
    Button btn1;

    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();

        lbl1 = new Label("User ID:");
        lbl2 = new Label("Password:");

        txf1 = new TextField();

        psw1 = new PasswordField();

        btn1 = new Button("Submit");


        root.add(lbl1, 0, 0);
        root.add(txf1, 0, 1);
        root.add(lbl2, 0, 2);
        root.add(psw1, 0, 3);
        root.add(btn1, 0, 4);



        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();


    }



    public static void main(String[] args) {
        launch(args);
    }
}