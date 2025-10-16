package com.example.javafx_1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GUI2 extends Application {

    public void start(Stage stage) {
        GridPane root = new GridPane();



        Button btn1 = new Button("Zadat");
        Label lbl1 = new Label("Text:");
        Label lbl2 = new Label("Šifra:");


        TextField txf1 = new TextField();
        TextField txf2 = new TextField();


        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){

                String text = txf1.getText();
                String sifra = "";


                for (int i = 0; i < text.length(); i++) {
                    if (text.charAt(i) == ' ' || text.charAt(i) == '.' || text.charAt(i) == '-' || text.charAt(i) == '!' || text.charAt(i) == '?') {
                        char c = text.charAt(i);
                        sifra += c;
                    }else if (text.charAt(i) == 'z') {
                        char c = text.charAt(i);
                        c = 97;
                        sifra += c;
                    }else if (text.charAt(i) == 'Z') {
                        char c = text.charAt(i);
                        c = 65;
                        sifra += c;
                    }else{
                        char c = text.charAt(i);
                        c ++;
                        sifra += c;
                    }

                }

                txf2.setText(sifra);



            }
        }
        );

        root.add(lbl1, 0, 0);
        root.add(txf1, 1, 0);
        root.add(lbl2, 0, 1);
        root.add(txf2, 1, 1);

        root.add(btn1, 0, 6);


        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
