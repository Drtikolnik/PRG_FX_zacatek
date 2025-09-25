package com.example.javafx_1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CheckRadio extends Application {
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6;
    RadioButton radioButton1, radioButton2, radioButton3, radioButton4, radioButton5;

    Button btn1;

    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();

        checkBox1 = new CheckBox("Ketchup");
        checkBox2 = new CheckBox("Mustard");
        checkBox3 = new CheckBox("Prickles");


        radioButton1 = new RadioButton("Beef");
        radioButton2 = new RadioButton("Chicken");
        radioButton3 = new RadioButton("Veggie");
        ToggleGroup radio1 = new ToggleGroup();
        radioButton1.setToggleGroup(radio1);
        radioButton2.setToggleGroup(radio1);
        radioButton3.setToggleGroup(radio1);


        btn1 = new Button("Place order");


        root.add(checkBox1, 0, 0);
        root.add(checkBox2, 1, 0);
        root.add(checkBox3, 2, 0);

        root.add(radioButton1, 0, 1);
        root.add(radioButton2, 1, 1);
        root.add(radioButton3, 2, 1);

        root.add(btn1, 0, 2);



        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();


    }



    public static void main(String[] args) {
        launch(args);
    }
}